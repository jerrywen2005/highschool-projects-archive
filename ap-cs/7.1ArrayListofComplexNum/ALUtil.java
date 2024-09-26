import java.util.*;

public class ALUtil {
   
        
           public static boolean push (ArrayList<ComplexNum>cnList, ComplexNum newElement) {
            
            boolean boo = cnList.add(newElement);
            return boo;
        }
        
        public static ComplexNum popQ (ArrayList<ComplexNum> cnList){
            
            ComplexNum first = cnList.get(0);
            cnList.remove(0);
            
            return first;
            
        }
        
        public static ComplexNum popS (ArrayList<ComplexNum> cnList){
            ComplexNum top = cnList.get(cnList.size()-1);
            cnList.remove(cnList.size()-1);
            
            return top; 
            
        
    }
    public static void reverse (ArrayList<ComplexNum>cnList){
        ArrayList <ComplexNum> temp = new ArrayList <ComplexNum>();
        
        for(int i = 0; i< cnList.size(); i++){
            temp.add(cnList.get(i));
        }
        for (int i = 0; i< cnList.size(); i++){
            cnList.set(i, temp.get(temp.size()-1-i));
        }
        }
        
        
    }