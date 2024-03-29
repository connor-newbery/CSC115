/**************
Connor Newbery
V00921506
**************/


/*
 * A1Exercises
 *
 * Rules:
 *  - DO NOT use builtin java Arrays methods
 */
public class A1Exercises {

	/*
	 * isFactor
	 * Purpose: Determine if x can be evenly divided by y
	 * Parameters int x, int y
	 * Returns: true if x can be evenly divided by y, false otherwise
	 */
	public static boolean isFactor(int x, int y) {
		if (x % y == 0) {
			return true;
		} else {
			return false;
		}
	}

	/*
	 * calcPower
	 * Purpose: Calculate the value of base^exp
	 * Parameters: int base - the base value
	 *             int exp - the exponent value
	 * Returns: int - the value of base^exp
	 * Pre-conditions: base, exp >= 0
	 */
	public static int calcPower(int base, int exp) {
		int result = 1;
		for (int i = 0; i < exp; i++) {
			result *= base;
		}
		return result;
	}

	/*
	 * numFactors
	 * Purpose: Determine the number of factors of n
	 * Parameters: int n
	 * Returns: int - the number of factors of n
	 * Pre-conditions: n > 0
	 */
	public static int numFactors(int n) {
		int result = 0;

			for(int i = 1; i <= n; i++){
				if(n % i == 0){
					result = result+1;
				}
				else{
					result = result;
				}
			}
		return result;
	}

	/*
	 * isPrime
	 * Purpose: determine if n is a prime number
	 * Paramaters: int n
	 * Returns: boolean - true if n is prime, false otherwise
	 * Pre-conditions: n > 1
	 */
	public static boolean isPrime(int n) {
		boolean result = true;
		int test = 0;
			for(int i = 1; i <= n; i++){
				if(n % i == 0){
					test = test+1;
				}
				else{
					test = test;
				}
			}

			if(test == 2){
				result = true;
			}

			else{
				result = false;
			}

			return result;
	}

	/*
	 * greatestCommonDenominator
	 * Purpose: determine the largest integer that divides x and y
	 * Parameters: int x, int y
	 * Returns: int the largest integer that divides x and y
	 * Pre-conditions: x, y > 0
	 */
	public static int greatestCommonDenominator(int x, int y) {
		int result = 0;
		int i = 1;
		while(i <= x && i<=y){
			if (x%i==0 && y%i==0){
				result = i;
			}
			i++;
		}
		return result;
	}

	/*
	 * printArray
	 * Purpose: prints all values in the array to the console
	 *          Example format:  {1,2,3,4}
	 * Parameters: int[] - an array of integers
	 * Returns: void (nothing)
	 */
	public static void printArray (int[] array) {
		System.out.print("{");
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]);
			if(i<array.length-1) {
				System.out.print(",");
			}
		}
		System.out.println("}");
	}

	/*
	 * sumArray
  	 * Purpose: computes the sum of all values in the given array
 	 * Parameters: int[] array - the array of integers
	 * Returns: int - sum of all values in the array
	 */
	public static int sumArray (int[] array) {
		int sum = 0;
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}

	/*
	 * contains
	 * Purpose: determines whether the array contains x
	 * Parameters: int[] array - array of integers to search through
	 *             int x - the value to search for
	 * Returns: boolean - true if value is found, false otherwise
	 */
public static boolean contains(int[] array, int x){
		boolean result = true;
		for(int i = 0; i < array.length; i++){
			if(x == array[i]){
				result = true;
				break;
			}
			else{
				result = false;
			}
		}
		return result;
}
	/*
	 * countMatches
	 * Purpose: Determines the number of occurences of x in the given array
	 * Parameters: int[] array - array of integers to search through
	 *             int x - the value to search for
	 * Returns: int - the number of times x is found in the array
	 */
	 public static int countMatches(int[] array, int x){
		 int result = 0;
		 for(int i = 0; i < array.length; i++){
			 if(x == array[i]){
				 result++;
			 }
			 else{
				 result = result;
			 }
		 }
		 return result;
	 }

}
