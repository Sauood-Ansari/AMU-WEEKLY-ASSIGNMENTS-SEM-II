package Week11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

@SuppressWarnings("serial")
class InvalidDateException extends Exception {
	public InvalidDateException(String msg) {
		super(msg);
	}
}

public class HandlingCheckedException {
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
			} catch (Exception e) {
				throw new InvalidDateException("Cheked Exception Occured");
			}
		} catch (InvalidDateException e) {

		} finally {
			sc.close();
			System.out.println("Formatter Closed");
		}
	}

}
