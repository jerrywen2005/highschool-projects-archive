import java.util.*;
class IsoTri{
    public double height;
    public double base;
    
    public IsoTri(double height, double base){
        this.height = height;
        this.base = base;
    }
    public IsoTri(){
        height = 1;
        base = 1;
    }
    public double getHeight(){
        return height;
    }
    public double getBase(){
        return base;
    }
    public void setHeight(double set){
        height = set;
    }
    public void setBase(double set){
        base = set;
    }
    public double ATri(){
        return 0.5*base*height;
    }
    public String toString(){
        return "height: " + height + ", base: " + base + ", area of triangle: " + this.ATri() + "\n";
    }
}