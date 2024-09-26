import java.util.*;
public class array {
    
    public static int change(int x){
        if(x>9){
            int last = x%10;
            
            while(x>=10){
                x/=10;
            }
            int first = x;
            int product = first * last;
            return product;
        }
        else{
            return x;
        }
    }
    
    public static boolean single(ArrayList<Integer> x){
        for(int i=0; i<x.size(); i++){
                if(x.get(i) < 10){
                    continue;
                }
                else{
                    return false;
                }
            }
            return true;
    }
    public static int getZero(ArrayList<Integer> x){
        int zeros = 0;
        for(int i=0; i<x.size(); i++){
            if(x.get(i) == 0){
                zeros += 1;
            }
        }
        return zeros;
    }
    public static int sum(ArrayList<Integer> x){
        int sum = 0;
        for(int i=0; i<x.size(); i++){
            sum += x.get(i);
        }
        return sum;
    }
    public static int type(ArrayList<Integer> x){
        if(sum(x) % 2 == 0){ //largest
            int largest = 0;
            for(int i=0; i<x.size(); i++){
            if(x.get(i) > largest){
                largest = x.get(i);
            }
        }
        return largest;
        }
        else{ //smallest
            int smallest = 100;
            for(int i=0; i<x.size(); i++){
            if(x.get(i) < smallest){
                smallest = x.get(i);
            }
        }
        return smallest;
        }
    }
}