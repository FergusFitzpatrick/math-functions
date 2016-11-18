/*
* Author Fergus Fitzpatrick
*
* Date 14-11-16
*/
import java.util.*;

public class Maths{
	public static void main (String args[]){
		Scanner scan = new Scanner (System.in);

		//read in variable and command.
		System.out.println("Please enter your first integer: ");
		int x = scan.nextInt();
		System.out.println("Please enter your second integer: ");
		int y = scan.nextInt();

		// take in the operator in symbol form. - need to re-write to improve ! and prime.
		System.out.println("Please enter your either +, - , *, /, !, % or prime  : ");

		MathsFunc.add(x, y);
		MathsFunc.divide(x, y);
		MathsFunc.subtract(x, y);
		MathsFunc.multiply(x, y);
		MathsFunc.modulo(x, y);
		MathsFunc.factorial(x);
		MathsFunc.isPrime(x);
	}
}
