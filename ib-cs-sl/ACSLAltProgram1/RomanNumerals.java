import java.util.*;
public class RomanNumerals {
    
    public int convert(char c){
        int val = 0;
        if(c == 'I'){
            val = 1;
        }
        else if(c == 'V'){
            val = 5;
        }
        else if(c == 'X'){
            val = 10;
        }
        else if(c == 'L'){
            val = 50;
        }
        else if(c == 'C'){
            val = 100;
        }
        else if(c == 'D'){
            val = 500;
        }
        else if(c == 'M'){
            val = 1000;
        }
        return val;
    }
    
    public int read(String s){
        int total = 0;
        int length = s.length();
        
        char c = s.charAt(length-1);
        int value = this.convert(c);
        total = value;
            
        for(int i = length; i > 1; i--){
            c = s.charAt(i-1);
            char next = s.charAt(i-2);
            int val = this.convert(c);
            int val2 = this.convert(next);
            
            if(val2 >= val){
                total += val2;
            }
            if(val2 < val){
                total -= val2;
            }
        }
        return total;
    }
}