//Jerry Wen
//3B


package changemaker;

import java.util.Scanner;

public class changemaker {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a monetary value less than $100"); //promt user for input
		double input =scanner.nextDouble();
		
		int fifty = 0;
		int twenty = 0;
		int ten = 0;
		int five = 0;
		int one = 0;
		int quarter = 0;
		int nickel = 0;
		int dime = 0;
		int penny = 0; // declare variables
		
		fifty = (int) (input/50);
		input = input%50;
		
		twenty = (int) (input/20);
		input = input%20;
		
		ten = (int) (input/10);
		input = input%10;
		
		five = (int) (input/5);
		input = input%5;
		
		one = (int) (input/1);
		input = input%1;
		
		quarter = (int) (input/0.25);
		input = input%0.25;
		
		dime = (int) (input/0.10);
		input = input%0.10;
		
		nickel = (int) (input/0.05);
		input = input%0.05;

		penny = (int) (input/0.01);
		input = input%0.01;  //the math part

		System.out.println("Your change is:");
		System.out.println(fifty +" fifty dollar bills");
		System.out.println(twenty +" twenty dollar bills");
		System.out.println(ten +" ten dollar bills");
		System.out.println(five +" five dollar bills");
		System.out.println(one +" one dollar bills");
		System.out.println(quarter +" quarters");
		System.out.println(dime +" dimes");
		System.out.println(nickel +" nickels");
		System.out.println(penny +" pennies"); //output



		
		
		
		
	}

}
