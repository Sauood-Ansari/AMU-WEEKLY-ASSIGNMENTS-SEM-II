package Week13;

import java.io.*;
import java.util.logging.*;

class FileInputException extends Exception {
    public FileInputException(String msg) {
        super(msg);
    }
}

public class CompleteFileSystem {
    private static final Logger logger = Logger.getLogger(CompleteFileSystem.class.getName());

    public static void main(String[] args) {
        String filePath = "input.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String content = br.readLine();

            if (content == null) {
                throw new FileInputException("Empty file.");
            }

            System.out.println("Operation successful");

        } catch (FileNotFoundException e) {
            System.out.println("Exception: FileInputException - File does not exist.");
            logger.severe("FileInputException occurred.");
        } catch (FileInputException e) {
            System.out.println("Exception: FileInputException - " + e.getMessage());
            logger.severe("FileInputException occurred.");
        } catch (IOException e) {
            System.out.println("Exception: FileInputException - Error reading file.");
            logger.severe("FileInputException occurred.");
        } finally {
            System.out.println("File reader closed");
            logger.info("FileReader object closed successfully.");
        }
    }
}