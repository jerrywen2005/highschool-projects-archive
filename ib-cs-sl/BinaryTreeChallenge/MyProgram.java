public class MyProgram
{
    public static void main(String[] args)
    {
        String yellow = "datascience";
        
        BTree mytree = new BTree(yellow.charAt(0));
        int length = yellow.length();
        
        for (int i = 1; i < length; i++){
            mytree.add(yellow.charAt(i));
        }
        
        mytree.oneChildShow(mytree.getRoot());
        System.out.println("One Child Nodes: " + mytree.oneChild);
        
        mytree.CountEmpty(mytree.getRoot());
        System.out.println("Number of Empties: " + mytree.empties);
        
        System.out.println("IPL: " + mytree.methodIPL(mytree.getRoot()));
    }
}