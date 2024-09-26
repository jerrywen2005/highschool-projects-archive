class BikeInterface {
      
    public static void main (String[] args) {
      
        // creating an instance of Bicycle 
        // doing some operations 
        Bicycle bicycle = new Bicycle();
        bicycle.changeGear(2);
        bicycle.speedUp(3);
        bicycle.applyBrakes(1);
        bicycle.accelerationUp(2);
        bicycle.accelerationDown(4);
          
        System.out.println("Bicycle present state :");
        bicycle.printStates();
          
        // creating instance of the bike.
        Bike bike = new Bike();
        bike.changeGear(1);
        bike.speedUp(4);
        bike.applyBrakes(3);
        bike.accelerationUp(6);
        bike.accelerationDown(2);
          
        System.out.println("Bike present state :");
        bike.printStates();
    }
}