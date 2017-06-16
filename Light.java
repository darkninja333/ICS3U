package culminating;

import lejos.nxt.Button;
import lejos.nxt.LightSensor;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.robotics.subsumption.Behavior;

public class Light implements Behavior {
private boolean suppressed = false;

	@Override 
	public boolean takeControl() {
		suppressed = false;
		LightSensor light = new LightSensor(SensorPort.S1);
		Button.waitForAnyPress();
		light.getLightValue();
		if (light.getLightValue() <= 38)
		{
			return true;
		}
		return false;
	}
	
	@Override
	public void action() {
		suppressed = false;
		LightSensor light = new LightSensor(SensorPort.S1);
		Button.waitForAnyPress();
		light.getLightValue();
		if (light.getLightValue() <= 38)
		{
			Motor.A.setSpeed(200);
			Motor.B.setSpeed(200);
			Motor.A.forward();
			Motor.B.forward();
		}
		else 
		{
			Motor.B.stop();
		}
			Motor.A.stop();
			Motor.B.stop();
		while (!suppressed)
		{
			Thread.yield();
		}
			
	}
	
	@Override
	public void suppress(){
		suppressed = true;
		
	}
	
	}
