package inClass.Java.task;

public class InClass_String {

	/**
	 * 
	 * 1.Given a string, return a "rotated left 2" version where the first 2 chars
	 * are moved to the end. The string length will be at least 2.
	 * 
	 * input("Hello") → "lloHe" input("java") → "vaja" input("Hi") → "Hi"
	 * 
	 */

	public static void main(String[] args) {
		rotated("Hello");
		rotated("java");
		rotated("H");
		middleThreeChars("strings");
		System.out.println(endsInes("codes"));
		System.out.println(endsInes("s"));
		System.out.println(endsInes("Practice"));

	}

	public static void rotated(String input) {
		if (input.length() >= 2) {
			String output = input.substring(input.length()-2) + input.substring(0,input.length()-2 ) + "";
			System.out.println(output);
		} else {
			System.out.println("This string length is too short");
		}

	}

	/*
	 * 2.Given a string of odd length, return a string made of the middle three
	 * chars, so the string "strings" yields "rin". The string length will be at
	 * least 3.
	 * 
	 * input("strings") → "rin" input("codes") → "ode" input("Practices") → "cti"
	 */
	public static void middleThreeChars(String s) {
		if (s.length() % 2 != 0 && s.length() >= 3) {
			String output2 = "" + s.substring(((s.length() - 1) / 2) - 1, ((s.length() - 1) / 2) + 2);
			System.out.println(output2);

		} else {
			System.out.println("This string is not odd length");
		}
	}

	public static boolean endsInes(String str) {

		return str.endsWith("es");
	}

}

/*
 * 3.Given a string, return true if it ends in "es".
 * 
 * input("codes") → true input("s") → false input("Practice") → false
 * 
 * 4.optional https://codingbat.com/prob/p122943
 * 
 */
