import java.util.*;
abstract class exercise {

    
    public static String dayOfTheWeek = "Sunday";
    
    
    public static ArrayList<Double> times = new ArrayList<Double>();
    public static ArrayList<String> sTimes = new ArrayList<String>();

    
    public static String nextDay(){
        if(dayOfTheWeek.equals("Monday")){
            dayOfTheWeek = "Tuesday";
        }
        else if(dayOfTheWeek.equals("Tuesday")){
            dayOfTheWeek = "Wednesday";
        }
        else if(dayOfTheWeek.equals("Wednesday")){
            dayOfTheWeek = "Thursday";
        }
        else if(dayOfTheWeek.equals("Thursday")){
            dayOfTheWeek = "Friday";
        }
        else if(dayOfTheWeek.equals("Friday")){
            dayOfTheWeek = "Saturday";
        }
        else if(dayOfTheWeek.equals("Saturday")){
            dayOfTheWeek = "Sunday";
            
        }
        else if(dayOfTheWeek.equals("Sunday")){
            dayOfTheWeek = "Monday";
        }
        
        return dayOfTheWeek;
    }
    
    public abstract void workout(String dayOfTheWeek);
    public abstract void evaluate(double pace, double goal);
    public abstract void displayTimes();
    
    
    
}