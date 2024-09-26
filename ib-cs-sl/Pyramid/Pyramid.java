import java.util.*;
class Pyramid extends IsoTri{
    private int sides;
    
    public Pyramid(double height, double base, int sides){
        super (height, base);
        this.sides = sides;
    }
    public Pyramid(){
        super(1,1);
        sides = 3;
    }
    public double getSides(){
        return sides;
    }
    public void setSides(int set){
        sides = set;
    }
    public double ARegPoly(){
        double radians = Math.toRadians(180/sides);
        return sides*base*(base/(2*Math.tan(radians)));
    }
    public double SAPyramid(){
        return (super.ATri() * sides);
    }
    @Override public String toString(){
        return(super.toString() + ", number of sides: " + sides + ", area of regular polygon: " + this.ARegPoly() + ", surface area of pyramid: " + this.SAPyramid());
    }
}