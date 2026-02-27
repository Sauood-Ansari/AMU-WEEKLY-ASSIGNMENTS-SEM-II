package Week1;
import java.util.Scanner;
public class Prob4
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		double num=sc.nextDouble();
		double floor =(int)num;
		double ceil=floor;
		double round=floor; 
		int numint=(int)num;
		double ld=num-floor;
		if(ld>=0.5)
			round=floor+1;
		if(ld>0)
			ceil=floor+1;
		System.out.println("Original number is: "+num);
		System.out.println("Round value is: "+round);
		System.out.println("Ceil value is: "+ceil);
		System.out.println("Floor value is: "+floor);
		System.out.println("Integer value is: "+numint);
		
		sc.close();
	}
}