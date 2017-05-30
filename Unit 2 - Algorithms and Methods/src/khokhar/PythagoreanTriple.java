package khokhar;
/**
 * PythagoreanTripleProgram.java  
 * April 20, 2017
 * Program outputs all possible values of x and y which will produce a perfect square
 * @author Yusuf Khokhar
 *
 */

public class PythagoreanTriple {

	public static void main(String[] args) {
		System.out.print("The System will now output all possible values of x and y that produce a perfect square.");
		System.out.println("The following will produce:");
		System.out.println( "x" + " " + "y" + " " + "z" );
		for (int x = 1; x<100; x++ ) {
		for ( int y = 1; y<100; y++) {
			int z = (int) (Math.pow (x, 2) + Math.pow(y, 2));
			if (perfectsquare (z) == true) {
			int n = (int) Math.sqrt (z);
					  System.out.println( x + " " + y + " " + n);
					
					}
				}
			}
		}
	
/**
* The system determines if a number is going to be a perfect square
* @param The input number 
* @return True/false, perfect square is the word
*/
		
	public static boolean perfectsquare(int z) {
		int x = (int)Math.sqrt(z);
		double check = Math.pow(x, 2);
		if (check == z) {
		return true;
		} 
		return false;
	}

}
  