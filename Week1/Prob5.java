package Week1;
import java.util.Scanner;
public class Prob5
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to do the following operations....");
		double num=sc.nextDouble();
		System.out.println("----------------Output of some mathematical operations----------------");
		System.out.println("Absolute values is: \t "+Math.abs(num));
		System.out.println("Square root is: \t"+Math.sqrt(num));
		System.out.println("Power of 2 is: \t"+Math.pow(num,2));
		System.out.println("Sine value is: \t"+Math.sin(num));
		System.out.println("Cosine value is: \t"+Math.cos(num));
		
		sc.close();
	}		
}