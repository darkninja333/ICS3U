package khokhar;

import hsa_new.Console;

/**
 * 
 * Hello Console 
 * @author Yusuf Khokhar
 * 
 * 
 * 
 *
 */
public class HelloConsole {

	public static void main(String[] args) {
		Console c = new Console();
		c.println("Hello Boi");
		c.println("what is your age");
		
		int age = c.readInt();
		c.println("You are "+ age + " Years old");
		
		

	}

}
