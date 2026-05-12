package Week9;

import java.util.logging.Logger;
import java.util.logging.Level;

public class LoggingExample {
	private static final Logger logger = Logger.getLogger(LoggingExample.class.getName());

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		try {
			int result = 10 / 0;
		} catch (ArithmeticException e) {
			System.out.println("Exception: " + e);
			logger.log(Level.SEVERE, "ArithmeticException occurred", e);
		}
	}
}
