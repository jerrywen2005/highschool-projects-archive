import java.util.*;
public class run extends exercise{
    
    Scanner input = new Scanner (System.in);
    
    public static double mileTime;
    public static double mileGoal;
    public static int weeks = 0;
    
    public static ArrayList<Double> weight = new ArrayList<Double>();
    
    public run(double mt, double mg){
        
        mileTime = mt;
        mileGoal = mg;
    }
    
    
    
    
    public void workout(String dayOfTheWeek){
        if(dayOfTheWeek.equals("Monday")){
            System.out.println("Today's workout is: tempo run");
            System.out.println("A tempo run is a run that is between 3 miles and 5 miles, and is ran at a decent pace. Try to push yourself but don't go too fast.");
            System.out.println();
        }
        else if(dayOfTheWeek.equals("Tuesday")){
            System.out.println("Today's workout is: long run");
            System.out.println("A kibg ryb us any run that is between 5 miles and 25 miles. Go at a sustained jogging pace.");
            System.out.println();
        }
        else if(dayOfTheWeek.equals("Wednesday")){
            System.out.println("Today is a rest day");
            System.out.println("Take your time to recover from previous workouts. Make sure to eat proper nutrition and get good rest at night.");
            System.out.println();
        }
        
        else if(dayOfTheWeek.equals("Thursday")){
            weeks+=1;
            System.out.println("Today's workout is: mile run");
            System.out.println("Go run a mile and time yourself! Try to break your old pr.");
            boolean again = true;
            String in1 = "null";
            boolean fix = true;
            while(again == true){
                System.out.println("what is you new mile time from today? Ex: 7:36");
                in1 = " ";
                in1 = input.nextLine();
                if(weeks>1 && fix==true){
                    in1 = input.nextLine();
                }
                
                
                System.out.println("confirm "+in1+ " yes or no");
                String yesno = input.nextLine();
                if(yesno.equals("yes")){
                    try{
                        int semi = in1.indexOf(':');
                        String min = in1.substring(0,semi);
                        String sec = in1.substring(semi+1);
                        int minutes = Integer.parseInt(min);
                        double seconds = Integer.parseInt(sec);
                        seconds = seconds + minutes*60;
                        mileTime = seconds;
                        times.add(seconds);
                        sTimes.add(in1);
                        again = false;
                    }
                    catch(Exception e){
                        System.out.println("Please enter a valid input");
                    }
                    
                }
                fix = false;
                
            }
            System.out.println("please enter your weight: ");
            double in = input.nextInt();
            weight.add(in);
            
            
                
        }
        else if(dayOfTheWeek.equals("Friday")){
            System.out.println("Today's workout is: interval sprints");
            System.out.println("Today's workout is: long run");
            System.out.println("An interval workout consists of quick bursts of max exersion exersizing, followed by a short period of rest. You will sprint 100 meters and walk back to recover. Repeat this process for 10 mins. Repeat this 10 minute workout 3 times.");
            System.out.println();
        }
        else if(dayOfTheWeek.equals("Saturday")){
            System.out.println("Today's workout is: recovery run");
            System.out.println("The goal of a recovery run is to move your sore muscles and get the flood flowing for better recovery. Go on a slow, easy paced jog or a brisk walk for 20-30 mins.");
            System.out.println();
        }
        else if(dayOfTheWeek.equals("Sunday")){
            System.out.println("Today is a rest day");
            System.out.println("Take your time to recover from previous workouts. Make sure to eat proper nutrition and get good rest at night.");
            System.out.println();
        }
    }
    
    public void evaluate(double pace, double goal){
        
        
        ArrayList<Double> rate = new ArrayList<Double>();
        for(int i=1; i<times.size(); i++){
            double add = (times.get(i) / times.get(i-1));
            rate.add(add);
        }
        
        double sum = 0;
        for(int i=0; i<rate.size(); i++){
            sum += rate.get(i);
        }
        double avg = sum/rate.size();
        
        int wGoal = 0;
        while(pace > goal){
            pace *= avg;
            wGoal += 1;
            
            if(wGoal == 10000){
                System.out.print("weeks until goal: not reachable at your rate of progress");
                pace = 0;
            }
            
        }
        if(times.size()<2){
            System.out.println("weeks until goal: can't be determined yet");
            System.out.println();
        }
        else if(wGoal<10000){
            System.out.println("weeks until goal: "+ wGoal);
            System.out.println();
        }
        
        
    }
    
    public void displayTimes(){
        System.out.println("here are you past mile run times and weights:");
        for(int i=0; i<sTimes.size(); i++){
            
            System.out.println("week " + i +": " + sTimes.get(i) + ", "+ weight.get(i)+ " lbs");
        }
        
    }
}