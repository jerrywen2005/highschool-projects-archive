public class MoneyRunner {
	
	public static void main(String[] args) {
	    Money money1 = new Money (100, 0);
	    Money money2 = new Money (45, 12);
	    
	    Money change = Money.sub(money1, money2);
	    System.out.println(change);
		/* 1. Create two Money objects.
		 * 		Construct one object with $100 and the other to $45.12.
		 * 		These represent the money used to pay for a purchase and
		 * 		the amount of the purchase.
		 * 		Using the methods in the Money class, calculate and
		 * 		print out the change.
		 */
		
	    Money money3 = new Money (55, 18);
	    Money money4 = new Money (30, 99);
	    
	    Money sum = Money.add(money3, money4);
	    System.out.println(sum);
		/* 2. Create two Money objects
		 * 		Construct one object with $55.18 and the other to $30.99
		 * 		These represent two items to purchase.
		 * 		Calculate and display the total.
		 * 
		 */
	
	    Money money5 = new Money (0, 0);
	    Money money6 = new Money (10, 50);
	    
	    money5 = new Money(money6.getDollars(), money6.getCents());	
	    System.out.println(money5);
		/* 3. Create two Money objects
		 * 		Construct object1 with $0 and the object2 to $10.50
		 * 		Use the setter to set object1 to the same value of object2
		 * 		using object2 accessor methods. DO NOT DIRECTLY SET OBJECT1 to $10.50!! 
		 * 		Add the two objects and display the resulting object.
		 */
		
	    Money money7 = new Money (110, 80);
	    Money money8 = new Money (100, 0);
	    Money sub = Money.sub(money8, money7);
	    System.out.println(sub);
	    System.out.println("WARNING! You do not have enough money to make this purchase!");
		/* 4. Create two Money objects
		 * 		Construct object1 with $110.80 which represents
		 * 		the purchase amount. Construct object2 with $100 which is the
		 * 		amount of money the buyer wants to use to purchase.
		 * 		Since object2<object1 print out a warning that the buyer
		 * 		does not have enough money to purchase
		 * 		What happens if you call the Money.sub(a,b) method if a<b?
		 *///it prints a negative value
	    
	    
	    Money money9 = new Money (15, 18);
	    Money money10 = new Money (30, 40);
	    Money add = Money.add(money9, money10);
	    int cents = add.getCents();
	    System.out.println(add);
	    if (cents>50) {
	    	System.out.println("Would you like to round your purchase up to the nearest dollar amount to donate to charity?");
	    }
		/* 5. Create two Money objects
		 * 		Construct one object with $15.18 and the other to $30.40
		 * 		These represent two items to purchase.
		 * 		Calculate and display the total. If the cents>50 ask the buyer
		 * 		if he wishes to round up his purchase to the nearest dollar amount and 
		 * 		donate the change. Display the new total and the amount donated to 
		 * 		charity
		 */
	}

}