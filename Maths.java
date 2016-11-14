import java.util.*;

public class Maths{
	public static void main (String args[]){
		Scanner scan = new Scanner (System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();

		MathsFunc.add(x, y);
		MathsFunc.divide(x, y);
		MathsFunc.subtract(x, y);
		MathsFunc.multiply(x, y);
		MathsFunc.modulo(x, y);
		MathsFunc.factorial(x);
		MathsFunc.isPrime(x);
	}
}
