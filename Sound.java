package culminating;

import lejos.nxt.Button;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.SoundSensor;
import lejos.robotics.subsumption.Behavior;
import lejos.util.Delay;

public class Sound implements Behavior {
private boolean suppressed = false;
	@Override
	public boolean takeControl() {
		if(Button.ENTER.isDown())
		{
			return true;
		}
			return false;
	}	

	@Override
	public void action() {
		suppressed = false;
		SoundSensor clap = new SoundSensor(SensorPort.S2);
		clap.readValue();
		if (clap.readValue() >= 20)
		{
			Motor.A.setSpeed(300);
			Motor.B.setSpeed(300);
			Motor.A.forward();
			Motor.B.forward();
			Delay.msDelay(300);
			Motor.A.stop();
			Motor.B.stop();
		}
			Motor.A.stop();
			Motor.B.stop();
		
		while(!suppressed)
		{
			Thread.yield();
		}
	}

	@Override
	public void suppress() {
		suppressed = true;		
	}

}
