public class BTree {
    public BNode root;
    public int maxDepth;
    public String oneChild = "";
    public int empties;
    public int IPL;
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
    
    public BNode getRoot(){
        return root;
    }
    
    public void oneChildShow(BNode b){
        if(b.left == null && b.right != null || b.right == null && b.left != null){
            oneChild += b.data;
        }
        if(b.left != null){
            oneChildShow(b.left);
        }
        
        if(b.right != null){
            oneChildShow(b.right);
        }
        
        
    }
    
    public void CountEmpty(BNode b){
        if(b.left == null ){
            empties += 1;
        }
        if(b.right == null){
            empties += 1;
        }
        if(b.left != null){
            CountEmpty(b.left);
        }
        
        if(b.right != null){
            CountEmpty(b.right);
        }
    }
    
    public void depthFind(int i, BNode b){
        
        if(b.depth == i){
            IPL += 1*i;
            }
        
        if(b.left != null){
            
            depthFind(i, b.left);
        }
        
        if(b.right != null){
            
            depthFind(i, b.right);
        }
        
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
    
    public int methodIPL(BNode b){
        int depth = this.getMaxDepth(b);
        
        for(int i = 0; i <= depth; i++){
            this.depthFind(i, b);
            
        }
        return IPL;
    }
}