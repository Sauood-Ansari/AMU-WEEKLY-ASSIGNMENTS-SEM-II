package Week2;
import java.util.Scanner;
public class Prob_3
{
	public static void main(String [] args)
	{
		double sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number...");
		int num=sc.nextInt();
		for(double i=1;i<=num;i++)
		{
			sum+=(1/i);
		}
		System.out.println("The reciprocal sum is: "+sum);
		sc.close();
	}
}