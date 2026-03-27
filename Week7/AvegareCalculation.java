package Week7;

import java.util.ArrayList;

public class AvegareCalculation 
{

	public double Average(ArrayList<Double> ar) 
	{
		double sum=0,avg;
		int count=0;		
		for(double element:ar)
		{			
			sum+=element;
			count++;
		}
		avg=sum/count;
		return avg;
	}

}
