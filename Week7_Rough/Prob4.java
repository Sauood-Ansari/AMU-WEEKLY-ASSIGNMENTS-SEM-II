package Week7;


import java.io.File;
import java.io.PrintWriter;

public class Prob4 {

	public static void main(String[] args) {

		File write = new File("W7Out.txt");
		PrintWriter print = null;
		double avg=40;

		
		
		try {
			print = new PrintWriter(write);
			
			
				try
				{
					
					print.println("Extracted value is: "+avg);
					
				}
				catch(NumberFormatException e)
				{
					print.println("Exception "+e.getMessage());
				}
			
			
		} catch (Exception e) {
			System.out.println("Some error occured: \n" + e.getMessage());
		}
		print.flush();
		print.close();
		

	}

}
