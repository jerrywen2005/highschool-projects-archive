import java.util.*;
public class RectPrism implements Comparable<RectPrism>{
    private Integer height;
    private Integer width;
    private Integer depth;
    private Integer volume;
    private Integer shippingGirth;
    
    public RectPrism(int height, int width, int depth){
        this.height = height;
        this.width = width;
        this.depth = depth;
    }
    
    public Integer getVolume(){
        volume = height*width*depth;
        return volume;
    }
    public Integer getShippingGirth(){
        Integer arr[] = {height, width, depth};
        Arrays.sort(arr);
        return 2*arr[0] + 2*arr[1];
    }
        
        
    @Override
    public int compareTo(RectPrism other){
        int cp = this.getVolume().compareTo(other.getVolume());
        if(cp == 0){
            cp = this.getShippingGirth().compareTo(other.getShippingGirth());
        }
        return cp;
        
    }
    
    public String toString(){
        return "Volume: " + this.getVolume() + "   Girth: " + this.getShippingGirth();
    }
    
    
    
    }