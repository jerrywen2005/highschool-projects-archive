public class Magic {
     public static boolean isItMagic(int [] [] arr){
        
        int[] result = new int[arr.length];
        int total;
        boolean magic = true;

         for (int i = 0; i < arr.length; i++) { //sum of each row

        total = 0;

        
        for (int k = 0; k < arr[i].length; k++) {
            total += arr[i][k];
        }
        
        result[i] = total;
       
    }
    int placeholder = result[0];
    
    for(int i=1; i<result.length; i++){ //check if rows equal
        
        if(placeholder != result[i]){
            magic = false;  
        }
    }
            
                result = new int[arr[0].length]; //sum of each column
            for (int i = 0; i < arr[0].length; i++) {

        total = 0;

     
        for (int k = 0; k < arr.length; k++) {
            total += arr[k][i];
        }
        
        result[i] = total;
       
    }//check if columns equal
     for(int i=1; i<result.length; i++){
        
        if(placeholder != result[i]){
            magic = false;  
        }
    }   
            
            // sum of diagnals
             int major = 0, minor = 0; 
        for (int i = 0; i < arr.length; i++) { 
            for (int j = 0; j <arr.length; j++) { 
      
                if (i == j) 
                    major += arr[i][j]; 
      
                if ((i + j) == (arr.length - 1)) 
                    minor += arr[i][j]; 
            } 
            
            
        } //check if diagnals equal
        if(placeholder != major){
            magic = false;  
        } 
          if(placeholder != minor){
            magic = false;  
        } 
            
            
            
     
      return magic;
    
        }
        public static void main(String[] args) {
        }
    }