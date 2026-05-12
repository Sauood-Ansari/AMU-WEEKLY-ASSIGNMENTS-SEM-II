package Week8;

import java.util.logging.Logger;

class InvalidDataException extends Exception {
	public InvalidDataException(String msg) {
		super(msg);
	}
}

class IllegalArgumentException extends Exception {
	public IllegalArgumentException(String msg) {
		super(msg);
	}
}

public class CustomExceptionHandling {

	static final Logger logger = Logger.getLogger(LoggingFrameworkIntegration.class.getName());

	public static void Validation(String str) throws InvalidDataException, IllegalArgumentException {

		String[] tokens = str.split(" ");
		if (tokens.length == 0) {
			throw new IllegalArgumentException("No Data Found");
		}
		for (String s : tokens) {
			try {
				Integer.parseInt(s);
			} catch (NumberFormatException e) {
				throw new InvalidDataException(s + " is not a valid data");
			}
		}

		System.out.println("No Invalid Data");

	}

	public static void main(String[] args) {
		String s = " ";
		try {
			Validation(s);
		} catch (InvalidDataException e) {
			System.out.println(e.getMessage());
			logger.log(java.util.logging.Level.SEVERE, "ERROR: Invalid Data");
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			logger.log(java.util.logging.Level.SEVERE, "ERROR: No Data Found");
		} catch (Exception e) {
			System.out.println("Error Occured " + e.getMessage());
		}
	}

}
