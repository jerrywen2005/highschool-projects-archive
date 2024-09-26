import java.util.*;
class Mountain extends Bike {
    
      public String sound;
      public double TireWidth;
      
      public Mountain (double TireWidth){
          this.TireWidth = TireWidth;
      }
      public Mountain (){
          TireWidth = 1.8;
      }
      
      public String TW(double TireWidth){
         if(TireWidth < 2.4){
             return "small";
         } 
         else{
             return "big";
         }
      }
      
      
      public void VeichleSpeed (String speed){
        if (speed.equals("fast")){
            sound = "EEEEEEEEEE";
        }
        if (speed.equals("slow")){
            sound = "EEEEE";
        }
    }
    
        public void TireSound(){ 
        System.out.println("The tire sound of your mountain bike is skk" + this.sound + "t" );
    }
    
}