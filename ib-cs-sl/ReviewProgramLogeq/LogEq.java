import java.lang.Math;
import java.io.*;
import java.util.*;

public class LogEq
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int K = input.nextInt();
        int I = input.nextInt();
        double r = input.nextDouble();
        
        int t = 0;
        
        
        double e = 2.718;
        
        double A = (K-I)/I; b
        int P = I;
        r = r/100;
        
        
        System.out.println("Year          Answer");
        
        while (P <= K/2){
            
            
            
            P = (int)(K/(1+A*Math.pow(e,-1*r*t)));
            
            System.out.print(t + "          ");
            System.out.println(P);
            
            t++;
            
        }
        
    }
}