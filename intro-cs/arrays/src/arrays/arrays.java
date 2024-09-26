//Jerry Wen
//4B
//4/15/20


package arrays;
import java.util.Scanner;
import java.lang.Math;
public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
	System.out.println("enter array row count");
	int x = input.nextInt();
	
	System.out.println("enter array column count");
	int y = input.nextInt();
	int [ ]  [ ] matrix = new int [x][y]; // the size of the array
	
	
		for (int row = 0; row<matrix.length; row++) { //rows
			for (int column=0; column<matrix[0].length; column++){ //columns
				System.out.println("enter the value for position");
				System.out.println(+row+", "+column);
				int s =input.nextInt();
				matrix [row][column] = s;
				
				if ( s % 2 == 0 ) {
			        s=0;
				}
			     else
			       s=1;
			     matrix [row][column] = s;
			     
			}
			
			
				
				}
		System.out.println("Your new matrix is: ");

		for (int row = 0; row<matrix.length; row++) { //rows
			for (int column=0; column<matrix[0].length; column++){ //column
				
				System.out.print(+matrix [row][column]);
				
				
			}
			System.out.println();
			}


					
				}
				
			
		


	
	}

