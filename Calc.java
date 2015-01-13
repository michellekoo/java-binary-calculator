/** A calculator application that converts between binary and base ten decimal numbers.
  * @author Michelle Koo */

class Calc {

	private static void convert(int input) {
		int orig = input;
		int remain = 0;
		String result = "";
		while ((input / 2) != 0) {
			remain = input % 2;
			result = (Integer.toString(remain)) + result;
			input = input / 2;
		}
		remain = input % 2;
		result = (Integer.toString(remain)) + result;
		System.out.println(orig + " converted to binary is: " + result);
	}

	public static void main(String[] args) {
		System.out.println(5 / 2);
		convert(5);
		convert(156);
	}
}