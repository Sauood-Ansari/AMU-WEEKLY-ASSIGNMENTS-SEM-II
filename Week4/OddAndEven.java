package Week4;
import java.util.Scanner;
public class OddAndEven 
{
	public static void main(String[] args) 
	{
	TestOddAndEven toe=new TestOddAndEven() ;
		int odd=0,even=0,num=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter five numbers...");
		for(int i=1;i<=5;i++)
		{
			num=sc.nextInt();
			if(toe.fun(num))
				even++;
			else
				odd++;
				
		}
		System.out.println("Number of Odd: "+odd);
		System.out.println("Number of Even: "+even);
		sc.close();
	}
}
//.....................................................................
//Second class for testing
class TestOddAndEven
{
	public boolean fun (int num)
	{
		if(num%2==0)
			return true;
		else 
			return false;
	}
}
