// Java program to demonstrate working of 
// interface.
import java.io.*;
  
// A simple interface
interface In1
{
    // variables public, static and final but why?
    final int a = 10;
  
    // public and abstract 
    void display();
}
  
// A class that implements the interface.
class TestInterface implements In1
{
    // Implementing the capabilities of
    // interface.
    public void display()
    {
        System.out.println("Hello Interface");
    }
  //Assignment - Make a second class that has a void  method that calculates two keyboard
  //inputted values in addition to display() 
  
   
}