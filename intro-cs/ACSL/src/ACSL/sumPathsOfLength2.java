package ACSL;

public class sumPathsOfLength2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			
		String edges = "12 21 13 15 53 33";
		 char first = ' ';
	        char second = ' ';
	        char third = ' ';
	       
	        int pizza;
	        int sum = 0;
	        
	        
	        for (int i=0; i<edges.length(); i++){
	            if(i%3==0){
	             first = edges.charAt(i);
	        
	             second = edges.charAt(i+1);
	            
	            
	             for (int j=0; j<edges.length(); j++){
	                 
	                  if(j%3==0){
	                 if(second == edges.charAt(j)){
	                     third = edges.charAt(j+1);
	                     
	                         if(third != first && third!=second && first!= second) {
	                             String join= "";
	                            join = join + first + second + third;
	                          pizza = Integer.parseInt(join);
	                          
	                          
	                          sum +=pizza;
	                         }
	                 }
	                  }
	                     
	                     
	                 }
	             }
	        
	        
	       }
	      System.out.print(sum);
	    }}