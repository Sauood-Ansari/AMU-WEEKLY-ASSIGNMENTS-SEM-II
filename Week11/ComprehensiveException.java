package Week11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import java.util.logging.Logger;

public class ComprehensiveException {

	static final Logger logger = Logger.getLogger(ComprehensiveException.class.getName());

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Date(dd-mm-yyyy): ");
		String str = sc.next();
		try {
			try {
				DateTimeFormatter form = DateTimeFormatter.ofPattern("dd-MM-yyyy");
				LocalDate date = LocalDate.parse(str, form);
				System.out.println("Valid date is: " + date.getDayOfWeek() + " " + date.getMonth() + " "
						+ date.getDayOfMonth() + " " + date.getYear());
			} catch (DateTimeParseException e) {
				throw new DateParseException("Unparseable Date", str, 0);
			}
		} catch (DateParseException e) {
			System.out.println("DateParseException " + e.getMessage());
			logger.severe("DateParseException " + e.getMessage());
		} finally {
			sc.close();
			System.out.println("Formatter Closed");
			logger.info("Formatter Object Closed");
		}
	}
}
