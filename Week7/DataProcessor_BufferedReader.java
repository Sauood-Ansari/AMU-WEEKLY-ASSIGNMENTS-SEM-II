package Week7;

import java.io.*;

class EmptyFileException extends Exception
{
	public EmptyFileException(String s)
	{
		super(s);
	}
}

public class DataProcessor_BufferedReader {

	public static void main(String[] args) {

		double sum = 0;
		int count = 0;

		try {
			// Input Stream
			FileInputStream fis = new FileInputStream("W7P1.txt");			
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);	
						
			String line= br.readLine();
			if(line==null|| line.trim().isEmpty()) 
			{
				throw new EmptyFileException("File is empty");
			}
			
			while ((line) != null) {

				String[] numbers = line.split(" ");
				
				

				for (String num : numbers) {
					try {				
						
						double value = Double.parseDouble(num);
						sum += value;
						count++;
					} catch (NumberFormatException e) {
						System.out.println("Invalid data found: " + num + " Skipping...");
					}
				}	
				line=br.readLine();

			}

			double average = sum / count;

			// Output Stream
			File fileout = new File("W7Out.txt");
			if (!fileout.exists())
				fileout.createNewFile();

			FileOutputStream fos = new FileOutputStream(fileout);
			PrintWriter pw = new PrintWriter(fos);
			
			pw.println("************************************************");
			pw.println("Program 1");
			pw.println("Average = " + average);

			pw.close();
			fos.close();
			br.close();
			fis.close();

			System.out.println("Average calculated and written to W7Out.txt");
			

		} catch (FileNotFoundException e) 
		{
			System.out.println("Input file not found.");
		} catch (IOException e) 
		{
			System.out.println("Error while handling file.");
		} catch (EmptyFileException e) 
		{			
			System.out.println(e.getMessage());
		}
		
	}
}