public class LinkList {
    public Node head;
    public int listCount;
    public LinkList(int d){
        head = new Node(d);
    }
    public void show(){
        Node current = head;
        while (current.next != null){
            System.out.println(current.data + " -->");
            current = current.next;
        }
        System.out.println(current.data);
        //while (current){
            //System.out.println(current.data + "alternate")
        //}
        
    }
    
    public boolean addNode(int newdata){
        Node end = new Node(newdata);
        Node current = head;
        
        while (current.next != null){
            current = current.next;
        }
        current.next = end;
        return true;
    }
    public boolean addBegin(int newdata){
        Node begin = new Node(newdata);
        begin.next = head;
        head = begin;
        
        return true;
    }
    public boolean insertSort(int newdata){
        Node insert = new Node(newdata);
        Node current = head;
        
       
        while(current.next != null && current.next.data < newdata){
            current = current.next;
        }
        
        
        if(insert.data < head.data){
            insert.next  = head;
            head = insert;
        }
        else if(current.next == null){
            insert.next = null;
            current.next = insert;
        }
        else{
        
        insert.next =  current.next;
        current.next = insert;
        }
        return true;
    }
}