 package badar;


import hsa_new.Console;


/**
 *
 * Scary Amusement Park Game
 * 
 * Feb. 28, 2017
 * @author Badar Iftikhar and Yusuf Khokar 
 *
 */
public class RollerCoaster {

	static Console c = new Console();

	public static void main(String[] args) {

		//Random number generation occurs here
		//Depending on which number you get, that determines the character you are

		int x = (int) (Math.random() *4) + 1;
	 if (x == 1) {
		 //TODO Finish story here
		c.println("Your Companion will be a body builder");
		c.println("As you are walking with your new friend you come upon a zombie who you think is a person in makeup.");
		c.println("The body builder attacks the zombie thinking it is real.");
		c.println("You don't even try to stop him because he's huge and its useless");
		c.println("He hits the zombie many times and its blood sprays everywhere");
		c.println("Next thing you know the zombie bites him and he screams extremely loud.");
		c.println("He turns around and looks at you with bloodstruck eyes. He charges at you.");

		
		c.println("Do you run to the left or right?");
		String direction;
		direction = c.readLine();
		boolean right = true;
		
		if (right == true) {

			

		}

		

		

	 	}




	}




}
