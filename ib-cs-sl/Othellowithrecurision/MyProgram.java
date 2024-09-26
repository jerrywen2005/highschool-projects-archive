import java.util.*;
public class Board {
    Scanner input = new Scanner(System.in);
    Token [][] b;
    public Board() {
        // initialize the board with 4 tokens in the center
        // the rest of the board should remain NULL
        b = new Token [8][8];
        
        for(int row = 0; row<8; row++){
            for(int column = 0; column<8; column++){
                b[row][column] = new Token (10);
            }
        }
        
        b[3][3] = new Token (1);
        b[3][4] = new Token (0);
        b[4][3] = new Token (0);
        b[4][4] = new Token (1);
        
        
    }
    public void play(){
        /* this is where all the board control happens
        allow the users to quit
        use a loop that will run unless the game ends
        you SHOULD create other methods for checking if the
        game is over,determine the score (count the number of
        tokens of each color), flip the tokens, etc.
        */

        
        boolean cont = true;
        System.out.println("Welcome to Othello.");
        
        while(cont){
            boolean again = true;
            String next;
            for(int row = 0; row<8; row++){
            for(int column = 0; column<8; column++){
                if(b[row][column].getColor() == 10){
                    System.out.print("( )");
                }
                else{
                    System.out.print("(" +b[row][column].color +")");
                }
                
            }
            System.out.println();
        }
        
        if(gameOver()){
            System.out.println();
            cont = false;
            again = false;
            score();
        }
        else{
            score();
            System.out.println();
            System.out.println("Blacks move");
            System.out.println("Possible moves: ");
            possibleMoves(0);
            System.out.println();
            System.out.println("Please enter your move. If there are no possible moves, type NEXT. To quit, type QUIT");
            next = input.nextLine();
            if(next.equals("QUIT")){
                cont = false;
            }
            else if(next.equals("NEXT")){

            }
            else{
                move(0, next);
                System.out.println();
            }
        
    
        for(int row = 0; row<8; row++){
            for(int column = 0; column<8; column++){
                if(b[row][column].getColor() == 10){
                    System.out.print("( )");
                }
                else{
                    System.out.print("(" +b[row][column].color +")");
                }
                
            }
            System.out.println();
        }
        }
        
        if(again == false){
            
        }
        else if(gameOver()){
            System.out.println();
                cont = false;
                score();
            }
        else{
           score();
            System.out.println();
            System.out.println("Whites move");
            System.out.println("Possible moves: ");
            possibleMoves(1);
            System.out.println();
            System.out.println("Please enter your move. If there are no possible moves, type NEXT. To quit, type QUIT");
            next = input.nextLine();
            if(next.equals("QUIT")){
                cont = false;
            }
            else if(next.equals("NEXT")){
                continue;
            }
            else{
                move(1, next);
                System.out.println();
            } 
        }
        
        
        }
        
    }
    
    public void score(){
        int white = 0;
        int black = 0;
        for(int row = 0; row<8; row++){
            for(int column = 0; column<8; column++){
                if(b[row][column].getColor() == 1){
                    white += 1;
                }
                if(b[row][column].getColor() == 0){
                    black += 1;
                }
            }
        }
        System.out.println("The score is: ");
        System.out.println("White: " +white);
        System.out.println("Black: " +black);
    }
    
    public void winner(){
        int white = 0;
        int black = 0;
        for(int row = 0; row<8; row++){
            for(int column = 0; column<8; column++){
                if(b[row][column].getColor() == 1){
                    white += 1;
                }
                if(b[row][column].getColor() == 0){
                    black += 1;
                }
            }
        }
        if(black > white){
            System.out.println("Black is the winner");
        }
        else if(black < white){
            System.out.println("White is the winner");
        }
        else{
            System.out.println("No winner. Draw game");

        }
    }
    
    public boolean gameOver(){
        
        boolean over = true;
        for(int row = 0; row<8; row++){
            for(int column = 0; column<8; column++){
                
                if(b[row][column].getColor() == 10){
                    over = false;
                }
                if(b[row][column].getColor() != 10){
                    continue;
                }
                
            }
        }
        
        if(over == true){
            System.out.println("The game is over");
        
        
            this.winner();
        }
        return over;
    }
    
    
    public void move(int color, String move){
        String moveRow = move.substring(0,1);
        String moveColumn = move.substring(2);
        
        int moveR = Integer.parseInt(moveRow);
        int moveC = Integer.parseInt(moveColumn);
        moveR -=1;
        moveC-=1;
        int row = moveR;
        int column = moveC;
        
        if(color == 0){
            b[row][column] = new Token (0);
            if(row != 7 && column != 7){
            if(b[row+1][column+1].getColor() == 1){
                while(row<7 && column<7 && b[row+1][column+1].getColor() == 1){
                                row += 1;
                                column += 1;
            }
            if(row<7 && column<7 && b[row+1][column+1].getColor() == 0){
                row = moveR;
                column = moveC;
            while(row<7 && column<7 && b[row+1][column+1].getColor() == 1){
                b[row+1][column+1].flip();
                row+=1;
                column+=1;
            }
            }
            }
            }
            row = moveR;
            column = moveC;
            if(row != 7){
            if(b[row+1][column].getColor() == 1){
                while(row<7 && b[row+1][column].getColor() == 1){
                                row += 1;
            }
            if(row<7 && b[row+1][column].getColor() == 0){
                row = moveR;
            while(row<7 && b[row+1][column].getColor() == 1){
                b[row+1][column].flip();
                row+=1;
            }
            }
            }
            }
            row = moveR;
            column = moveC;
            if(row != 7 && column != 0){
            if(b[row+1][column-1].getColor() == 1){
                while(row<7 && column >0 && b[row+1][column-1].getColor() == 1){
                                row += 1;
                                column -= 1;
            }
            if(row<7 && column >0 && b[row+1][column-1].getColor() == 0){
                row = moveR;
                column = moveC;
            while(row<7 && column >0 && b[row+1][column-1].getColor() == 1){
                b[row+1][column-1].flip();
                row+=1;
                column-=1;
            }
            }
            }
            }
            row = moveR;
            column = moveC;
            if(column != 7){
            if(b[row][column+1].getColor() == 1){
                while(column <7 && b[row][column+1].getColor() == 1){
                                column += 1;
            }
            if(column <7 && b[row][column+1].getColor() == 0){
                row = moveR;
                column = moveC;
            while(column <7 && b[row][column+1].getColor() == 1){
                b[row][column+1].flip();
                column+=1;
            }
            }
            }
            }
            row = moveR;
            column = moveC;
            if(column != 0){
            if(b[row][column-1].getColor() == 1){
                while(column >0 && b[row][column-1].getColor() == 1){
                                column -= 1;
            }
            if(column >0 && b[row][column-1].getColor() == 0){
                row = moveR;
                column = moveC;
            while(column >0 && b[row][column-1].getColor() == 1){
                b[row][column-1].flip();
                column-=1;
            }
            }
            }
            }
            row = moveR;
            column = moveC;
            if(row != 0 && column != 7){
            if(b[row-1][column+1].getColor() == 1){
                while(row>0 && column <7 && b[row-1][column+1].getColor() == 1){
                                row -= 1;
                                column += 1;
            }
            if(row>0 && column <7 && b[row-1][column+1].getColor() == 0){
                row = moveR;
                column = moveC;
            while(row>0 && column <7 && b[row-1][column+1].getColor() == 1){
                b[row-1][column+1].flip();
                row-=1;
                column+=1;
            }
            }
            }
            }
            row = moveR;
            column = moveC;
            if(row != 0){
            if(b[row-1][column].getColor() == 1){
                while(row>0 && b[row-1][column].getColor() == 1){
                               row -= 1; 
            }
            if(row>0 && b[row-1][column].getColor() == 0){
                row = moveR;
                column = moveC;
            while(row>0 && b[row-1][column].getColor() == 1){
                b[row-1][column].flip();
                row-=1;
            }
            }
            }
            }
            row = moveR;
            column = moveC;
            if(row != 0 && column != 0){
            if(b[row-1][column-1].getColor() == 1){
                while(row>0 && column >0 && b[row-1][column-1].getColor() == 1){
                                row-=1;
                                column-=1;
            }
            if(row>0 && column >0 && b[row-1][column-1].getColor() == 0){
                row = moveR;
                column = moveC;
            while(row>0 && column >0 && b[row-1][column-1].getColor() == 1){
                b[row-1][column-1].flip();
                row-=1;
                column-=1;
            }
            }
            }
            }
            
        }
        
        
        if(color == 1){
            b[row][column] = new Token (1);
            
            if(row!=7 && column !=7){
            if(b[row+1][column+1].getColor() == 0){
                while(row<7 && column <7 && b[row+1][column+1].getColor() == 0){
                                row += 1;
                                column += 1;
            }
            if(row<7 && column <7 && b[row+1][column+1].getColor() == 1){
                row = moveR;
                column = moveC;
            while(row<7 && column <7 && b[row+1][column+1].getColor() == 0){
                b[row+1][column+1].flip();
                row+=1;
                column+=1;
            }
            }
            }
            }
            row = moveR;
            column = moveC;
            if(row!=7){
            if(b[row+1][column].getColor() == 0){
                while(row<7 && b[row+1][column].getColor() == 0){
                                row += 1;
            }
            if(row<7 && b[row+1][column].getColor() == 1){
                row = moveR;
            while(row<7 && b[row+1][column].getColor() == 0){
                b[row+1][column].flip();
                row+=1;
            }
            }
            }
            }
            row = moveR;
            column = moveC;
            if(row!=7 && column != 0){
            if(b[row+1][column-1].getColor() == 0){
                while(row<7 && column >0 && b[row+1][column-1].getColor() == 0){
                                row += 1;
                                column -= 1;
            }
            if(row<7 && column >0 && b[row+1][column-1].getColor() == 1){
                row = moveR;
                column = moveC;
            while(row<7 && column >0 && b[row+1][column-1].getColor() == 0){
                b[row+1][column-1].flip();
                row+=1;
                column-=1;
            }
            }
            }
            }
            row = moveR;
            column = moveC;
            if(column != 7){
            if(b[row][column+1].getColor() == 0){
                while(column <7 && b[row][column+1].getColor() == 0){
                                column += 1;
            }
            if(column <7 && b[row][column+1].getColor() == 1){
                row = moveR;
                column = moveC;
            while(column <7 && b[row][column+1].getColor() == 0){
                b[row][column+1].flip();
                column+=1;
            }
            }
            }
            }
            row = moveR;
            column = moveC;
            if(column != 0){
            if(b[row][column-1].getColor() == 0){
                while(column >0 && b[row][column-1].getColor() == 0){
                                column -= 1;
            }
            if(column >0 && b[row][column-1].getColor() == 1){
                row = moveR;
                column = moveC;
            while(column >0 && b[row][column-1].getColor() == 0){
                b[row][column-1].flip();
                column-=1;
            }
            }
            }
            }
            row = moveR;
            column = moveC;
            if(row != 0 && column != 7){
            if(b[row-1][column+1].getColor() == 0){
                while(row>0 && column <7 && b[row-1][column+1].getColor() == 0){
                                row -= 1;
                                column += 1;
            }
            if(row>0 && column <7 && b[row-1][column+1].getColor() == 1){
                row = moveR;
                column = moveC;
            while(row>0 && column <7 && b[row-1][column+1].getColor() == 0){
                b[row-1][column+1].flip();
                row-=1;
                column+=1;
            }
            }
            }
            }
            row = moveR;
            column = moveC;
            if(row!=0){
            if(b[row-1][column].getColor() == 0){
                while(row>0 && b[row-1][column].getColor() == 0){
                               row -= 1;
            }
            if(row>0 && b[row-1][column].getColor() == 1){
                row = moveR;
                column = moveC;
            while(row>0 && b[row-1][column].getColor() == 0){
                b[row-1][column].flip();
                row-=1;
            }
            }
            }
            }
            row = moveR;
            column = moveC;
            if(row != 0 && column != 0){
            if(b[row-1][column-1].getColor() == 0){
                while(row>0 && column >0 && b[row-1][column-1].getColor() == 0){
                                row-=1;
                                column-=1;
            }
            if(row>0 && column >0 && b[row-1][column-1].getColor() == 1){
                row = moveR;
                column = moveC;
            while(row>0 && column >0 && b[row-1][column-1].getColor() == 0){
                b[row-1][column-1].flip();
                row-=1;
                column-=1;
            }
            }
            }
            }
            
        }
    }
}