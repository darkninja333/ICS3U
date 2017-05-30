package khokhar;
import java.util.Scanner;
/**
 * Gcf.java
 * finds the Greatest common factor from two different numbers	`
 * @author Yusuf Khokhar
 * 04/04/2017
 */
public class Gcf {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter your first number");
	int x = sc.nextInt();
	System.out.println("Please enter your second number");
	int y = sc.nextInt();
	System.out.print("The greatest Common Factor between these two numbers is " + GCF(x,y));
	sc.close();
	
		}
	/**
	 * Finding the greatest common factor between 2 numbers
	 * @param x : the first number inputed by the user
	 * @param y : The second number inputed by the user
	 * @return : The greatest Common Factor of the two numbers
	 */

	public  static int GCF(int x, int y) {
		if(x > y){
			for(int n = x; n > 0; n--){
				if (isDivisible(x,n) == true && isDivisible (y,n))
				{
					return n;
				} 
			}
		}
	if (y > x){
		for (int n = y; n >0 ; n--)
		{
			if( isDivisible(y, n) == true && isDivisible (x, n) == true){
				return n;
				}
			}
		}
	return x;
}

	public static boolean isDivisible(int x, int y) {
		if ( x % y == 0){
			return true;
		}
		return false;
	}
 
}
