package Week2;
import java.util.Scanner;
class Week2
{
	public static void p1(Scanner sc)
	{
		int num,even=0,odd=0;
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

	}

	public static void p2()
	{
		System.out.println("Number\tSquare\tCube");
		for(int i=1;i<=5;i++)
		{
			System.out.print(i+"\t");
			System.out.print(Math.pow(i,2)+"\t");
			System.out.println(Math.pow(i,3)+"\t");
		}

	}

	public static void p3(Scanner sc)
	{
		double sum=0;
		System.out.println("Enter the number...");
		int num=sc.nextInt();
		for(double i=1;i<=num;i++)
		{
			sum+=(1/i);
		}
		System.out.println("The reciprocal sum is: "+sum);

	}

	public static void p4(Scanner sc)
	{
		int even=0;
		System.out.println("Enter the numbers");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			if(i%2==0)
				even+=i;
		}
		System.out.println("Even sum is: "+even);

	}

	public static void p5(Scanner sc)
	{
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

	}
	public static void main(String [] args)
	{
		int opt=0;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("Choose any one option...");
			System.out.println("1.Run the first program");
			System.out.println("2.Rum the second program");
			System.out.println("3.Run the third program");
			System.out.println("4.Run the fourth program");
			System.out.println("5.Run the fifth program");
			System.out.println("6.Exit the program");
			opt=sc.nextInt();
			switch(opt)
			{
				case 1:
					p1(sc);
					break;
				case 2:
					p2();
					break;
				case 3:
					p3(sc);
					break;
				case 4:
					p4(sc);
					break;
				case 5:
					p5(sc);
					break;
				case 6:
					System.out.println("Program terminated...Thank you");
					break;
				default:
					System.out.println("Wrong option choose again");

			}
		}while(opt!=6);	
		sc.close();
	}
}