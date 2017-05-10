import lejos.util.*;
import lejos.nxt.*;
import lejos.robotics.navigation.*;
public class Move
{
  DifferentialPilot pilot;
  public static void main (String[] args) 
  {
    Move mv = new Move();
    mv.pilot = new DifferentialPilot(6.0f, 18.0f, Motor.A, Motor.C);
    mv.go();
    
    //Button.waitForAnyPress();
  }
  public void go()
  {
      pilot.travel(20, true);
      pilot.rotate(90);
      pilot.travel(20, true);
      pilot.rotate(90);
      pilot.travel(20, true);
      pilot.rotate(90);
      pilot.travel(20, true);
      pilot.rotate(90);
      pilot.travel(20, true);
  }
}