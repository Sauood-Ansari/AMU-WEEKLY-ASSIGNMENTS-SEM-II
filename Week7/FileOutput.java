package Week7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class FileOutput 
{

	public void WriteFile(double average,ArrayList<Double> arr) 
	{
		
		
		try 
		{
			File fileout = new File("W7Out.txt");
			
			if (!fileout.exists())
				fileout.createNewFile();

			FileOutputStream fos = new FileOutputStream(fileout);
			PrintWriter pw = new PrintWriter(fos);
			
			pw.println("************************************************");
			pw.println("Main Program");
			pw.println("Valid Data: "+arr);
			pw.println("Average = " + average);

			pw.close();
			fos.close();

			System.out.println("Average calculated is fed into W7Out.txt");
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("Input file not found.");
		} 
		catch (IOException e) 
		{
			System.out.println("Error while handling file.");
		}

	}

}
