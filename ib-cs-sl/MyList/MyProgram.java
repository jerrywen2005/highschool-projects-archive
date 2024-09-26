import java.util.Scanner;
public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter initial value");
        int value = sc.nextInt();
        LinkList mylist = new LinkList(value);
        /*
        boolean cont = true;
        while (cont == true){

            
            System.out.println("do you want to continue adding values?");
            String yesno = sc.nextLine();
            if (yesno.compareTo("yes") == 0 ){
                
            System.out.println("enter next value");
            int another = sc.nextInt();
            mylist.addNode(another);
        }
        
        if (yesno.compareTo("no") == 0){
            cont = false;
        }
        
        }
        mylist.show();
        
        
        for (int i=0; i<6; i++){
            System.out.println("enter next value");
            int another = sc.nextInt();
            
            if(another%2 == 0){
                mylist.addBegin(another);
            }
            else{
                mylist.addNode(another);
            }
        }
        mylist.show();
        */
        
        System.out.println("please enter a value to sort");
        int val = sc.nextInt();
        mylist.insertSort(val);
        
        
        for (int i=0; i<6; i++){
            System.out.println("enter next value");
            int another = sc.nextInt();
            mylist.insertSort(another);
        }
        mylist.show();
        
      
    } 
}