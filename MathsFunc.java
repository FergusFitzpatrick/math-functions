public class MathsFunc{
	public static int add(int x, int y){
		int result;
		result = x + y;
		System.out.println("Addition of " + x + " and "+ y +" = " + result);
		return result;
	}

	public static double divide( int x, int y){
		double result;
		result = x / y;
		System.out.println("Division of " + x + " and "+ y +" = " + result);
		return result;
	}

	public static int multiply( int x, int y){
		int result;
		result = x * y;
		System.out.println("Multiplication of " + x + " and "+ y +" = " + result);
		return result;
	}

	public static int subtract( int x, int y){
		int result;
		result = x - y;
		System.out.println("Subtraction of " + x + " from "+ y +" = " + result);
		return result;
	}

	public static int modulo( int x, int y){
		int result;
		result = x % y;
		System.out.println("Modulo of " + x + " and "+ y +" = " + result);
		return result;
	}

	public static int factorial(int x){
		int result =1;
		if ( x == 0 ){
			System.out.println("0! = 1");
			return x;
		}
		for ( int i = x; i> 0; i --){
			result = result * i;
		}
		System.out.println("Factorial of " + x + " = " +result);
		return result;
	}

	public static boolean isPrime(int x){
		boolean prime = true;
		if( x < 2 ){
			prime = false;
			System.out.println("Is " + x+ " prime = " + prime);
		}
		for( int i = x-1; i >1;i--){
			if ( x%i == 0){
				prime = false;
			}
		}
		System.out.println("Is " + x+ " prime = " + prime);
		return prime;
	}


























}
