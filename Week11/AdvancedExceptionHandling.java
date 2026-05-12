package Week11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import java.util.logging.Logger;

public class AdvancedExceptionHandling {

	static final Logger logger = Logger.getLogger(AdvancedExceptionHandling.class.getName());

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Date(dd-mm-yyyy): ");
		String str = sc.next();

		try {
			DateTimeFormatter form = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			LocalDate date = LocalDate.parse(str, form);
			System.out.println("Valid date is: " + date.getDayOfWeek() + " " + date.getMonth() + " "
					+ date.getDayOfMonth() + " " + date.getYear());
		} catch (DateTimeParseException e) {
			System.out.println("DateTimeParseException " + e.getMessage());
			logger.severe("DateTimeParseException " + e.getMessage());
		} finally {
			sc.close();
			logger.info("Formatter Object Closed");
			System.out.println("Formatter Closed");
		}
	}

}
