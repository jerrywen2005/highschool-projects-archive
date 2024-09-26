// driver class
public class Test {
	public static void main(String args[])
	{   
	    	System.out.println("Level 1"+ '\n');
        		Bicycle bic = new Bicycle(10, 50); 
        		//creates variable bic under the Bicycle class with gear 10 and speed 50.
       		System.out.println(bic.toString()+ '\n');
       		//runs bic through toString and prints
		MountainBike mb = new MountainBike(3, 100, 25);
		//Creates variable mb under the MountainBike class with gear 3, speed 100 and seat height 25.
		System.out.println(mb.toString() + '\n');
		//runs mb through toString and prints.
		
		System.out.println ("Level 2 " + '\n');
	            	//MountainBike bic2 = new Bicycle(1,2,3);
	            	//error here because the parameters for mountain bike are different from the parameters of Bicycle. Bicycle should only have 2 parameters inputted and not 3.
       		        //System.out.println(bic2.toString() + '\n');
		Bicycle mb2 = new MountainBike(5, 6, 7);
		System.out.println(mb2.toString() + '\n');
		
		System.out.println("Level 3a"+ '\n');
		System.out.println(((Bicycle)bic).toString()+ '\n');
	   	         //System.out.println(((Bicycle)bic2).toString()+ '\n');
	   	         //Bic2 is declard wrong in line 12 and so anywhere that uses bic2 will subsequently be an error.
		//System.out.println(((MountainBike)bic).toString()+ '\n');
		//The MountainBike method requires a seat hight which is not provided with bic2. It's a typcasting error
    	        	//System.out.println(((Mountain)bic2).toString()+ '\n');
    	        	//The name of the class is wrong; It should be MountainBike and not Mountain. 
    	        	
	
	    	System.out.println("Level 3b"+ '\n');
		System.out.println(((Bicycle)mb).toString()+ '\n');
		//the code first runs toString for MountainBike before typecasting, resulting in a seat height output in addition to the no of gears and speed of bicycle.
		System.out.println(((Bicycle)mb2).toString()+ '\n');
		//same as line 29
		System.out.println(((MountainBike)mb).toString()+ '\n');
		System.out.println(((MountainBike)mb2).toString()+ '\n');
		//In lines 33 and 34, thye typecasting is unnessesary because mb and mb2 are already part of the Mountainbike class
		
		
	}
}