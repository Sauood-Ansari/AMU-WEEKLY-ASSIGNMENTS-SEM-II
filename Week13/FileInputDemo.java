package Week13;

import java.io.*;

public class FileInputDemo {
	public static void main(String[] args) {
		String filePath = "input.txt";

		try (FileReader fr = new FileReader(filePath); BufferedReader br = new BufferedReader(fr)) {

			String content = br.readLine();

			if (content == null) {
				throw new IOException("File is empty");
			}

			System.out.println("File content: " + content);

		} catch (FileNotFoundException e) {
			System.out.println("Exception: FileNotFoundException - The file " + filePath + " does not exist.");
		} catch (IOException e) {
			System.out.println("Exception: IOException - An error occurred during file reading.");
		}

		System.out.println("File reader closed");
	}
}