import java.util.ArrayList;

/** A calculator application that converts between base ten decimal numbers and binary.
  * @author Michelle Koo */

class Decimal {

	private static void convert(int input) {
		// int orig = input;
		// int remain = 0;
		// String result = "";
		// while ((input / 2) != 0) {
		// 	remain = input % 2;
		// 	result = (Integer.toString(remain)) + result;
		// 	input = input / 2;
		// }
		// remain = input % 2;
		// result = (Integer.toString(remain)) + result;
		// System.out.println(orig + " converted to binary is: " + result);
		int total = 0;
		ArrayList<Integer> dig = extractDigit(input);
		for (int i = dig.size() - 1; i >= 0; i -= 1) {
			total = total * 2 + dig.get(i);
		}
		System.out.println(input + " converted to decimal is: " + total);
	}

	private static ArrayList<Integer> extractDigit(int num) {
		ArrayList<Integer> digits = new ArrayList<Integer>();
		while (num > 0) {
			digits.add(num % 10);
			num = num / 10;
		}
		return digits;
	}

	public static void main(String[] args) {
		ArrayList<Integer> test = extractDigit(101);
		for (int elem : test) {
			System.out.println(elem);
		}
		System.out.println("New Test");
		ArrayList<Integer> test2 = extractDigit(1011001);
		for (int elem : test2) {
			System.out.println(elem);
		}

		convert(1011001);
	}
}