package culminating;

import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.UltrasonicSensor;
import lejos.robotics.subsumption.Behavior;

public class Ultrasonic implements Behavior {
private boolean suppressed = false;


	@Override
	public boolean takeControl() 
	{
		suppressed = false;
		UltrasonicSensor ultra = new UltrasonicSensor(SensorPort.S4);
		ultra.getDistance();
		ultra.continuous();
		return true;
		
	}

	@Override
	public void action() 
	{ 
		suppressed = false;
		UltrasonicSensor ultra = new UltrasonicSensor(SensorPort.S4);
		ultra.getDistance();
		ultra.ping();
		Motor.A.forward();
		Motor.B.forward();
		if (ultra.getDistance() <= 20)
		{
			Motor.A.stop();
			Motor.B.forward();
		}
		while(!suppressed)
		{
			Thread.yield();
		}  
			Motor.A.stop();
			Motor.B.stop();
	}

	@Override
	public void suppress() 
	{
		suppressed = true;		
	}

}
