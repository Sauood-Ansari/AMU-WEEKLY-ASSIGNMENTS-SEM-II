package Week9;

import java.util.logging.Logger;
import java.util.logging.Level;

public class ComprehensiveHandling {
	private static final Logger logger = Logger.getLogger(ComprehensiveHandling.class.getName());

	@SuppressWarnings("null")
	public static void main(String[] args) {
		try {

			System.out.println(10 / 0);

			int[] arr = new int[5];
			System.out.println(arr[10]);

			String str = null;
			System.out.println(str.length());

		} catch (ArithmeticException e) {
			logger.log(Level.SEVERE, "ArithmeticException occurred", e);
		} catch (ArrayIndexOutOfBoundsException e) {
			logger.log(Level.SEVERE, "ArrayIndexOutOfBoundsException occurred", e);
		} catch (NullPointerException e) {
			logger.log(Level.SEVERE, "NullPointerException occurred", e);
		} finally {
			System.exit(1);
		}
	}
}