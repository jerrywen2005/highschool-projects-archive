import java.util.Scanner;
public class LinkList {
    public static int Total = 0;
    public Node head;
    public LinkList(int d){
        head = new Node(d);
    }
    public void show(){
        Node current = head;
        System.out.println("Link List:");
        if(head == null){
            System.out.println("the list is empty");
        }
        else{
            while (current.next != null){
                System.out.println(current.data + " -->");
                current = current.next;
            }
            System.out.println(current.data);
        }
    }
    
    public boolean deleteNode(int newdata){
        Node current = head;
        if(current == null){
            System.out.println("there is nothing in the list to delete");
        }
        else if(current.data == newdata){
            head = current.next;
        }
        else{
            while(current.next != null && current.next.data != newdata){
                current = current.next;
            }
            if(current.next == null){
                System.out.println("the number you are trying to delete is not in the list");
            }
            else if(current.next.next == null){
                current.next = null;
            }
            else{
                current.next = current.next.next;
            }
        }
            
        return true;
        
    }
    
    public void oddGame(){
        Scanner input = new Scanner(System.in);
        
        while (Total < 100){
            
            System.out.println("input an integer");
            int newdata = input.nextInt();
            
            if(newdata %2 != 0 && newdata %5 != 0){
                Node end = new Node(newdata);
                Node current = head;
                if(head == null){
                head = end;
                }
                else{
                    while (current.next != null){
                        current = current.next;
                    }
                    current.next = end;
                }
            }
            if(newdata %2 != 0 && newdata %5 == 0){
                Node begin = new Node(newdata);
                Node current = head;
            
                if(head == null){
                 head = begin;
             }
             else{
                    begin.next = head;
                    head = begin;
                
             }
         }
           if(newdata  %2 == 0 && newdata %5 != 0){
               Node current = head;
               if (current != null){
                    if(current.next == null){
                       head = null;
                }
                    else{
                        while (current.next.next != null){
                           current = current.next;
                        }
                        current.next = null;
                    }
                }
            
         }
            if(newdata %2 == 0 && newdata %5 == 0){
                Node current = head;
                if (current != null){
                    head = head.next;
                }
            }
            
            Node current = head;
            
            if(current != null){
                Total = head.data;
                while(current.next != null){
                    Total += current.next.data;
                    current = current.next;
                }
            }
            
            
        }
        
        Node current = head;
        
        System.out.println("Link List:");
        
        while (current.next != null){
            System.out.println(current.data + " -->");
            current = current.next;
        }
        System.out.println(current.data);
        
        
        
    }
    
    
}