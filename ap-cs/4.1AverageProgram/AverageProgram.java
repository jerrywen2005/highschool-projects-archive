//Jerry Wen
//3B



import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class AverageProgram
{
    public static void main(String[] args)
    {
         Scanner sc = new Scanner(System.in);
         
         //Part 1
         double sum = 0;
         
         for (int x = 0; x<5; x++){
             System.out.println("Enter an integer");
             int input = sc.nextInt();
             
             sum = sum+input;
             
         }
         double average = sum/5;
             System.out.println(average);
             
             
             
             
             
             
             
             //Part 2
             sum = 0;
             int k = 1;
             int x = 0;
         while(x < k){
             System.out.println("Enter an integer");
             int input = sc.nextInt();
             
             System.out.println("Would you like to enter another integer?");
             char c = sc.next().charAt(0);
            
             if(c == 'Y'){
                 k = k+1;
                
             }
              x++;
              
             sum = sum+input;
             
         }
         average = sum/k;
             System.out.println(average);
             
             
             
             
             
             
             //Part 3
             sum = 0;
             k=0;
           
        System.out.println("Enter integers seperated by a space");
        int placeholder=0;
        boolean j = true;
        while (sc.hasNextLine())
            { 
               
                int num = sc.nextInt();
               
              
                sum = sum +num;
                
                
               
             
                k=k+1;
                placeholder = num;
                average = sum/k;
              
               System.out.println(average+ " ");
            }
            
            sc.close();
            
            
            
            //Part 4
            
            sum = 0;
            k=0;
           while (sc.hasNextLine()){
            // actually reads a line from the file
            String input = sc.nextLine();
            
            
            // parse the string using a scanner object
            Scanner sc2 = new Scanner (input);  
            sc2.useDelimiter(",");
            
            while (sc2.hasNext()){
                
                int s = sc2.nextInt();
                sum = sum+s;
                 k=k+1;
                 average = sum/k;
              
              
            }
            System.out.println(average+ " ");
        sc2.close();
        }
        
             sc.close();
             
             
    }
}