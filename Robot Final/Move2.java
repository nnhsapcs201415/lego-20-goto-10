import lejos.nxt.*;
import lejos.robotics.navigation.*;

/**
 * Robot that stops if it hits something before it completes its travel.
 */
public class Move2 {
  DifferentialPilot pilot;
  TouchSensor bump = new TouchSensor(SensorPort.S1);

  public void go() {
    pilot.travel(20, true);
    while (pilot.isMoving()) {
      if (bump.isPressed()) pilot.stop();
    }
    System.out.println(" "+pilot.getMovement().getDistanceTraveled());
    Button.waitForAnyPress();
  }

  public static void main(String[] args) {
    TravelTest traveler = new TravelTest();
    traveler.pilot = new DifferentialPilot(2.25f, 5.5f, Motor.A, Motor.C);
    traveler.go();
  }
}