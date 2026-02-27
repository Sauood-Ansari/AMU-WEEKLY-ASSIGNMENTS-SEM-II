package Week2;
import java.util.Scanner;
class Prob_1
{
	public static void main(String [] args)
	{
		int num,even=0,odd=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count of numbers");
		int i=sc.nextInt();
		System.out.println("Enter the numbers...");
		while(i>0)
		{
			num=sc.nextInt();
			if(num%2==0)
				even++;
			else
				odd++;
			i--;
		}
		System.out.println("Even count is: "+even);
		System.out.println("Odd count is: "+odd);
		sc.close();
	}
}