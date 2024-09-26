import java.util.*;
public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        char [][] board = new char [3][3];
        
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                board[i][j] = 'N';
            }
        }
        
        char one;
        char two;
        for (int i = 0; i < 3; i++){
            System.out.println("Player 1's turn. Enter a coordinate to place 'X'. Ex. 2,1");
            String p1 = input.nextLine();
            one = p1.charAt(1);
            two = p1.charAt(3);
            if(board[one][two] == 'N'){
                board [one][two] = 'X';
            }
            
            for (int j = 0; j < 3; j++){
                System.out.println("Player 2's turn. Enter a coordinate to place 'O'. Ex. 2,1");
                String p2 = input.nextLine();
                one = p1.charAt(1);
                two = p1.charAt(3);
                if(board[one][two] == 'N'){
                board [one][two] = 'O';
            }
            }
        }
        
        
    }
    
    public int checkWinner(char [][] board){
        boolean winner = false;
        int turn = 0;
        int count = 0;
        
        while(int x = true){
            int j = 0;
            for (int i = 0; i < 3; i++){
                if(board[i][j] == 'X');
                count++;
                }
            if(count == 3){
                winner = true;
                turn = 1;
                x = false;
            }
            j++;
        }
    
}