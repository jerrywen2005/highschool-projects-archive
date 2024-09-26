public class Die {
    public static int rollDie(int x){
        
        int sum = 0;
        for (int i=0; i<x; i++){
            sum += (int)(Math.random()*6+1);
        }
        return sum;
    }
}