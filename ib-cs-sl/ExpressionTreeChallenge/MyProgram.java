import java.util.*;
public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter an operation in prefix");
        ETree.input =  in.nextLine();
        
        
        
        ETree mytree = new ETree(ETree.input.charAt(0));
        ENode e = mytree.create(0);
        
        mytree.InFixPrint(e);
        System.out.println(" = " + e.value);
        
    }
}