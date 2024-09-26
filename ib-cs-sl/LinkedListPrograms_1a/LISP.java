import java.util.Scanner;
public class LISP {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        LinkList mylist = new LinkList(0);
        mylist.deleteNode(0);
        
        System.out.println("would you like to do a stack of a queue?");
            String sq = input.nextLine();
        
        
        boolean menu = true;
        
        boolean re = true;
        
        while (menu == true){
            System.out.println("enter which number you would like to do for your "+sq);
            System.out.println("1. push");
            System.out.println("2. pop");
            System.out.println("3. display the list");
            System.out.println("4. find value in list");
            System.out.println("5. reverse the list");
            System.out.println("6. quit");
        
            System.out.println();
            int choice = input.nextInt();
            
            if(choice == 1){
                System.out.println("please enter a value to push");
                int another = input.nextInt();
                mylist.push(another);
            }
            else if(choice == 2){
                mylist.pop(sq);
            }
            else if(choice ==3){
                System.out.println();
                
                mylist.show();
            }
            else if(choice == 4){
                System.out.println("which number would you like to find");
                int data = input.nextInt();
                mylist.find(data);
            }
            else if(choice == 5){
                mylist.reverse();
            }
            else if(choice == 6){
                menu = false;
            }
            System.out.println();
        }
        
        
        
    }
}