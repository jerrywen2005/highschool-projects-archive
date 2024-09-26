//Jerry Wen
//4B
//4/15/20
package FunnyCalculator;
import java.util.Scanner;
public class FunnyCalculator {
	
		static // TODO Auto-generated method stub
	Scanner input = new Scanner(System.in);
	

	
	//methods
		public static int a (int a, int b) {
			int output = b*a+(b-(b-a));
			return output;
		}
		public static int b (int a, int b){
			int output = (a+b)*(a+b);
			return output;
		}
		public static int c (int a, int b) {
			int output = (a/b)*(a-(b));
			return output;
		}
		public static int d (int a,  int b) {
			int output = (int) Math.pow(a, b);
			return output;
		}
		
		
		
			
			public static void main(String[] args) {
				
			
		//user input variables
		char o;
		int a;
		int b;
		
		
		System.out.println("Enter either a, b, c, or d followed by 2 values. leave a space between each character");
	
		o = input.next().charAt(0);
		
		
		a = input.nextInt();
		b = input.nextInt();
		
		
	switch(o) {
	
	case ('a'): 
		
			int output=    	a(a,b);
	System.out.println("Your answer is: "+output);
	break
	;
	case ('b'):
		output=    	b(a,b);
	System.out.println("Your answer is: "+output);
	break;
	case ('c'):
		output=    	c(a,b);
	System.out.println("Your answer is: "+output);
	break;
	case ('d'):
		output=    	d(a,b);
	System.out.println("Your answer is: "+output);
		break;
	default:
		System.out.println("invalid input");
	}
	}
}

//a 6 8  will perform the operation 8*6+(8-(8-6))
//b 7 5 will perform the operation (7+5)*(7+5)
//c 9 -3 will perform the operation (9/-3)*(9 - (- 3))
//d 5 3 will perform the operation 5*5*5 (you may use Math.pow)
