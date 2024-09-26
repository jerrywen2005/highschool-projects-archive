public class LinkList {
    public Node head;
    public int listCount;
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
    
    public boolean addNode(int newdata){
        Node end = new Node(newdata);
        Node current = head;
        
            while (current.next != null){
            current = current.next;
        }
        current.next = end;
        
        
        return true;
    }
    
    public boolean insertSort(int newdata){
        Node insert = new Node(newdata);
        Node current = head;
        
        
        
        
        if (head == null){
            
            head = insert;
        }
        
        else{
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
        }
        
        return true;
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
    
    public int displayLength(){
        Node current = head;
        int length = 0;
        if(current != null){
            length += 1;
            while(current.next != null){
            current = current.next;
            length += 1;

            }
        }
        return length;
    }
    
    public boolean push(int newdata){
        
    
        
            
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
           
        
        
        
        return true;
    }
    
    public boolean pop(String sq){
        Node current = head;
        
        if(sq.equals("stack")){
            if (current == null){
                System.out.print("there is nothing to pop");
            }
            else if(current.next == null){
                head = null;
            }
            else{
                while (current.next.next != null){
                    current = current.next;
                }
                current.next = null;
            }
        }
        
        if(sq.equals("queue")){
            if (current == null){
                System.out.print("there is nothing to pop");
            }
            else{
                head = head.next;
                
            }
        }
        
        return true;
        
    }
    
    public boolean find(int newdata){
        Node target = new Node(newdata);
        Node current = head;
        
        int position = 1;
        if(current == null){
            System.out.println("not in the list");
        }
        else if(current.data == newdata){
            System.out.println("the position of this number is "+position);
        }
        else if(current.next == null){
            System.out.print("not in the list");
        }
    
        else{
            position += 1;
            while((current.next != null) && (current.next.data != newdata)){
                position += 1;
                current = current.next;
            }
            if(current.next == null){
                System.out.print("not in the list");
            }
            else{
                System.out.println("the position of this number is "+position);
            }
            
        }
        return true;
    }
    
    public boolean reverse(){
        Node current = head;
        Node previous = null;
        Node next = null;
        
        
        while(current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
            
        }
        head = previous;
        return true;
    }
}