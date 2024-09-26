import java.util.*;
public class TestAbstract
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.println("do you have a mountain bike, or a motorcycle bike? type 'mountain' 'motor'");
        String BikeType = input.nextLine();
        System.out.println("Is your " + BikeType + " fast or slow?");
        String speed = input.nextLine();
        
       
    
        Motor mymotor = new Motor();
        Mountain mymountain = new Mountain();
       
        
        if(BikeType.equals("mountain")){
            
            System.out.println("What is your tire width?");
            Double TireWidth = input.nextDouble();
            
            if(speed.equals("fast")){
                mymountain.VeichleSpeed("fast");
            
                mymountain.TireSound();
            }
            if(speed.equals("slow")){
                mymountain.VeichleSpeed("slow");
               
                mymountain.TireSound();
            }
            
            String tw = mymountain.TW(TireWidth);
            System.out.println("Your tire width size is " + tw);
        }
        
        if(BikeType.equals("motor")){
            
            System.out.println("What is your max engine speed in rps?");
            Double MaxEngineSpeed = input.nextDouble();
            
            if(speed.equals("fast")){
                mymotor.VeichleSpeed("fast");
                
                mymotor.TireSound();
            }
            if(speed.equals("slow")){
                mymotor.VeichleSpeed("slow");
                
                mymotor.TireSound();
            }
            
            String mes = mymotor.MES(MaxEngineSpeed);
            System.out.println("your motorcycle engine class is the " + mes);
        }
        
        
        
        
        
    }
}