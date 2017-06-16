package culminating;


import lejos.nxt.Motor;
import lejos.robotics.subsumption.Behavior;

public class Forward implements Behavior {
private boolean suppressed = false; 
	
	@Override
	public boolean takeControl()
	{
		suppressed = false;
		return true;
	}

	@Override
	public void action() {
		suppressed = false;
		for (int i = 0; i <= 300; i++)
		{
		Motor.A.setSpeed(200);
		Motor.A.setSpeed(200);		
		Motor.A.forward();
		Motor.B.forward();
		while (!suppressed)
		{
			Thread.yield();
		}
			Motor.A.stop();
			Motor.B.stop();
		}
		
	}

	@Override
	public void suppress() {
		suppressed = true;
	}

}
