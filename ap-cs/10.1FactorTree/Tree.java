public class Tree {
    private Node root;

    public Tree (int num){
        root = new Node (num);
        buildTree();
    }   
    
    private boolean isItPrime(int x){
        
        
        boolean prime = true;
        if(x<=1){
            prime = false;
        }
        for ( int i=2; i<x; i++){
            if (x%i==0){
                prime = false;
            }
        }
 
        return prime;
    }
        
    // returns the smallest factor of x.    
    private int findFactor (int x) {
        if (x%2 == 0){
            return 2;
        }
        for (int i=3; i*i<=x; i+=2){
            if (x%i == 0){
                return i;
            }
        }
        return x;
    }
    
    public void buildTree (){
        int fact = 0;
        int num = root.getData();
        
        if (!isItPrime(num)){
            fact = findFactor(num);
            root.addLeft(addNode (fact));
            root.addRight(addNode(num/fact));
        }
    }
    
    public Node addNode (int fact){
        
     
        Node newFactor = new Node(fact);
        
          if (isItPrime(fact)){
        return newFactor;
        }
        else{
        int f1 = findFactor(fact);
       
        int f2 = fact/f1;
         newFactor.addLeft(addNode(f1));
        newFactor.addRight(addNode(f2));
        
        
        
        }
 
        return newFactor;
            
    }
    public void printTree(){
        print(root);
    }
    
    // recursive print.
    // check left, print, check right
    public void print(Node n){
        
       
         Node left = n.getLeft();
         Node right = n.getRight();
         
         
          System.out.println(left.toString());
         System.out.println(n);
          
             if(isItPrime(right.getData())==null){
             
            print(right);
             }
              else{
                  System.out.println(right.toString());
              }
          
         
         
            
       
         
        
     
        
    
      
        
        }
        
    }