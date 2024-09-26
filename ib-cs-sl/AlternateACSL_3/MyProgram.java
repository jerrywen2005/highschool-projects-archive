import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
public class MyProgram
{
    public static void main(String[] args) throws FileNotFoundException
    {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        File data = new File("data.txt");
        Scanner input = new Scanner(data);
        
        for(int i=0; i<10; i++){
            int abe = input.nextInt();
            arr.add(abe);
        }
        boolean cont = true;
        while(cont == true){
            for(int i=0; i<10; i++){
            arr.set(i, array.change(arr.get(i)));
            }
            if(array.single(arr) == true){
                cont = false;
            
        }
        }
        for(int i=0; i<10; i++){
            System.out.print(arr.get(i));
        }
        System.out.println();
        System.out.println("number of 0s: " + array.getZero(arr));
        System.out.println("the sum is: " + array.sum(arr));
        
        if(array.sum(arr) % 2 == 0){
            System.out.println("the largest value is: " + array.type(arr));
        }
        else{
            System.out.println("the smallest value is: " + array.type(arr));

        }
        
        
    }
    
}