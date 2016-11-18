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

		//java miscellaenous default code
		scan.nextLine();

		// take in the operator in symbol form. - need to re-write to improve ! and prime.
		System.out.println("Please enter your either +, - , *, /, !, % or prime  : ");
		String s = scan.nextLine();
		char j = s.charAt(0);

		if (j == '+'){
			MathsFunc.add(x, y);
		}
		else if (j == '/'){
			MathsFunc.divide(x, y);
		}
		else if (j == '-'){
			MathsFunc.subtract(x, y);
		}
		else if (j == '*'){
			MathsFunc.multiply(x, y);
		}
		else if (j == '%'){
			MathsFunc.modulo(x, y);
		}
		else if (j == '!'){
			MathsFunc.factorial(x);
			MathsFunc.factorial(y);
		}
		else if (j == 'p'){
			MathsFunc.isPrime(x);
			MathsFunc.isPrime(y);
		}
		else{
			System.out.println("Invalid entry");
		}
	}
}
