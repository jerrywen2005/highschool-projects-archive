import java.util.*;
public class ETree {
    
    
    public static String input;
    public static int pos = 0;
    
    public ETree (char d){
        
    }
    
    
    
    public ENode create(int p){
        ENode add = new ENode(input.charAt(pos));
       
        if(add.data == '+'){
                
            add.left = create(++pos);
            add.right = create(++pos);
            add.value = add.left.value + add.right.value;
        }
        else if(add.data == '*'){
            add.left = create(++pos);
            add.right = create(++pos);
            add.value = add.left.value * add.right.value;
        }
        else if(add.data == '-'){
            add.left = create(++pos);
            add.right = create(++pos);
            add.value = add.left.value - add.right.value;
        }
        else{
                
            add.left = null;
            add.right = null;
            add.value = Character.getNumericValue(add.data);
            }
            System.out.println(add.value);
        return add;
    }
        
    
    public void InFixPrint(ENode e){
        if(e.left != null){
            InFixPrint(e.left);
        }
        System.out.print(e.data);
        if(e.right != null){
            InFixPrint(e.right);
        }
    }
            
        
        
        
         
    

}