package Week9;

import java.io.File;
import java.util.logging.Logger;
import java.util.logging.Level;

public class UncheckedExceptionHandling {
	private static final Logger logger = Logger.getLogger(UncheckedExceptionHandling.class.getName());

	@SuppressWarnings("null")
	public static void main(String[] args) {
		try {
			File file = null;
			System.out.println(file.getName());
		} catch (NullPointerException e) {
			System.out.println("Exception: " + e.getMessage());
			logger.log(Level.SEVERE, "NullPointerException occurred");
		}
		try {
			int arr[] = new int[5];
			System.out.println(arr[10]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception: " + e.getMessage());
			logger.log(Level.SEVERE, "ArrayIndexOutOfBoundsException occurred");
		}
		try {
			String str = null;
			System.out.println(str.length());
		} catch (NullPointerException e) {
			System.out.println("Exception: " + e.getMessage());
			logger.log(Level.SEVERE, "NullPointerException occurred");
		}
	}
}