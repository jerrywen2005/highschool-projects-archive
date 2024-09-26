public class BTree {
    public BNode root;
    public int maxDepth;
    public BTree(char d){
        root = new BNode(d);
    }
    
    public boolean add(char newdata){
        int depth = 1;
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
                        depth += 1;
                    }
                    else{
                        current.left = add;
                        add.depth = depth;
                        cont = false;
                    }
                }
                if(newdata > current.data){
                    if(current.right != null){
                        current = current.right;
                        depth += 1;
                    }
                    else{
                        current.right = add;
                        add.depth = depth;
                        cont = false;
                    }
                }
            
            }
        }
        return true;
    }
    
    public boolean delete(){
        root = null;
        
        return true;
    }
    
    public int getMaxDepth(BNode b){
        
        
        if(b.left != null){
            getMaxDepth(b.left);
        }
        if(b.right != null){
            getMaxDepth(b.right);
        }
        
        if(b.depth > maxDepth){
            maxDepth = b.depth;
        }
        return maxDepth;   
    }
    
    public BNode getRoot(){
        return root;
    }
    
    
    public void depthFind(int i, BNode b){
        if(getMaxDepth(b) < i){
            System.out.println("no nodes found at this depth");
        }
        if(b.depth == i){
            System.out.println(b.toString());
            }
        
        if(b.left != null){
            depthFind(i, b.left);
        }
        
        if(b.right != null){
            depthFind(i, b.right);
        }
        
    }
    
    public void InFixPrint(BNode b){
        if(b.left != null){
            InFixPrint(b.left);
        }
        System.out.println(b.toString());
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