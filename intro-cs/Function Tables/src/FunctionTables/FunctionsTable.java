//Jerry Wen
//9/20/2020
//4B



package FunctionTables;

public class FunctionsTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("Number\tSquare\tSquare Root\tCube\t4th Root"); //Heading
       
       
		for (int x = 1; x<=20; x++) { //Loop
			
			System.out.print(x + "\t" + Math.pow(x,2) + "\t");
		System.out.printf( "%.4f",Math.sqrt(x));
		System.out.print("\t\t" + Math.pow(x,3)+"\t");
		System.out.printf("%.4f", Math.sqrt(Math.sqrt(x)));
		System.out.println();
		//output
		
			int [][] arr = new int[4][5];
			for (int i=0; i<4; i++) {
				for (int k=0; k<4; k++) {
					arr[i][k] = 1;
				}
			}
			System.out.print(arr);
		}
		
	}

}
