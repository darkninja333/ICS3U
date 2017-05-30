package khokhar;

import java.util.Scanner;
/**
 * SumDigits.java
 * Finding the sum of a set of numbers
 * @author Yusuf Khokhar
 * 04/04/2017
 */

public class SumDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number. (preferably a double digit number)");
		int num = sc.nextInt();
		System.out.println("The sum of all the digits will be " + SumOfDigits(num));
		sc.close();
		
	}
/**
 * Identifying the sum of all digits within a number. an example is 11, 1+1=2,
 * @param num : The number that the digits are being added to
 * @return the total sum of digits
 */
	private static int SumOfDigits(int num) {
		int Sum = 0;
		while (num > 0){
			
		Sum = Sum + (num % 10);
		num = num/10;
			
		}
		
		return Sum;
		
	}
	
}

