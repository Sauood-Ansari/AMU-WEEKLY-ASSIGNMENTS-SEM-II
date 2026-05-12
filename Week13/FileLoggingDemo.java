package Week13;

import java.io.*;
import java.util.logging.*;

public class FileLoggingDemo {
	private static final Logger logger = Logger.getLogger(FileLoggingDemo.class.getName());

	public static void main(String[] args) {
		String filePath = "input.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

			String content = br.readLine();

			if (content == null) {
				throw new IOException("File is empty");
			}

			System.out.println("File content: " + content);

		} catch (FileNotFoundException e) {
			System.out.println("Exception: FileInputException - The file does not exist.");
			logger.severe("FileInputException occurred.");
		} catch (IOException e) {
			System.out.println("Exception: FileInputException - Error during reading.");
			logger.severe("FileInputException occurred.");
		}

		System.out.println("File reader closed");
	}
}