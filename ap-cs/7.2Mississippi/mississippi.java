import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class mississippi
{
   
    
    public static ArrayList <Character> uniqueLetters (String s){
         ArrayList <Character> arrl = new ArrayList <Character>();
          boolean temp = true;
        String str = s.toUpperCase();
        
       arrl.add(str.charAt(0));
        
         for (int i = 1; i<=str.length()-1; i++){
            
            temp = true; //reset
            
            
        for (int j = 0; j<= arrl.size()-1; j++){
                if (str.charAt(i) == arrl.get(j)){ // duplicate
                    temp = false; 
                }
            }
            
            boolean notspace = true;
            if (str.charAt(i) == ' '){
                notspace = false;
            }
            else{
                notspace = true;
            }
        if (temp == true  && notspace == true){ // if not dupe and not space
               arrl.add(str.charAt(i)); 
            } 
               
        }
        return arrl;
    }
    
     public static void sSort (ArrayList <Character> arrl){
  
      
       
        ArrayList<Character> arrl2 = new ArrayList<Character>();
          arrl2 = arrl;
     for (int i=0; i<arrl2.size(); i++) {
        
        char let = (arrl2.get(i));
         int Val = (int) let;
         int  minVal = (int) let;
         int Index = i;
        
            for(int j=i; j<arrl2.size(); j++) {
              char holder = arrl2.get(j);
            int val2 = (int) holder;
            
            if (val2 < minVal) {
                minVal = val2; //finding smallest value
                Index = j;
            }
        }
       if(minVal < Val) {
   arrl2.set(i, arrl2.set(Index, arrl2.get(i))); //swap places
}
            }

    }
    
        public static int bSearch(ArrayList <Character> arrl , char target){
        int l = 0;
        int  r = arrl.size() - 1;  
        
        while (l <= r) {  
            int mid = l + (r - l) / 2;  
    
     
            if (arrl.get(mid).equals(target)){ //check middle
                return mid;  
            }
    
             
          if (arrl.get(mid) < target){ //check left
                l = mid + 1;  
            }
              
          else{ // check right
                r = mid - 1;  
            }
       }
    
        
        return -1;  //target letter not found
         }
    
     public static void main(String[] args) throws FileNotFoundException
     {
        
        //collect data from data file
        File data = new File("data.txt");
        Scanner sc = new Scanner(data);
       
       while (sc.hasNextLine())
            {
                 String input = sc.nextLine();
               char tl= input.charAt(input.length()-1); //target letter
              tl = Character.toUpperCase(tl);
                 input = input.substring(0, input.length()-2); //city
                
                //output stuff
                 ArrayList <Character> arrl = uniqueLetters(input);
                System.out.println ("Unsorted: " + arrl);
                 sSort (arrl);
                 System.out.println("Sorted: " + arrl);
               int loc = bSearch(arrl, tl);
                System.out.println("The target letter, " + tl + ", is at location: " + loc + "\n");
        }
   
        
            }
    }