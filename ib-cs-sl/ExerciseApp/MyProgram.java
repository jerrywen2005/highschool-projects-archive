import java.util.*;
public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        
        
        System.out.println("You will workout 5 days a week, with 2 rest days on wednesday and sunday");
        
        
            
        boolean again = true;
        while(again == true){
            System.out.println("Please enter your mile time. Ex: 7:45");
            String in = input.nextLine();
            System.out.println("confirm "+in+ " yes or no");
            String yesno = input.nextLine();
            
            if(yesno.equals("yes")){
                try{
                    int semi = in.indexOf(':');
                    String min = in.substring(0,semi);
                    String sec = in.substring(semi+1);
                    int minutes = Integer.parseInt(min);
                    double seconds = Integer.parseInt(sec);
                    seconds = seconds + minutes*60;
                    run.mileTime = seconds;
                    exercise.times.add(seconds);
                    exercise.sTimes.add(in);
                    again = false;
                }
                catch(Exception e){
                    System.out.println("Please enter a valid input");
                }
            }
            else{
                again = true;
            }
        }
        again = true;
        while(again == true){
                
              
            System.out.println("Please enter your mile goal. Ex: 6:45");
            String in2 = input.nextLine();
            System.out.println("confirm "+in2+ " yes or no");
            String yesno2 = input.nextLine();
            if(yesno2.equals("yes")){
                try{
                    int semi2 = in2.indexOf(':');
                    String min2 = in2.substring(0,semi2);
                    String sec2 = in2.substring(semi2+1);
                    int minutes2 = Integer.parseInt(min2);
                    double seconds2 = Integer.parseInt(sec2);
                    seconds2 = seconds2 + minutes2*60;
                    run.mileGoal = seconds2;
                    again = false;
                }
                catch(Exception e){
                    System.out.println("Please enter a valid input");
                }
            }
            else{
                again = true;
            }
        }
                
                
            run myrun = new run(run.mileTime, run.mileGoal);
            
            again =true;
            while (again == true){
                try{
                    System.out.println("please enter your weight: ");
                    double in = input.nextInt();
                    myrun.weight.add(in);  
                    again = false;
                }
                catch(Exception e){
                    System.out.println("Please enter a valid input");
                }
            }
            
            
            boolean cont = true;
            int y = 0;
            while(cont == true){
                y+=1;
                
                if(!(y< 2)){
                System.out.println();
                System.out.println("Menu: ");
                System.out.println("Option 1: next day");
                System.out.println("Option 2: see progress");
                System.out.println("Option 3: quit");
                    
                System.out.println("please enter an option: 1, 2, or 3");
                }
                String option = input.nextLine();
                
                
                    if(option.equals("1")){
                        exercise.nextDay();
                        System.out.println("Today is "+exercise.dayOfTheWeek);
                        myrun.workout(exercise.dayOfTheWeek);
                    }
                    else if(option.equals("2")){
                        myrun.displayTimes();
                        myrun.evaluate(run.mileTime, run.mileGoal);
                    }
                    else if(option.equals("3")){
                        cont = false;
                    }
                    else if(!(y<2)){
                        System.out.println("please enter a valid option");
                        System.out.println();
                    }
                
                
                
                    
            
        }
        
    }
}