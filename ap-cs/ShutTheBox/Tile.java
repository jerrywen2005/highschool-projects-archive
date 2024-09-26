public class Tile {
    private int val;
    private boolean state;
    public Tile(int val){
        this.val = val;
        state = true;
    }
    
    public void setState(boolean state){
        this.state = state;
    }
    
    public boolean getState(){
        return state;
    }
    
    public int getValue(){
        return val;
    }
    
    
}