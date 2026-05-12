package Week13;

import java.io.*;

class FileInputException extends Exception {
	public FileInputException(String message) {
		super(message);
	}
}

public class CustomFileInput {
	public static void main(String[] args) {
		String filePath = "input.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

			String content = br.readLine();

			if (content == null) {
				throw new FileInputException("An error occurred during file reading.");
			}

			System.out.println("File content: " + content);

		} catch (FileNotFoundException e) {
			System.out.println("Exception: FileInputException - The file " + filePath + " does not exist.");
		} catch (FileInputException e) {
			System.out.println("Exception: FileInputException - " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Exception: FileInputException - An error occurred during file reading.");
		}

		System.out.println("File reader closed");
	}
}