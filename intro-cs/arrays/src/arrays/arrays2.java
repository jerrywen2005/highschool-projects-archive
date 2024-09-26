//Jerry Wen
//4B
//4/15/20


package arrays;
import java.util.Scanner;

public class arrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		
		//declare variables
	int [ ]  [ ] matrix = new int [5][5]; // 5 by 5 array
	int sum = 0;
	
		for (int row = 0; row<5; row ++) { //rows
			for (int column=0; column<5; column++){ //columns
				System.out.println("enter the value for position " +row+ " "+column);
		
				matrix [row][column] = input.nextInt();
					}
		}
		
		
		
		
		for (int row = 0; row<5; row++) { //rows
			for (int column=0; column<5; column++){ //column
				
				sum = sum + matrix [row] [column];
				
				
			}
			int pizza = row+1;
			System.out.println("the sum of row "+pizza+" is "+sum);
			sum=0;
			


					
				}
				
			
		


	
	}
}


