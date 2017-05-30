package khokhar;
/**
 * PerfectIntegers.java  
 * April 20, 2017
 * Program outputs all possible perfect integers from 1 - 1000.
 * @author Yusuf Khokhar
 *
 */
public class PerfectInteger {
	

	public static void main(String[] args) {
		System.out.println(" The following numbers are perfect integers raning from 1-1000:");
		for (int a  = 1; a < 1000; a++) {
			int factors = 0;
			for ( int b = 1; b < a; b++){
				if (isDivisible(a,b)) {
					factors = factors + b;
					}
				}
			if (factors == a) {
				System.out.println(factors);
			}
		} 
		
	}

	private static boolean isDivisible(int a, int b) {
		if ( a%b == 0) {
			return true;
		}
			else {
				return false;
			}
		}
	}
