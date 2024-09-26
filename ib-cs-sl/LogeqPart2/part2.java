import java.lang.Math;
import java.io.*;
import java.util.*;

public class part2{
    
    
    public static double intAverage (int[] arr){
    double sum = 0;
    for(int i=0; i<10; i++){
        
            sum += arr[i];
}
    double output = sum/10;
    return output;
}
    
    public static double doubleAverage (double[] arr){
    double sum = 0;
    for(int i=0; i<10; i++){
        
            sum += arr[i];
}
    double output = sum/10;
    return output;
}

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int K = input.nextInt();
        int I = input.nextInt();
        double r = input.nextDouble();
        
        int t = 0;
        int year = 16;
        
        double e = 2.718;
        
        double A = (K-I)/I;
        int P = I;
        r = r/100;
        
        int[] intarray = new int[10];
        double[] doublearray = new double[10];
        
       
        
        
        while (P <= K/2){
            
            P = (int)(K/(1+A*Math.pow(e,-1*r*t)));
            
            if (P > K/2){
                doublearray[0] = (K/(1+A*Math.pow(e,-1*r*t)));
                intarray[0] = P; 
            }
           
            t++;
                
            }
            
      
        
        for(int i=1; i<10; i++){
            intarray[i] = (int) (K/(1+A*Math.pow(e,-1*r*t)));
            doublearray[i] = (K/(1+A*Math.pow(e,-1*r*t)));
            t++;
        }
        
        double dav = doubleAverage(doublearray);
        double iav = intAverage(intarray);
        
        
         System.out.println("Year    Array Index     Double value    Integer Value");
         t = 16;
        for (int i=0; i<=9; i++){
            int j = i+1;
            
            System.out.printf("%d       %d             %.3f           %d  %n", t , j , doublearray[i] , intarray[i]);
            

        t++;
        }
     
        System.out.printf("Average Double: %.3f\n", (dav));
        System.out.println("Average Integer: " + (iav));
        System.out.printf("Difference: %.3f\n" , (Math.abs(iav - dav)));
        if (Math.abs(dav-iav) > 0.5){
            System.out.println ("They are NOT within 0.5");
            
        }
        else{
            System.out.print("They are within 0.5");
        }
        
    }
}