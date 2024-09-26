import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
public class MyProgram
{
    public static void main(String[] args) throws FileNotFoundException
    {
        File data = new File("data.txt");
        Scanner input = new Scanner(data);
        
        polygon mypolygon = new polygon();
        
        for(int i=0; i<10; i++){
            String abe = input.nextLine();
            mypolygon.arr[0][i] = Integer.parseInt(abe.substring(0,1));
            mypolygon.arr[1][i] = Integer.parseInt(abe.substring(2,3));
        }
    }
}