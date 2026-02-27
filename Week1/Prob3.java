package Week1;
import java.util.Scanner;
public class Prob3
{
	public static void main(String [] args)
	{
		double [] F=new double[5];
		double [] C=new double[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter five temperature in Fahrenheit");
		for(int i=0;i<5;i++)
		{
			F[i]=sc.nextDouble();
			C[i]=(F[i]-32)/1.8;
		
		}
		System.out.println("S.No"+"\t"+"Fahrenheit"+"\t"+"Celsius");
		for(int i=0;i<5;i++)
		{
			System.out.println((i+1)+"\t"+F[i]+"\t\t"+C[i]);
		}
		
		sc.close();
	}
}