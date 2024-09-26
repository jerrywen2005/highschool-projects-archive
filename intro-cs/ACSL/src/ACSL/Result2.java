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




class Result {

    /*
     * Complete the 'sumSmallestInVisitedCells' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING rows_cols
     *  2. STRING array1
     *  3. STRING array2
     *  4. STRING array3
     */

    public static int sumSmallestInVisitedCells(String rows_cols, String array1, String array2, String array3) {

String[] rowcol = rows_cols.split(" ");


int col = Integer.parseInt(rowcol[0]);
int row = Integer.parseInt(rowcol[1]);

String[] one = array1.split(" ");
String[] two = array2.split(" ");
String[] three = array3.split(" ");

int[] one1 = new int[one.length];
for(int i = 0; i < one.length; i++) {
    one1[i] = Integer.parseInt(one[i]);
}
int[] two1 = new int[two.length];
for(int i = 0; i < two.length; i++) {
    two1[i] = Integer.parseInt(two[i]);
}
int[] three1 = new int[three.length];
for(int i = 0; i < three.length; i++) {
    three1[i] = Integer.parseInt(three[i]);
}
int[][] arr1 = new int [row][col];
int[][] arr2 = new int [row][col];
int[][] arr3 = new int [row][col];


    for (int k=0; k < row; k++){
        for (int j=0; j<col; j++){
            arr1[k][j] = one1[row];
        }
    }
    for (int k=0; k < row; k++){
        for (int j=0; j<col; j++){
            arr2[k][j] = two1[row];
        }
    }
    for (int k=0; k < row; k++){
        for (int j=0; j<col; j++){
            arr3[k][j] = three1[row];
        }
    }
    
    ArrayList<Integer> path1 = new ArrayList<Integer>();
    ArrayList<Integer> path2 = new ArrayList<Integer>();
    ArrayList<Integer> path3 = new ArrayList<Integer>();
    
    
    boolean end = false;
    int i = 0;
    int k = 0;
    while(end = false){
        
            path1.add(arr1[i][k]);
            
            if(arr1[i+1][k]>arr1[i][k+1]){
                i+=1;
            }
            if(arr1[i+1][k]<arr1[i][k+1]){
                k+=1;
            }
            if(arr1[i+1][k]==arr1[i][k+1]){
                i+=1; k+=1;
            }
          if(i==row-1 || k==col-1){
                end = true;
            }
            
        }
        
        i=0;
        k=0;
        end = false;
    
       while(end = false){
        
            path2.add(arr2[i][k]);
            
            if(arr2[i+1][k]>arr2[i][k+1]){
                i+=1;
            }
            if(arr2[i+1][k]<arr2[i][k+1]){
                k+=1;
            }
            if(arr2[i+1][k]==arr2[i][k+1]){
                i+=1; k+=1;
            }
          if(i==row-1 || k==col-1){
                end = true;
            }
            
        }
        
         i=0;
        k=0;
        end = false;
    
     while(end = false){
        
            path3.add(arr3[i][k]);
            
            if(arr3[i+1][k]>arr3[i][k+1]){
                i+=1;
            }
            if(arr3[i+1][k]<arr3[i][k+1]){
                k+=1;
            }
            if(arr3[i+1][k]==arr3[i][k+1]){
                i+=1; k+=1;
            }
            if(i==row-1 || k==col-1){
                end = true;
            }
            
        }
        
    Collections.sort(path1);
    Collections.sort(path2);
    Collections.sort(path3);

    int sum = path1.get(0)+path2.get(0)+path3.get(0);

    return sum;
    
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String rows_cols = bufferedReader.readLine();

        String array1 = bufferedReader.readLine();

        String array2 = bufferedReader.readLine();

        String array3 = bufferedReader.readLine();

        int result = Result.sumSmallestInVisitedCells(rows_cols, array1, array2, array3);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
