/*
 * A1Tester
 * A class to test the methods in Assignment 1
 */
public class A1Tester {

	private static int testPassCount = 0;
	private static int testCount = 0;

	public static void main(String[] args) {

		// PART 1 - variables, methods, ifs, and loops

		/* I have correctly implemented the first two methods for you.
		 * Read through the tests and look at the implementation
		 * in the A1Exercises.java file to get an idea of what is expected
		 * for the other parts of the assignment you will complete yourself
		 */
		testIsFactor();
		testCalcPower();

		/* I have also provided you with some tests for numFactors */
		//testNumFactors();


		/* Uncomment the method call below when you have finished numFactors
		 * You should write more tests for isPrime
		 */
		testIsPrime();


		/* Uncomment the method call below when you have finished isPrime
		 * You will need to write tests for this method
		 */
		testGreatestCommonDenominator();



		// PART 2 - arrays

		/* Some examples to demonstrate how to intialize and test arrays.
		 * The printArrays and sumArray methods have been completed for you.
		 */
		printArrayExample();
		testSumArray();

		testContains();
		testCountMatches();

		System.out.println("Passed " + testPassCount + "/" + testCount + " tests");
	}

	public static void testIsFactor() {
		boolean result = false;

		result = A1Exercises.isFactor(3, 3);
		displayResults("isFactor(3,3)", result==true);

		result = A1Exercises.isFactor(3, 2);
		displayResults("isFactor(3,2)", result==false);

		result = A1Exercises.isFactor(8, 2);
		displayResults("isFactor(8,2)", result==true);

		result = A1Exercises.isFactor(42, 5);
		displayResults("isFactor(42,5)", result==false);

		result = A1Exercises.isFactor(102, 17);
		displayResults("isFactor(102,17)", result==true);
	}

	public static void testCalcPower() {
		int result = 0;
		int expected = 0;

		result = A1Exercises.calcPower(2, 0);
		displayResults("calcPower(2,0)", result==1);

		result = A1Exercises.calcPower(2, 3);
		expected = 2*2*2;
		displayResults("calcPower(2,3)", result==expected);
		//System.out.println("Expected: "+expected+", result: "+result);

		// Uncomment the print statements to help with debugging

		result = A1Exercises.calcPower(5, 4);
		expected = 5*5*5*5;
		displayResults("calcPower(5,4)", result==expected);
		//System.out.println("Expected: "+expected+", result: "+result);

		result = A1Exercises.calcPower(13, 2);
		expected = 13*13;
		displayResults("calcPower(13,2)", result==expected);
		//System.out.println("Expected: "+expected+", result: "+result);
	}

	public static void testNumFactors() {
		int result = 0;
		int expected = 0;

		result = A1Exercises.numFactors(1);
		displayResults("numFactors(1)", result==1);

		result = A1Exercises.numFactors(6);
		expected = 4; // There are 4 factors of 6: 1, 2, 3, and 6
		displayResults("numFactors(6)", result==expected);
		//System.out.println("Expected: "+expected+", result: "+result);

		result = A1Exercises.numFactors(24);
		expected = 8; // There are 8 factors of 6: 1,2,3,4,6,8,12,24
		displayResults("numFactors(24)", result==expected);
		//System.out.println("Expected: "+expected+", result: "+result);

		result = A1Exercises.numFactors(51);
		expected = 4; // There are 4 factors of 6: 1,3,17,51
		displayResults("numFactors(51)", result==expected);
		//System.out.println("Expected: "+expected+", result: "+result);
	}

	public static void testIsPrime() {
		boolean result = false;

		result = A1Exercises.isPrime(2);
		displayResults("isPrime(2)", result==true);

		result = A1Exercises.isPrime(6);
		displayResults("isPrime(6)", result == false);

		result = A1Exercises.isPrime(7);
		displayResults("isPrime(7)", result == true);

		// ADD MORE TESTS
		// some that are prime numbers, some that are not
	}

	public static void testGreatestCommonDenominator() {
		int result = 0;
		int expected = 0;
		result = A1Exercises.greatestCommonDenominator(15,20);
		expected = 5;
		displayResults("greatestCommonDenominator(15,20)", result == expected);
	//	System.out.println("Expected: "+expected+", result: "+result);

		result = A1Exercises.greatestCommonDenominator(1111,2222);
		expected = 1111;
		displayResults("greatestCommonDenominator(1111,2222))", result == expected);
		//System.out.println("Expected: "+expected+", result: "+result);

		result = A1Exercises.greatestCommonDenominator(64,48);
		expected = 16;
		displayResults("greatestCommonDenominator(64,48)", result == expected);
		//System.out.println("Expected: "+expected+", result: "+result);
	}

	public static void printArrayExample() {
		int array0[] = {};
		int array1[] = {8};
		int array2[] = {2, 3, 2, 0};
		int array3[] = {-1, 2, 4, 1, 3};

		A1Exercises.printArray(array0);
		A1Exercises.printArray(array1);
		A1Exercises.printArray(array2);
		A1Exercises.printArray(array3);
	}

	public static void testSumArray() {
		int result = 0;
		int expected = 0;
		int array0[] = {};
		int array1[] = {8};
		int array2[] = {2, 3, 2, 0};
		int array3[] = {-1, 2, 4, 1, 3};

		result = A1Exercises.sumArray(array0);
		displayResults("sumArray(array0)", result==0);

		result = A1Exercises.sumArray(array1);
		expected = 8;
		displayResults("sumArray(array1)", result==expected);
		//System.out.println("Expected: "+expected+", result: "+result);

		result = A1Exercises.sumArray(array2);
		expected = 2+3+2;
		displayResults("sumArray(array2)", result==expected);
		//System.out.println("Expected: "+expected+", result: "+result);

		result = A1Exercises.sumArray(array3);
		expected = -1+2+4+1+3;
		displayResults("sumArray(array3)", result==expected);
		//System.out.println("Expected: "+expected+", result: "+result);
	}

	public static void testContains() {
		boolean result;
		int arr1[] = {2, 3, 2, 0};
		int arr2[] = {-1, 2, 4, 1, 3};


		result = A1Exercises.contains(arr1, 2);
		displayResults("arr1 contains 2", result==true);
		//System.out.println("Expected: true, result: "+result);

		result = A1Exercises.contains(arr1, 0);
		displayResults("arr1 contains 0", result==true);
		//System.out.println("Expected: true, result: "+result);

		result = A1Exercises.contains(arr1, 4);
		displayResults("arr1 contains 4", result==false);
	//	System.out.println("Expected: false, result: "+result);

		result = A1Exercises.contains(arr2, -1);
		displayResults("arr2 contains -1", result==true);
		//System.out.println("Expected: true, result: "+result);

		result = A1Exercises.contains(arr2, 3);
		displayResults("arr2 contains 3", result==true);
	//	System.out.println("Expected: true, result: "+result);

		result = A1Exercises.contains(arr2, 5);
		displayResults("arr2 contains 5", result==false);
		//System.out.println("Expected: false, result: "+result);

	}

	public static void testCountMatches() {
		int result = 0;
		int expected = 0;
		int arr1[] = {2, 3, 2, 0};
		int arr2[] = {2, 4, 5, 3, -1, 5, 7 ,5, 0};
		int arr3[] = {1, 3, 5, 3, 1};

		result = A1Exercises.countMatches(arr1, 1);
		displayResults("countMatches(arr1, 1)", result==0);

		result = A1Exercises.countMatches(arr2, 5);
		displayResults("countMatches(arr1, 1)", result==3);

		result = A1Exercises.countMatches(arr3, 1);
		displayResults("countMatches(arr1, 1)", result==2);

		result = A1Exercises.countMatches(arr1, 2);
		displayResults("countMatches(arr1, 1)", result==2);


	}

	public static void displayResults (String testName, boolean passed) {
		/* There is some magic going on here getting the line number
		* Borrowed from:
		* http://blog.taragana.com/index.php/archive/core-java-how-to-get-java-source-code-line-number-file-name-in-code/
		*/

		testCount++;
		if (passed) {
			System.out.println ("Passed test: " + testName);
			testPassCount++;
		} else {
			System.out.println ("Failed test: " + testName + " at line "
									+ Thread.currentThread().getStackTrace()[2].getLineNumber());
		}
	}
}
