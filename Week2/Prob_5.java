package Week2;
import java.util.Scanner;
public class Prob_5
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the height of the triangle");
		int num=sc.nextInt();
		int temp=1;
		System.out.println("..................................................");
		System.out.println("Floyd's Triangle");
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((temp++)+" ");
			}
			System.out.println();
		}
		System.out.println("..................................................");
		System.out.println("Alternating Patter");
		for(int i=1;i<=num;i++)
		{
			if(i%2!=0)
				temp=1;
			else
				temp=0;
			for(int j=1;j<=i;j++)
			{
				System.out.print(temp+" ");
				if(temp==0)
					temp=1;
				else
					temp=0;

			}
			System.out.println();
		}
		sc.close();

	}
}