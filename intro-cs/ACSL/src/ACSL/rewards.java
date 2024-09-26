package ACSL;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class Result1 {

    /*
     * Complete the 'sumOfLastRow' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER s
     *  2. INTEGER d01
     *  3. INTEGER r
     */
    
    public static String toBaseTen(String str){
        return Integer.toString(Integer.parseInt(str, 8),10);
    }

    public static int sumOfLastRow(int s, int d, int r) {
        String ss = Integer.toString(s);
        String dd = Integer.toString(d);
        
        ss = toBaseTen(ss);
        dd = toBaseTen(dd);
        
        s = Integer.valueOf(ss);
        d = Integer.valueOf(dd);
System.out.print(s);
        int numbercount = 0;
        int value = 0;
        int sum = 0;
        for(int rows = 1; rows<=r; rows++){
            int nperRow = 0;
            while ( nperRow<rows){
                value = s+d*numbercount;
                
                  if (r==rows){
                sum = sum+value;
                
            }numbercount = numbercount+1;
                nperRow = nperRow + 1;
            }
            nperRow = 0;
                  }
                   return sum;
    }
}
public class rewards {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int s = Integer.parseInt(bufferedReader.readLine().trim());

        int d = Integer.parseInt(bufferedReader.readLine().trim());

        int r = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result1.sumOfLastRow(s, d, r);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}