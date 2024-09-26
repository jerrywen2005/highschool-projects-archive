//Jerry Wen
//9/20/20
//4B

package StringToInteger;

import java.util.Scanner;
public class StringToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner (System.in); //create scanner variable
		
		System.out.println("enter 5 two digit numbers separated by a space"); //promt for user input
		
		String sNumber = input.nextLine(); //take in the string
		
		int sum = 0 ;
		String sub = "";//declare variables
		
		for (int x = 0; x<15; x+=3){
			sub = sNumber.substring(x, x+2); //breaking string into substrings
			int place = Integer.parseInt(sub); //convert the substrings into ints
			
			sum +=place; //adding them together
				
			}
		System.out.println(Integer.toHexString(sum)); //output
		int [][] arr = new int[4][5];
		for (int i=0; i<4; i++) {
			for (int k=0; k<4; k++) {
				arr[i][k] = 1;
			}
		}
		System.out.print(arr);
	}

}
