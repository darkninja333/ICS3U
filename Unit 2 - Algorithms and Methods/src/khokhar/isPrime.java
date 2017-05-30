package khokhar;

import java.util.Scanner;

public class isPrime {
	/** 
	 * the program checks if the inputed number is a prime number and outputs true or false if it is
	 * @author Yusuf Khokhar
	 * 04/04/2017
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number to check if it is a prime number");
		int x = scan.nextInt();
		if(prime(x)==true){
		System.out.println("The number you have entered is a prime number");
		scan.close();
		
	}
		else if(prime(x) == false){
			System.out.println("The number you have entered is not a prime number");
	}
	}
	
	/**
	 * Checks if the number is divisible by any other number less than it 
	 * @param a : the number that the user inputs will 
	 * @return b 
	 */

	public static boolean isDivisble(int a, int b){
		if (a % b == 0){
			return true;
			
		}
			return false; 
	}
	public static boolean prime(int number){
			for(int x = 2; x < number / 2; x++)
			if(number % x ==0){
			return false;
			}
			return true;
	}
	


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}

