package Week2;
import java.util.Scanner;
class Prob_4
{
	public static void main(String [] args)
	{
		int even=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			if(i%2==0)
				even+=i;
		}
		System.out.println("Even sum is: "+even);
		sc.close();
	}
}