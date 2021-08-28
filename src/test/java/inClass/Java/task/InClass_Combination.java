package inClass.Java.task;

public class InClass_Combination {

	/**
	 * 1.Given an integer, return true if it is within 13 of 237 or 345. Note:
	 * Math.abs(num) computes the absolute value of a number.
	 * 
	 * 2.We'll say a number is special if it is a multiple of 13 OR if it is one
	 * more/less than a multiple of 13. Return true if the given non-negative number
	 * is special.
	 * 
	 * 3.Given 2 integer, a and b, return their sum. However, if sums in the range
	 * between 8 - 17, then just return 20.
	 * 
	 * 4.Given an array of ints length 3, return an array with the elements "rotated
	 * left" so {1, 2, 3} yields {2, 3, 1}.
	 * 
	 * input([1, 2, 3]) expecting output [2, 3, 1] input([5, 11, 9]) expecting
	 * output [11, 9, 5] input([7, 0, 0]) expecting output [0, 0, 7]
	 * 
	 * 5.optional https://codingbat.com/prob/p199612
	 * https://codingbat.com/prob/p138990
	 */

	public static void main(String[] args) {
		
		absoluteNumber(-123245);
		System.out.println(sumNumberRange(7, 11));
		System.out.println(specialEven(259));
		
	}

//2.
	private static boolean specialEven(int number) {

		return (number % 13 == 0) || (((number + 1) % 13 == 0) || ((number - 1) % 13 == 0));
	}

//1.
	private static void absoluteNumber(int a) {
		int value = Math.abs(a);
		String s = String.valueOf(value);
		if ((s.contains("237") || s.contains("345") || s.contains("13"))) {
			System.out.println("True");

		} else {
			System.out.println("false");

		}

	}

	// 3.
	private static int sumNumberRange(int x, int y) {
		int sum = x + y;
		return (sum >= 8 && sum <= 17) ? 20 : sum;
	

	private static void arrayNumber(int[] a, int b) {
		int[] arr = { 1, 2, 3 };
		int[]n = new int[a.length];
		System.out.print("Original arry:");
		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}
		

	}

	
	}

}
