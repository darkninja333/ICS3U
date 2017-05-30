package khokhar;

import java.util.Scanner;
/**
 * largestNumber.java
 * Finding the largest number from an array 
 * @author Yusuf Khokhar
 * 04/04/2017
 */

public class largestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("please enter 4 numbers");
		int [] num = new int [4];
		for ( int n = 0; n < num.length; n++ ){
			num [n] = sc.nextInt();
			sc.close();
		}
		System.out.println(" The greatest number is"+GreatestNum(num));			
	}
	
	/**
	 * The system gets the highest number from an array of 4 integer numbers
	 * @param num: the 4 array numbers
	 * @return x = the Largest number out of the 4 
	 */

	public static int GreatestNum(int[] num) {
		int z = num [0];
		for ( int n = 1; n < num.length; n++){
			z = Math.max( z, num[n]);
		}
		return z;
	}

}
