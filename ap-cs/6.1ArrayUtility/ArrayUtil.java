public class ArrayUtil {
    //static methods to work on an array of integers
	
	//return max value of array
	public static int findMax (int []arr){
		int max = arr[0];
		for (int i = 1; i<arr.length;i++){
			if (arr[i]>max)
				max=arr[i];
		}
		return max;
	}
	
	//return minimum value of array
	public static int findMin (int []arr){
			int min = arr[0];
		for (int i = 1; i<arr.length;i++){
			if (arr[i]<min)
				min=arr[i];
		}
		
        // code goes here
		return min;
	}
	
	//return the sum of the array
	public static int arrSum (int []arr){
	
	int sum = arr[0];
		for (int i = 1; i<arr.length;i++){
				sum = sum+arr[i];
		}
        // code goes here		
		return sum;
	}
	
	//return the average of the elements
	//of the array
	public static double arrAverage(int[] arr){
	    double sum = arr[0];
		for (int i = 1; i<arr.length;i++){
				sum = sum+arr[i];
		}
		double avg = sum/arr.length;
        // code goes here	
	    return avg;
	}
	
	//look for a specific value in an array.
	//return true if the value exists in the array,
	//return false if it does not.
	public static boolean hasValue(int[]arr, int value){
	    boolean boo = true;
	   for (int i = 1; i<arr.length;i++){
				if(arr[i]==value){
				  boo = true;  
				  break;
				}
				else{
				    boo = false;
				}
		}
        // code goes here	
            return boo;
	}
	
	//determines if duplicate values exist
	//in the array
	public static boolean hasDuplicate(int[] arr){
	    boolean boo = true;
	    for (int i = 1; i<arr.length;i++){
	         for (int k = 1; i<arr.length;i++){
	             if (arr[i]==arr[k]){
	                 boo = true;
	                 break;
	             }
	             else{
	                 boo = false;
	             }
	         }
	        
	    }
        // code goes here		
		return boo;
	}
	
	//return a new array with reverse order from the original
	public static int[] reverse (int []arr){

		int [] temp = new int[arr.length];
		for (int i = 0; i<arr.length;i++){
		    temp[i]=arr[arr.length-i-1];
		}
        // code goes here		
		
		return temp;
	}
	
	//return a new array with elements shifted
	//left or right for a certain number of spaces
	//precondition: the number of spaces will be less
	//than or equal to the number of elements in the array.
	//direction = 'l' for left and 'r' for right
	public static int[] shift(int[]arr, char direction,int spaces){
		int []temp = new int [arr.length];
	
	    if (direction == 'l'){
	      for (int i = arr.length - spaces-1; i>=0;i--){
	            temp[i] = arr[i+spaces];
	        	}
	    }
	    if (direction == 'r'){
	    	
	    	for (int i = spaces; i<arr.length;i++){
	            temp[i] = arr[i-spaces];
	        	}
	    }
		
		
        // code goes here		
		return temp;
	}
	public static int[] rotate (int[]arr, char direction,int spaces){
		int []temp = new int [arr.length];
		int[] holder = new int[spaces];
	
	    if (direction == 'l'){
	        
	        for (int k = 0; k<holder.length; k++){
	            holder[k] = arr[k];
	        }
	        for (int i = arr.length - spaces-1; i>=0;i--){
	            temp[i] = arr[i+spaces];
	        	}
	        for (int j = 0; j<spaces; j++){
	          
	            temp[j+arr.length - spaces]= holder[j];
	        }
	       
	    }
	    if (direction == 'r'){
	        
	    	   for (int k = 0; k<holder.length; k++){
	            holder[k] = arr[k+arr.length-spaces];
	        }
	    	
	    	for (int i = spaces; i<arr.length;i++){
	            temp[i] = arr[i-spaces];
	        	}
	        	
	        for (int j = 0; j<spaces; j++){
	          
	            temp[j]= holder[j];
	        }
	    }
		
		
        // code goes here		
		return temp;
	}
}