package Week2;
import java.util.Scanner;
public class Prob_2
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Number\tSquare\tCube");
		for(int i=1;i<=5;i++)
		{
			System.out.print(i+"\t");
			System.out.print(Math.pow(i,2)+"\t");
			System.out.println(Math.pow(i,3)+"\t");
		}
		sc.close();
	}
}