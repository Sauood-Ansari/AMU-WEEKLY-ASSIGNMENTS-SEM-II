package Week7;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;




public class MainClass_ByCalling 
{

	public static void main(String[] args) 
	{
		try 
		{
		//ArrayList to store validated data
		ArrayList<Double> nums=new ArrayList<>();
		
		
		DataValidation obj1=new DataValidation();
		AvegareCalculation obj2=new AvegareCalculation();
		FileOutput obj3=new FileOutput();
		
		nums=(ArrayList<Double>)obj1.Validate();
		double avg=obj2.Average(nums);
		obj3.WriteFile(avg,nums);
		}
		catch(IllegalArgumentException e) 
		{
			System.out.println(e.getMessage());
		}
		
		catch (FileNotFoundException e) 
        {
            System.out.println("Input file not found.");
        }
		
		catch(IOException e)
		{
			System.out.println("Error while handling file: "+e.getMessage());
		}
		
		
	}

}
