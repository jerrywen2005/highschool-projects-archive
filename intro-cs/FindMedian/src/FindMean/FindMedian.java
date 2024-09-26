package FindMean;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class FindMedian {

	public static double findMean(int[] arr) {
		int length = arr.length;
		int sum = 0;
		for (int i = 0; i < length; i++) {
			sum += arr[i];
		}
		double mean = (double) sum / length; // remember to typecast to double
		return mean;
	}

	public static double findMedian(int []arr){
		bubbleSort(arr);
		double length = arr.length;
		double middle = length / 2;
		double median =  arr[(int) middle];
		if ((int) middle == middle ) {
			median = arr[(int) middle];
		}
		else {
			median = (arr[(int) ((int)middle  + 0.5)] + arr[(int) ((int)middle  - 0.5)]) / 2;
		}
		return median;
    
	}

  // 0 1 2 3 4  (length 5); l/2 = 2
	
	public static void bubbleSort(int []arr){
		for (int i = 0; i<arr.length; i++){
			for (int j = 0; j<arr.length; j++){
				if (arr[i]>arr[j]){
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
					
			}
		}
	}
  
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("dataSamples.txt");
		Scanner sc = new Scanner(file);
		int x = 10; // number of elements in the array
		
		int[] arr = new int[x];

		for (int i = 0; i < x; i++) { //input to the array
			arr[i] = sc.nextInt();
		}
	
  	double mean = findMean(arr); //find mean and assign to variable called mean
  	System.out.println(mean);
   // System.out.println(findMean(arr));
		
		bubbleSort(arr); // after i call this, arr is sorted;
		for (int element: arr){
			System.out.println(element);	
		}

    //utilize findMedian method here
    System.out.println(findMedian(arr));
		sc.close();
	}

}