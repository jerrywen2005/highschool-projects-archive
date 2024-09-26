import java.util.*;
public class polygon {
    public int arr[][] = new int[2][10];
    
    
    public double perimeter(int arr[][]){
        ArrayList <Double> sides = new ArrayList<Double>();
        double perimeter = 0;
        for(int i = 0; i<10; i++){
            if(arr[0][i+1] != 5000 && arr[1][i+1] != 5000){
                double length = Math.sqrt((arr[0][i+1] - arr[0][i])^2 +(arr[1][i+1] - arr[1][i])^2);
                sides.add(length);
            }
            else{
                double length = Math.sqrt((arr[0][i+1] - arr[0][0])^2 +(arr[1][i+1] - arr[1][0])^2);
                sides.add(length);
            }
            
        }
        for(int i = 0; i < sides.size(); i++){
                perimeter += sides.get(i);
            }
        return perimeter;
    }
}