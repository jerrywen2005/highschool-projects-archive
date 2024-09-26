public class BTree {
    public BNode root;
    public BTree(char d){
        root = new BNode(d);
    }
    
    public boolean add(char newdata){
        BNode add = new BNode(newdata);
        BNode current = root;
        
        if (root == null){
            root = add;
        }
        else{
            boolean cont = true;
            while (cont == true){
                if(newdata <= current.data){
                    if(current.left != null ){
                        current = current.left;
                    }
                    else{
                        current.left = add;
                        cont = false;
                    }
                }
                if(newdata > current.data){
                    if(current.right != null){
                        current = current.right;
                    }
                    else{
                        current.right = add;
                        cont = false;
                    }
                }
            
            }
        }
        return true;
    }
    
    public BNode getRoot(){
        return root;
    }
    
    public void InFixPrint(BNode b){
        if(b.left != null){
            InFixPrint(b.left);
        }
        System.out.println(b.data + " -> " );
        if(b.right != null){
            InFixPrint(b.right);
        }
    }
    public void PreFixPrint(BNode b){
        System.out.println(b.data + " -> " );
        if(b.left != null){;
            InFixPrint(b.left);
        }
        if(b.right != null){
            InFixPrint(b.right);
        }
    }
    public void PostFixPrint(BNode b){
        if(b.left != null){
            PostFixPrint(b.left);
        }
        if(b.right != null){
            PostFixPrint(b.right);
        }
        System.out.println(b.data + " -> " );
    }
}