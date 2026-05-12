package Week13;

import java.io.*;

class FileOperationException extends Exception {
	public FileOperationException(String msg) {
		super(msg);
	}
}

public class FileCustomOperation {
	public static void main(String[] args) {
		String filePath = "input.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

			String content = br.readLine();

			if (content == null) {
				throw new FileOperationException("Error during file reading.");
			}

			System.out.println("Operation successful");

		} catch (FileNotFoundException e) {
			System.out.println("Exception: FileInputException - File does not exist.");
		} catch (FileOperationException e) {
			System.out.println("Exception: FileInputException - " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Exception: FileInputException - Error occurred.");
		}

		System.out.println("File reader closed");
	}
}