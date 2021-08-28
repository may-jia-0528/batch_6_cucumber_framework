package inClass.Java.task;

import java.util.Arrays;

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
		int [] arr = { 1, 2, 3 };
		arrayNumber(arr);
	
		System.out.println(sumNumberRange(7, 11));
		System.out.println(specialEven(259));
		
	}

//2.
	private static boolean specialEven(int number) {

		return (number % 13 == 0) || (((number + 1) % 13 == 0) || ((number - 1) % 13 == 0));
	}

//1.
//	private static void absoluteNumber(int a) {
//		int value = Math.abs(a);
//		return (value>=237+13 && value<=-13)||(value>=345-13 &&value<=345+13);
//		
//		
//	}

	// 3.
	private static int sumNumberRange(int x, int y) {
		int sum = x + y;
		return (sum >= 8 && sum <= 17) ? 20 : sum;
	}

	public static int[] arrayNumber(int[] arr) {
	
		int[] n = new int[arr.length];
		System.out.print("Original arry:");
		for (int j = 0; j <=arr.length-2; j++) {// rotate means only one index to rotate---> one time to every index. 
			n[j]=arr[j+1];
		}
		return n;
	}

	
}
