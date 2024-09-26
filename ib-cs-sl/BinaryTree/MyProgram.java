public class MyProgram
{
    public static void main(String[] args)
    {
        BTree mytree = new BTree('d');
        
        mytree.add('a');
        mytree.add('z');
        mytree.add('q');
        mytree.add('v');
        mytree.add('r');
        mytree.add('a');
        mytree.add('p');
        
        mytree.InFixPrint(mytree.getRoot());
    }
}