public class Bike implements Vehicle, Locomotion {
    public int speed;
    public int gear;
    public int acceleration;
    
    public Bike(){
        speed = 10;
        gear = 4;
        acceleration = 2;
    }
    
     public void Bike(int speed, int gear, int acceleration){
        this.speed = speed;
        this.gear = gear;
        this.acceleration = acceleration;
    }
    
    public void changeGear(int a){
        gear = a;
    }
    
    public void speedUp(int a){
        speed = speed + 2*a;
    }
    
    public void applyBrakes(int a){
        if(speed - a >= 0){
            speed = speed - a;
        }
        else{
            speed = 0;
        }
        
    }
    
    public void accelerationUp(int a){
        acceleration = acceleration + 2*a;
    }
    public void accelerationDown(int a){
        if(acceleration - 2*a >=0){
          acceleration = acceleration - 2*a;  
        }
        else{
            acceleration = 0;
        }
    }
    
    public void printStates(){
        System.out.println("Speed: " + speed + " Gear: " + gear + " acceleration: " + acceleration);
    }
}