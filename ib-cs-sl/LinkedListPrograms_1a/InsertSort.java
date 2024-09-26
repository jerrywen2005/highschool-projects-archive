import java.util.Scanner;
public class InsertSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        LinkList mylist = new LinkList(0);
        mylist.deleteNode(0);
        
        
        
        boolean menu = true;
        
        while (menu == true){
            
            System.out.println("enter which number you would like to do");
            System.out.println("1. insert a value");
            System.out.println("2. delete a value");
            System.out.println("3. display the list");
            System.out.println("4. diplay the current length of the list");
            System.out.println("5. quit");
            System.out.println();
            int choice = input.nextInt();
        
            if(choice == 1){
                System.out.println("please enter a value to insert");
                int another = input.nextInt();
                mylist.insertSort(another);
            }
            else if(choice == 2){
                System.out.println("enter a node to delete");
                int delete = input.nextInt();
                mylist.deleteNode(delete);
            }
            else if(choice ==3){
                System.out.println();
                
                mylist.show();
            }
            else if(choice == 4){
                System.out.println("list length: " + mylist.displayLength());
            }
            else if(choice == 5){
                menu = false;
            }
            System.out.println();
            
        }
        
        
        
            
}
}