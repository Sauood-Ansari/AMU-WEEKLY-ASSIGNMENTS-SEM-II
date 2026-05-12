package Week13;

import java.io.*;

public class FileOperationDemo {
	public static void main(String[] args) {
		String filePath = "input.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

			String content = br.readLine();

			if (content == null) {
				throw new IOException();
			}

			System.out.println("Operation successful");

		} catch (FileNotFoundException e) {
			System.out.println("Exception: FileInputException - File not found.");
		} catch (IOException e) {
			System.out.println("Exception: FileInputException - Error during file reading.");
		}

		System.out.println("File reader closed");
	}
}