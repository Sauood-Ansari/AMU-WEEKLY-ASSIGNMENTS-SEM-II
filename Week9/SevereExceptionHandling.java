package Week9;

import java.util.logging.Logger;
import java.util.logging.Level;

public class SevereExceptionHandling {
	private static final Logger logger = Logger.getLogger(SevereExceptionHandling.class.getName());

	@SuppressWarnings("null")
	public static void main(String[] args) {
		try {

			System.out.println(10 / 0);
		} catch (ArithmeticException e) {
			System.out.println("Exception: " + e.getMessage());
			logger.log(Level.SEVERE, "ArithmeticException occurred");

			System.out.println("Appliction terminated with error code 1");
			System.exit(0);
		}

		try {
			int[] arr = new int[5];
			System.out.println(arr[10]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception: " + e.getMessage());
			logger.log(Level.SEVERE, "ArrayIndexOutOfBoundsException occurred");

			System.out.println("Appliction terminated with error code 1");
			System.exit(0);
		}

		try {
			String str = null;
			System.out.println(str.length());
		} catch (NullPointerException e) {
			System.out.println("Exception: " + e.getMessage());
			logger.log(Level.SEVERE, "NullPointerException occurred");

			System.out.println("Appliction terminated with error code 1");
			System.exit(0);
		}
	}
}