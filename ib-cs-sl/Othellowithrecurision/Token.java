public class Token {
    int color; // 0 = black, 1 = white
    
    public Token (int color){
        this.color = color;
    }
    public void flip (){
        // your code goes here
        if(color == 1){
            color = 0;
        }
        else if(color == 0){
            color = 1;
        }
    }
    public int getColor(){
        return color;
    }
}