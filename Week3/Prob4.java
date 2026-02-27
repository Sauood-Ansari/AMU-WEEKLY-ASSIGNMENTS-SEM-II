package Week3;
import java.util.Scanner;
public class Prob4
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter four digit number");
		int num=sc.nextInt();
		for(int i=1000;i>0;i=i/10)
		{
			System.out.println(num/i);
			num=num%i;
		}
		
		sc.close();
	}
	

}
