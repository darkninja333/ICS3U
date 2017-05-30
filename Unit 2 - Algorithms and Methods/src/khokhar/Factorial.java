package khokhar;
import java.util.Scanner;
/**
 * Factorial.java
 * Finding the factorial of an inputed number 
 * @author Yusuf Khokhar
 * 04/04/2017
 */
public class Factorial {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter any number.");
		int num = s.nextInt();
		System.out.println(Factorial(num));
		s.close();
	}
/**
 * Finds the factorial of a number imputed by the user and returns the number
 * @param n : a counter that goes lower and lower
 * @return the factorial of the inputed number
 */
	private static int Factorial(int n) {
		if (n < 0)
		{
			return -1;
		}
		else if (n == 0)
		{
			return 1;
		}
		else
		{
			int item = n;
			while (n >1){
				item = item * (n-1);
				n--;
			}
			return item;
		}
	}
}

	
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																		




