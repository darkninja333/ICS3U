package khokhar;

import java.util.Scanner;
/**
 * ReverseSentence.java
 * Reverses any sentence that is given by the user
 * @author Yusuf Khokhar
 *
 */
public class BackwardsProgram {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner (System.in);
		System.out.println("Please enter a sentance that you want to be outputted backwards");
			String[] sent = scan.nextLine().split("  ");
			
		for ( int i = 0; i < sent.length; i++){
		for (int x = sent[i].length() - 1; x >= 0; x--)
		System.out.print(sent[i].charAt(x));
		scan.close();
	}
		System.out.print("  ");
	
		
	}

}
