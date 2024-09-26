//Jerry Wen
// 4/30/2020
package arrays;
import java.util.Scanner;
public class arrays3 {

	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scanner = new Scanner(System.in);
	int length = 9000; //array length will be determined by user input
	int [] array = new int [length-1]; // length-1 instead of length because arrays include 0.
	
	System.out.println("how big do you want your array?");
	length = scanner.nextInt(); //user input for array length
	
	for (int p= 1; p<=length; p++) {
		System.out.println("what positive integer do you want in array slot " +p); //user input for slot p, starting from 1.
		int input = scanner.nextInt();
		if(input >9) {
			input = input % 10;
			
		}
		array [p] = input ;
		
	}
	System.out.print("your new and improved array is : [");// printing out the new array
	for( int x = 1; x<=  length; x++) {
		int g = array[x];
		if (x==length) {
			System.out.print(g+"");
		}
		else {
		System.out.print(g+",");
		}
		
	}
	System.out.print("]");
}
}