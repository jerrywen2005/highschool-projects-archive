import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        
        ArrayList<RectPrism> list = new ArrayList<RectPrism>();
        
        for(int i = 0; i<10; i++){
            int a = (int)(Math.random()*10+1);
            int b = (int)(Math.random()*10+1);
            int c = (int)(Math.random()*10+1);
            list.add(new RectPrism(a, b, c));
            
        } 
        
        System.out.println("Unsorted List:");
        for(int i = 0; i<10; i++){
           System.out.println(list.get(i).toString());
           
        }
        
        
        for (int k=0; k<10; k++){
        for (int i = 1; i<10; i++){
            if(list.get(i-1).compareTo(list.get(i))>0){
                
                list.add(i+1, list.get(i-1));
                list.remove(i-1);
            }
        }
        }
        System.out.println();
        System.out.println("Sorted List:");
        for(int i = 0; i<10; i++){
           System.out.println(list.get(i).toString());
           
        }
        
    }
}