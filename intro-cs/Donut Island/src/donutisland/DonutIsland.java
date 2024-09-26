//Jerry Wen
//3B
package donutisland;


public class DonutIsland {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	double diameter = 4.16;
	double radius = 0.95;
	double pi = 3.14159265359;
	
	double lakearea = radius*radius*pi;
	double totalarea = Math.pow((diameter/2), 2)*pi;
	
	double landarea = totalarea - lakearea;
	
	System.out.println("Donut island with a diameter of 4.16 miles that contains a circular lake of .95 miles has "+landarea+" square miles of cultivatable land.");
}
}