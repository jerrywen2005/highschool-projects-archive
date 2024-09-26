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
        else if(add.data == '%'){
            add.left = create(++pos);
            add.right = create(++pos);
            add.value = add.left.value % add.right.value;
        }
        else if(add.data == 'h'){
            add.left = create(++pos);
            add.right = create(++pos);
            int temp = (int) Math.pow(add.left.value, 2) + (int) Math.pow(add.right.value, 2);
            add.value = (int) Math.sqrt(temp);
        }
        else if(add.data == 'n'){
            add.left = create(++pos);
            add.right = null;
            add.value = add.left.value * -1;
        }
        else if(add.data == 'f'){
            add.left = create(++pos);
            add.right = null;
            int temp = add.left.value;
            add.value = temp;
            while(temp>1){
                temp --;
                add.value = add.value*(temp);
               
            }
        }
        else{
                
            add.left = null;
            add.right = null;
            add.value = Character.getNumericValue(add.data);
            }
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