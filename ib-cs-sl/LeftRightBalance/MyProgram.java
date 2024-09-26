import java.util.Scanner;
public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        LinkList mylist = new LinkList(0);
        
        while (mylist.totalsum < 20){
            System.out.println("Input an integer value");
            int val = input.nextInt();
            
            if(mylist.leftsum < mylist.rightsum){
                mylist.addBegin(val);
                mylist.show();
            }
            else if(mylist.leftsum >= mylist.rightsum){
                mylist.addEnd(val);
                mylist.show();
            }
        }
        mylist.Balance();
        mylist.show();
        
    }
}