import java.util.*;
class Motor extends Bike{
    
     public String sound;
     public double MaxEngineSpeed;
     
     
     public Motor(double MaxEngineSpeed){
         this.MaxEngineSpeed = MaxEngineSpeed;
     }
     public Motor(){
         MaxEngineSpeed = 8000;
     }
     
     public String MES(double MaxEngineSpeed){
         if(MaxEngineSpeed < 9500){
             return "turtle class";
         }
         else{
             return "lightning class";
         }
     }
     
     public void VeichleSpeed (String speed){
        if (speed.equals("fast")){
            sound = "RRRRRRRRRR";
        }
        if (speed.equals("slow")){
            sound = "RRRRR";
        }
    }
    
    
    
    public void TireSound(){ 
        System.out.println("The tire sound of your motor bike is SKII" + this.sound + "T");
    }
}