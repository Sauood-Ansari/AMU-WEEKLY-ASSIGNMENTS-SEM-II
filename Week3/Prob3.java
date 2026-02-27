package Week3;
import java.util.Scanner;
public class Prob3 {

	public static void main(String[] args)
	{	
		int sum=0,prod=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter four numbers");
		for(int i=1;i<=4;i++)
		{
			int num=sc.nextInt();
			sum+=num;
			prod*=num;
		}
		System.out.println("Sum of numbers is: "+sum);
		System.out.println("Product of numbers is: "+prod);
		
		sc.close();
	}

}
