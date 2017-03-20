package adventuregame;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import hsa_new.Console;

/**
 * 
 * 
 * 
 * Scary Amusement Park Game
 * 
 * 
 * 
 * Feb. 28, 2017
 * 
 * @author Badar Iftikhar and Yusuf Khokhar
 *
 * 
 * 
 */

public class park {

	static Console c = new Console();

	static void characterPic() {
		//image is displayed to the screen
		try {
			BufferedImage img = null;
			img = ImageIO.read(new File("resources/img1.jpg"));
			c.drawImage(img, 0, 50, 700, 500, null);
		} catch (Exception e) {
			c.println("error");
			//if pic does not load, error is displayed
		}

	}

	public static void main(String[] args) throws InterruptedException

	{

		// Random number generation 
		// Depending on which number you get, that determines the character you
		// are with

		

		String playagain = null;
		//while loop to play again after losing/winning
		do

		{
			c.clear();
			int x = (int) (Math.random() * 4) + 1;
			if (x == 1)

			{
				
				c.clear();

				c.println("Your Companion will be a body builder");
				characterPic();
				c.println(
						"As you are walking with your new friend you come upon a zombie who you think is a person in makeup.");

				c.println("The body builder attacks the zombie thinking it is real.");

				c.println("You don't even try to stop him because he's huge and its useless");

				c.println("He hits the zombie many times and its blood sprays everywhere");

				c.println("Next thing you know the zombie bites him and he screams extremely loud.");

				c.println("He turns around and looks at you with bloodstruck eyes. He charges at you.");

				c.println("Do you run to the left or right?");

				String direction;

				direction = c.readLine();
				c.clear();
				//image displayed
				try {
					BufferedImage img = null;
					img = ImageIO.read(new File("resources/img4.jpg"));
					c.drawImage(img, 0, 50, 500, 500, null);
				} catch (Exception e) {
					c.println("error");
				}
				//if right thing is not written, program asks to rewrite answer
				while (!(direction.equalsIgnoreCase("right") || direction.equalsIgnoreCase("left")))

				{

					c.clear();

					c.println("Please enter either right or left");
					direction = c.readLine();
					//display image
					try {
						BufferedImage img = null;
						img = ImageIO.read(new File("resources/img4.jpg"));
						c.drawImage(img, 0, 50, 500, 500, null);
					} catch (Exception e) {
						c.println("error");
					}

				}

				if (direction.equalsIgnoreCase("right"))

				{

					c.println("You see a sign that says exit");

					c.println("As you open the door, you immediately feel a sharp pain as if youve been stabbed");

					c.println("You are dead.");

					// Ends the game
					// Asks if you want to play again

					c.println("Would you like to play again?");

					playagain = c.readLine();

				}

				else

				{

					c.println("You are chased by a killer clown into a ferris wheel area");

					c.println("You see a gun and a knife on the floor. Do you choose the gun or knife");

					String Weaponanswer1;

					Weaponanswer1 = c.readLine();

					while (!(Weaponanswer1.equalsIgnoreCase("gun") || Weaponanswer1.equalsIgnoreCase("knife")))

					{

						c.clear();

						c.println("Please enter either gun or knife");

						Weaponanswer1 = c.readLine();

					}

					if (Weaponanswer1.equalsIgnoreCase("knife"))

					{

						c.println("The knife was not sufficient to kill the clown");

						c.println("You are dead.");

						c.println("Would you like to play again?");

						playagain = c.readLine();

					}

					else

					{
						//counter if you pick the gun first, and then the knife, you win
						c.println("You picked up the gun and run around the large round table");

						c.println("The clown starts to scream and you shoot him twice");

						int i = 0;

						while (i < 1)

						{

							i = i + 1;

						}

						c.println("the gun is now empty so you pick up the knife and stab the clown");

						c.println("the clown dies and you survive the night, you win");

						// Ends the game
						// Asks if you want to play again
						
						c.println("Would you like to play again?");

						playagain = c.readLine();

					}

				}

			}

			c.clear();
		
			if (x == 3)

			{

				// TODO Finish story here

				c.println("Your Companion will be Matthew S ~ DUMB GUY");
				characterPic();
				c.println("As you are walking with Matthew the electricity in the park suddenly shuts off.");

				c.println("All of a sudden you start hearing strange noises infront of you.");

				c.println("Matthew starts to wonder off without you");

				c.println("Do you walk towards the noise to join Matthew or do you stay put?");

				String direction;

				direction = c.readLine();

				while (!(direction.equalsIgnoreCase("stay") || direction.equalsIgnoreCase("walk")))

				{

					c.clear();

					c.println("Please enter either stay or walk");

					direction = c.readLine();

				}

				if (direction.equalsIgnoreCase("walk"))

				{

					c.println("In attempt to catch up with the dumb guy you start walking blindly in the dark");

					c.println("Some how you bump into Matthew S and he gets startled");

					c.println("He tackles you to the floor based on natural instinct.");

					c.println("Your head crashes to the floor and you die from a sever concussion.");

					// Ends the game

					// Asks if you want to play again

					c.println("Would you like to play again?");

					playagain = c.readLine();

				}

				else

				{
					c.clear();
					
					//display image
					try {
						BufferedImage img = null;
						img = ImageIO.read(new File("resources/img2.jpg"));
						c.drawImage(img, 0, 0, c.getWidth(), c.getHeight(), null);
					} catch (Exception e) {
						c.println("error");
					}
					c.println("You pull out your phone to use as a flashlight ");

					c.println("suddenly you see multiple zombies behind Matthew S and yourself");

					c.println("Do you wait for them to pass?");
					
					
					String Weaponanswer1;

					Weaponanswer1 = c.readLine();

					while (!(Weaponanswer1.equalsIgnoreCase("no") || Weaponanswer1.equalsIgnoreCase("yes")))

					{

						c.clear();

						c.println("Please enter either yes or no");

						Weaponanswer1 = c.readLine();

					}

					if (Weaponanswer1.equalsIgnoreCase("yes"))

					{

						c.println("suddenly you feel a sharp pain from their bites");

						c.println("You have died.");

						c.println("Would you like to play again?");

						playagain = c.readLine();

					}

					else

					{
						c.clear();
						//display image
						try {
							BufferedImage img = null;
							img = ImageIO.read(new File("resources/img3.jpg"));
							c.drawImage(img, 0, 0, c.getWidth(), c.getHeight(), null);
						} catch (Exception e) {
							c.println("error");
						}
						//while loop for if you choose this option first
						c.println("You run for your life with Matthew S and stumble upon a roller coaster");

						c.println("Both you and Matthew S go on the roller coaster.");

						int i = 0;

						while (i < 1)

						{

							i = i + 1;

						}

						c.println("Your friend Matthew S didnt check the back of the roller coaster.");

						c.println(
								"You see a man with an axe trying to kill you and your friend as the ride is in operation");

						c.println(
								"You sacfice Matthew S to save yourself. as the axe plunges into your friend the scary man slips and falls off the ride");

						c.println(
								"Although you lost your buddy Matthew S, you find an exit sign and escape the horrible place");

						c.println("Would you like to play again?");

						playagain = c.readLine();

					}

				}
				while (playagain.equals("yes"));
					

			}

			if (x == 2)

			{
				
				c.println("Your Companion will be a gangster");
				// display image
				characterPic();
				Thread.sleep(3000);
				c.clear();
				try {
					BufferedImage img = null;
					img = ImageIO.read(new File("resources/img5.png"));
					c.drawImage(img, 0, 50, 500, 500, null);
				} catch (Exception e) {
					c.println("error");
				}
				c.println("You see a  red bandana and a blue one. Which do you choose?");

				String bandana;

				bandana = c.readLine();

				while (!(bandana.equalsIgnoreCase("blue") || bandana.equalsIgnoreCase("red")))
				//each character has 2 options if you choose them, to win or die (50% chance each)
				{

					c.clear();

					c.println("Please enter either blue or red");
					//image displayed
					try {
						BufferedImage img = null;
						img = ImageIO.read(new File("resources/img5.jpg"));
						c.drawImage(img, 0, 50, 500, 500, null);
					} catch (Exception e) {
						c.println("error");
					}
					bandana = c.readLine();

				}

				if (bandana.equalsIgnoreCase("blue"))

				{

					int y = (int) (Math.random() * 2 + 1);

					
					if (y == 1)
					{
						c.clear();
						c.println("You run into a gang of people wearing red and get shot repeatedly.");

						c.println("You are dead.");
						c.println("Would you like to play again?");

						playagain = c.readLine();
					}

					else 
						

					{
						c.clear();
						c.println("You run into a gang of people wearing blue clothing");

						c.println("They greet you and let you pass through the alley way.");

						c.println("You hear screams in the distance of the park so you feel uncomfortable and leave.");
						c.println("Would you like to play again?");

						playagain = c.readLine();
					}

				}

				else if (bandana.equalsIgnoreCase("red"))
{

					int y = (int) (Math.random() * 2 + 1);

					if (y == 1)
						

					{
						c.clear();
						c.println("You run into a gang of people wearing blue and get stabbed repeatedly");
						c.println("You are dead.");
						c.println("Would you like to play again?");

						playagain = c.readLine();
					}					
					else
					{
						c.clear();
						c.println("You run into a gang of people wearing red clothing");

						c.println("They greet you and let you pass through the alley way.");

						c.println("You hear screams in the distance of the park so you feel uncomfortable and leave.");
						c.println("Would you like to play again?");

						playagain = c.readLine();
					}

				}

			}

			if (x == 4)

			{

				c.clear();

				// TODO Finish story here

				c.println("Your Companion will be a girl");
				characterPic();// display character image
				c.println("You are walking with her and suddenly she steals your phone.");

				c.println("She runs towards the dark water park.");

				c.println("Do you take the shortcut to get to the slides (through the water)?");

				String shortcut;

				shortcut = c.readLine();

				while (!(shortcut.equalsIgnoreCase("yes") || shortcut.equalsIgnoreCase("no")))

				{

					c.clear();
					//display image
					try {
						BufferedImage img = null;
						img = ImageIO.read(new File("resources/img5.jpg"));
						c.drawImage(img, 0, 50, 500, 500, null);
					} catch (Exception e) {
						c.println("error");
					}

					c.println("Please enter either yes or no");

					shortcut = c.readLine();

				}

				if (shortcut.equalsIgnoreCase("yes"))

				{
					c.clear();
					//display image
					try {
						BufferedImage img = null;
						img = ImageIO.read(new File("resources/img6.png"));
						c.drawImage(img, 0, 50, 500, 500, null);
					} catch (Exception e) {
						c.println("error");
					}
					c.println("You feel stinging in your legs immediately as you get in the water.");

					c.println("You try to run back but the elctric shock keeps you put.");

					c.println("You died.");

					// Ends the game

					// Asks if you want to play again

					c.println("Would you like to play again?");

					playagain = c.readLine();

				}

				else

				{

					c.println("You make your way over to the slides and come upon two.");

					c.println("Do you go left or right?");

					String slide;

					slide = c.readLine();

					while (!(slide.equalsIgnoreCase("right") || slide.equalsIgnoreCase("left")))

					{

						c.clear();

						c.println("Please enter either right or left.");

						slide = c.readLine();

					}

					if (slide.equalsIgnoreCase("left"))

					{

						c.println("you get to the bottom of the slide, but your friend is no-where to be found");

						c.println(
								"You climb back up the slide, are about to go through the right one and suddenly you hear a thud.");

						c.println("You turn around and get smashed in the head with a bat.");

						c.println("You are dead");

						c.println("Would you like to play again?");

						playagain = c.readLine();

					}

					else

					{

						c.println(
								"you slide down and find the girl who cant stop laughing and ask for your phone back.");

						c.println("She turns around and starts to run again.");

						c.println("Do you tackle her?");

						String tackle;

						tackle = c.readLine();

						while (!(tackle.equalsIgnoreCase("yes") || tackle.equalsIgnoreCase("no")))

						{

							c.clear();

							c.println("Please enter either yes or no.");

							tackle = c.readLine();

						}

						if (tackle.equalsIgnoreCase("yes"))

						{

							c.println("You start to run after her into the medival museum.");

							c.println("You jump, but slip on a banana peel and fly into a wall of spikes on display.");

							c.println("You are dead.");

							c.println("Would you like to play again?");

							playagain = c.readLine();

						}

						else

						{

							c.println("Just as she takes off you notice your phone is on the ground.");

							c.println("You take it and feel upset so you go home.");

							c.println("You win.");

							c.println("Would you like to play again?");

							playagain = c.readLine();

						}

					}

				}

			}

		} while (playagain.equalsIgnoreCase("yes"));
		//while loop end
		c.clear();

		c.close();

	}

}
