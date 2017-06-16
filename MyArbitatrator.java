
package culminating;

import lejos.robotics.subsumption.Arbitrator;
import lejos.robotics.subsumption.Behavior;

public class MyArbitatrator {
	public static void main(String[] args) {
		
		
		Behavior b1 = new Exit();
		Behavior b3 = new Forward();
		Behavior b4 = new Light();
		Behavior b5 = new Sound();
		Behavior b2 = new Ultrasonic();
		
		Behavior [] behaviors = {b4,b2,b3,b5, b1};
		
		Arbitrator arby = new Arbitrator(behaviors);  
		arby.start();
	}

	}
