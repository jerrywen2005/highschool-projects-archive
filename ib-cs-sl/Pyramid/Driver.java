import java.util.*;
public class Driver
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to do a 'triangle' or a 'pyramid'?");
        String shape = input.nextLine();
        System.out.println("Would you like to use the default values or input youre own values? type 'default' or 'custom values'");
        String condition = input.nextLine();
        
        
        if(condition.equals("default")){
            if(shape.equals("triangle")){
                IsoTri tri = new IsoTri();
                System.out.println(tri.toString());
            }
            if(shape.equals("pyramid")){
                Pyramid pyr = new Pyramid();
                System.out.println(pyr.toString());
            } 
        }
        
        if(condition.equals("custom values")){
            if(shape.equals("triangle")){
                System.out.println("Enter height then base");
                double height = input.nextDouble();
                double base = input.nextDouble();
                IsoTri tri = new IsoTri(height,base);
                System.out.println(tri.toString());
            }
            if(shape.equals("pyramid")){
                System.out.println("Enter height, then base then the number of sides");
                double height = input.nextDouble();
                double base = input.nextDouble();
                int sides = input.nextInt();
                Pyramid pyr = new Pyramid(height, base, sides);
                System.out.println(pyr.toString());
            }
            
        }
    }
}