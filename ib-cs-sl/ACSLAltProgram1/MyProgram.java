import java.util.*;
public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        RomanNumerals myRN = new RomanNumerals();
        
        System.out.println("enter a roman numeral to convert to Hindu-Arabic");
        String in = input.nextLine();
        
        System.out.println("Hindu-Arabic: " + myRN.read(in));
        
    }
}