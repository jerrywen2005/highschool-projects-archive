public class LinkList {
    
    public Node head;
    public LinkList(int d){
        head = new Node(d);
    }
    
    public static int leftsum = 0;
    public static int rightsum = 0;
    public static int totalsum = 0;
    
    public boolean addEnd(int newData){
        rightsum += newData;
        totalsum += newData;
        Node current = head;
        Node end = new Node(newData);
        
        while(current.next != null){
            current = current.next;
        }
        current.next = end;
        return true;
    }
    public boolean addBegin(int newData){
        leftsum += newData;
        totalsum += newData;
        Node begin = new Node(newData);
        
        begin.next = head;
        head = begin;
        return true;
    }
    public void show(){
        Node current = head;
        System.out.println("Link List:");
        if(head == null){
            System.out.println("the list is empty");
        }
        else{
            while (current.next != null){
                System.out.print(current.data + " -->");
                current = current.next;
            }
            System.out.println(current.data);
        }
    }
    public void Balance(){
        int difference = 0;
        if(rightsum == leftsum){
            System.out.println("the left and right side are balanced");
        }
        if(rightsum > leftsum){
            System.out.println("right side is heavy");
            Node current = head;
            difference = rightsum - leftsum;
            Node insert = new Node(difference);
            while(current.next.data != 0){
                current =  current.next;
            }
            if(current.data == 0){ //if nothing is on left
                insert.next = head;
                head = insert;
            }
            else{
                insert.next = current.next;
                current.next = insert;
            }
            
        }
        if(leftsum > rightsum){
            System.out.println("left side is heavy");
            Node current = head;
            difference = leftsum - rightsum;
            Node insert = new Node(difference);
            while (current.next.data != 0){
                current = current.next;
            }
            current = current.next;
            if (current.next == null){ //if nothing is on right
                current.next = insert;
            }
            else{
                insert.next = current.next;
                current.next = insert;
            }
        }
    }
    
    
    
}