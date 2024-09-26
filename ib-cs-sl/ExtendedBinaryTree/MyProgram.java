import java.util.Scanner;
public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        
        
        System.out.println("Enter a String");
        String in = input.nextLine();
        
        BTree mytree = new BTree(in.charAt(0));
        int length = in.length();
        
        for (int i = 1; i < length; i++){
            mytree.add(in.charAt(i));
        }
        
        
        mytree.InFixPrint(mytree.getRoot());
        
        
        System.out.println("tree depth: " + mytree.getMaxDepth(mytree.getRoot()));
        
        System.out.println("Enter a depth to search");
        int depth = input.nextInt();
        System.out.println("found nodes: ");
        mytree.depthFind(depth, mytree.getRoot());
        
    }
}