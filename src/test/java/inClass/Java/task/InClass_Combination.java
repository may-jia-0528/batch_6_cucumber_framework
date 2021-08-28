package inClass.Java.task;

import java.util.Arrays;

public class InClass_Combination {
	public static void main(String[] args) {
		System.out.println(withinSomenum(-134567));
		 int[] n = new int[]{1,2,3};
		 int[] output = new int[3];
			output[0]= n[1];
			output[1]= n[2];
			output[2]= n[0];		
		
		System.out.println(Arrays.toString(output));
		
		
		
	}
	//1.Given an integer, return true if it is within 13 of 237 or 345. 
	//Note: Math.abs(num) computes the absolute value of a number.
	public static boolean withinSomenum(int num) {
		int n =  Math.abs(num);
		String s =String.valueOf(n);
		if (s.contains("13")||s.contains("237")||s.contains("345")) {
			return true;
		}else {}
		return false;	
		
		//1.Given an integer, return true if it is within 13 of 237 or 345. 
		//Note: Math.abs(num) computes the absolute value of a number.
	}
	public static boolean specialnumber(int n) {
		return (n % 13 == 0) ||((n +1) % 13 ==0)||((n-1) %13 ==0);
		
	}

	
	public static int sumTwoNum(int a, int b) {
		int sum = a+b;
		if(sum > 8 && sum <17) {
			return 20;
		}else {
			return sum;
		}
		
	}
	
		}
		
	
	
	

//		
//		
//		
//		4.Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.
//
//			input([1, 2, 3])  expecting output [2, 3, 1]
//			input([5, 11, 9]) expecting output [11, 9, 5]
//			input([7, 0, 0])  expecting output [0, 0, 7]
//			
//		5.optional
//			https://codingbat.com/prob/p199612
//			https://codingbat.com/prob/p138990
//	 */
//}
