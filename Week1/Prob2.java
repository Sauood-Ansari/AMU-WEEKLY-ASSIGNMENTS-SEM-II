package Week1;
import java.util.Scanner;
public class Prob2
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers...");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int max=num1;
		int min=num2;
		if(num1<num2)
		{
			max=num2;
			min=num1;
		}
		System.out.println("Addition of two number is: "+(num1+num2));
		System.out.println("Difference of two number is: "+(num1-num2));
		System.out.println("Product of two number is: "+(num1*num2));
		if(num2!=0)
			System.out.println("Difference of two number is: "+(num1/num2));
		else
			System.out.println("Denoinator is zero...hence division nor possible");
		System.out.println("Maximum of two number is: "+max);
		System.out.println("Minimum of two number is: "+min);

		sc.close();
	}
}