import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.*;






public class Tray {
    
    
    
    
    
    private int score;
    
    private ArrayList<Tile> t = new ArrayList<Tile>();
    
    public Tray(){
        for (int i=0; i<9; i++){
            t.add(new Tile(i+1));
            
            
        }
        run();
    }
    
    
    public void run(){
        
        try{
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        boolean isOpen = true;
        for(int i=0; i<9; i++){
            if(t.get(i).getState() == true){
                isOpen = false;
            }
        }
        
        if(isOpen == true){
            System.out.println("You have won! All the tiles are closed.");
            return;
        }
        
        if(!t.get(6).getState() == true ||!t.get(7).getState() == true ||!t.get(8).getState() == true){
            System.out.println();
            System.out.println("Would you like to roll 1 or 2 die(s)? Please input 1 or 2");
           System.out.println();
            sum = Die.rollDie(sc.nextInt());
            }
           
        
        else{
            sum = Die.rollDie(2);
        }
        System.out.println();
        System.out.println("You've rolled a total of " +sum );
        String openTiles = " ";
        for(int i=0; i<9; i++){
            if (t.get(i).getState() == true){
                openTiles+= Integer.toString(t.get(i).getValue())+", ";
                
            }
        }
        
        System.out.println("Tiles still open: " + openTiles);
        System.out.println();
        System.out.println("Are you able to close any more tiles?");
        System.out.println("Input yes to continue and no to end the game");
        System.out.println();
        
        String input = sc.next();
        sc.nextLine();
        
        
        
        if(input.equals("yes")){
            
            System.out.println();
            System.out.println("Which tiles would you like to close? ");
            System.out.println("enter the tile numbers seperated by a space");
            System.out.println();
            String in = sc.nextLine();
            
            
            boolean x = true;
            int checkTotal = 0;
            
            int [] arr = Stream.of(in.split(" ")).mapToInt(Integer::parseInt).toArray();
            
            for (int i=0; i<arr.length; i++){
                for (int k=0; k<arr.length; k++){
                    if(arr[i] == arr[k] && i != k){
                        x = false;
                    }
                    
                    
                   
                }
                checkTotal += arr[i];
            }
            if (checkTotal != sum){
                x = false;
            }
            
        
            
            if (x == true){
            for (int i=0; i<9; i++){
                for(int integer : arr){
                    if(t.get(i).getValue() == integer){
                        t.get(i).setState(false);
                        
                    }
                }
            }
            
            run();
            
            }
            else{
            System.out.println("error, you did not enter valid numbers");
            System.out.println("game over, please try again");
            }  
            
            
            
            }
            
        else if(input.equals("no")){
            score = score();
            System.out.println();
            System.out.println("Game over, your score is: " +score);
            
            return;
        
        }
        else{
            System.out.println("error, you did not enter valid input");
            System.out.println("game over, please try again");
            }
    }


    catch(Exception e){
            System.out.println("error, you did not enter a valid input");
            System.out.println("game over, please try again");
        }
}
        
        
        public int score(){
            int scoree=0;
            for(int i=0; i<9; i++){
                
                if(t.get(i).getState() == true){
                    scoree+= t.get(i).getValue();
                }
                
                
            }
            
            return scoree;
        }
        
        
    }