import lejos.nxt.*;
import lejos.robotics.objectdetection.*;
public class HelloWorld
{
    
  public static void main (String[] args) 
  {
    
    Motor.A.forward();
    Motor.C.forward();
    Button.waitForAnyPress();
    

  }
  

}