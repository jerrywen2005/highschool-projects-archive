package ACSL;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;



class Result {

    /*
     * Complete the 'rearrangeString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER n
     */

    public static String rearrangeString(String s, int n) {
        
        ArrayList<String> one = new ArrayList<String>();
        ArrayList<String> two = new ArrayList<String>();
        ArrayList<String> three = new ArrayList<String>();
        ArrayList<String> four = new ArrayList<String>();
        ArrayList<String> five = new ArrayList<String>();
        ArrayList<String> six = new ArrayList<String>();
        ArrayList<String> seven = new ArrayList<String>();
        ArrayList<String> eight = new ArrayList<String>();
        ArrayList<String> nine = new ArrayList<String>();
        String nine1 = "";
        String eight1 = "";
        String seven1 = "";
        String six1 = "";
        String five1 = "";
        String four1 = "";
        String three1 = "";
        String two1 = "";
        String one1 = "";
        
        
        char placeholder = ' ';
        int count = 1;
        
        
        for(int i=0; i<=s.length(); i++){ //going through string and sorting
            String tree = s+" ";
            char letter = tree.charAt(i);
          
            if (placeholder != letter){
                  
                if (count==9 ){
                    for (int a=0; a<9; a++){
                        nine1 = nine1+placeholder;
                    }
                    nine.add(nine1);
                }
                
                if (count==8 ){
                    for (int a=0; a<8; a++){
                        eight1 = eight1+placeholder;
                    }
                    eight.add(eight1);
                }
                
                if (count==7 ){
                    for (int a=0; a<7; a++){
                        seven1 = seven1+placeholder;
                    }
                    seven.add(seven1);
                }
                
                if (count==6 ){
                    for (int a=0; a<6; a++){
                        six1 = six1+placeholder;
                    }
                    six.add(six1);
                }
                
                if (count==5 ){
                    for (int a=0; a<5; a++){
                        five1 = five1+placeholder;
                    }
                    five.add(five1);
                }
                
                if (count==4 ){
                    for (int a=0; a<4; a++){
                        four1 = four1+placeholder;
                    }
                    four.add(four1);
                }
                
                if (count==3 ){
                    for (int a=0; a<3; a++){
                        three1 = three1+placeholder;
                    }
                    three.add(three1);
                }
                
                if (count==2 ){
                    for (int a=0; a<2; a++){
                        two1 = two1+placeholder;
                    }
                    two.add(two1);
                }
                
                if (count==1 ){
                    
                        one1 = one1+placeholder;
                    
                    one.add(one1);
                }
                
                nine1 = "";
                eight1="";
                seven1="";
                six1="";
                five1="";
                four1="";
                three1="";
                two1="";
                one1="";
                
                
            }
            
            if (placeholder == letter){
                count = count+1;
            }
            
            if (placeholder != letter){
                count = 1;
            }
            
            placeholder = letter;
            
        }
        
        Collections.sort(one); //sorts alphabetical order
        Collections.sort(two);
        Collections.sort(three);
        Collections.sort(four);
        Collections.sort(five);
        Collections.sort(six);
        Collections.sort(seven);
        Collections.sort(eight);
        Collections.sort(nine);
        
        String output = "";  
        for (String temp : nine){ //arraylist to string
            output = output + temp;
        }
         for (String temp : eight){
            output = output + temp;
        }
         for (String temp : seven){
            output = output + temp;
        }
         for (String temp : six){
            output = output + temp;
        }
         for (String temp : five){
            output = output + temp;
        }
         for (String temp : four){
            output = output + temp;
        }
         for (String temp : three){
            output = output + temp;
        }
         for (String temp : two){
            output = output + temp;
        }
         for (String temp : one){
            output = output + temp;
        }
        output = output.replaceAll("\\s", "");
        
        
        placeholder = ' ';
        count = 1;
        
        ArrayList<Character> ch = new ArrayList<Character>();
        for(char c : output.toCharArray()){
            ch.add(c);
        }
        ch.add(' ');
         for (int k = 0; k<ch.size(); k++){
            char letter =  ch.get(k);
            
         if (placeholder == letter )  {
              count = count+1;
          }
          else{
              count  = 0;
          
          }
          if (count>=n){
              ch.set(k-1, ' ');
          }
          placeholder = letter;
         }
        output = "";
         for (Character temp : ch){
            output = output + temp;
        }
        
        output = output.replaceAll("\\s", "");
        return output;
        
        
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.rearrangeString(s, n);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
