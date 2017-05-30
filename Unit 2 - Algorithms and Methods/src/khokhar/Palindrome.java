package khokhar;

import java.util.Scanner;
/**
 * ReverseSentence.java
 * Reverses any sentence that is given by the user
 * @author Yusuf Khokhar
 *
 */

	public class Palindrome {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter a word so that the system can check if its a Palindrome");
		String Reverse = scan.nextLine();
		System.out.print(palindrome(Reverse));
		scan.close();
	}

	public static boolean palindrome(String Reverse) {
		String Word = "";
		for ( int i = Reverse.length() - 1; i >= 0; i--){
			Word = Word + Reverse.charAt(i);
		}
		if (Reverse.equals(Word)) {
			return true;
		}
		return false;
	}
}