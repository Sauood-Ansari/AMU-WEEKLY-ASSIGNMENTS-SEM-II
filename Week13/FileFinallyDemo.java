package Week13;

import java.io.*;
import java.util.logging.*;

public class FileFinallyDemo {
	private static final Logger logger = Logger.getLogger(FileFinallyDemo.class.getName());

	public static void main(String[] args) {
		String filePath = "input.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

			String content = br.readLine();

			if (content == null) {
				throw new IOException();
			}

			System.out.println("File content: " + content);

		} catch (IOException e) {
			System.out.println("Exception: FileInputException occurred.");
			logger.severe("FileInputException occurred.");
		} finally {
			System.out.println("File reader closed");
			logger.info("FileReader object closed successfully.");
		}
	}
}