package Week7;

import java.util.*;
import java.io.*;

public class MainClass 
{
	public static ArrayList<Double> arr=new ArrayList<>();
	
	 public void Validate() 
	    {  

	        try 
	        {
	            FileInputStream fis = new FileInputStream("W7P2.txt");
	            Scanner sc = new Scanner(fis);

	            while (sc.hasNext()) 
	            {
	                try 
	                {
	                    double number = sc.nextDouble();
	                    arr.add(number);
	                    
	                } 
	                catch (InputMismatchException e) 
	                {
	                    System.out.println("Found Invalid data: "+sc.next());
	                }
	            }
	            sc.close();
	        } 
	        catch (FileNotFoundException e) 
	        {
	            System.out.println("Input file not found.");
	        } 
	        System.out.println("Valid data are: "+arr);
	    }
	 
	 
	 
	 public double Average() 
		{
			
			double sum=0,avg;
			int count=0;		
			for(double element:arr)
			{			
				sum+=element;
				count++;
			}
			avg=sum/count;
			return avg;
		}
	 
	 
	 public void WriteFile() 
		{		
			double average = Average();
			
			try 
			{
				File fileout = new File("W7Out.txt");
				
				if (!fileout.exists())
					fileout.createNewFile();

				FileOutputStream fos = new FileOutputStream(fileout);
				PrintWriter pw = new PrintWriter(fos);

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
	 

	public static void main(String[] args) 
	{
		MainClass obj=new MainClass();
		obj.Validate();
		obj.WriteFile();

	}

}
