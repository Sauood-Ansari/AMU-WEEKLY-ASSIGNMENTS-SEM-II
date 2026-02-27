package Week1;
import java.util.Scanner;
public class Prob1
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the address");
		String add=sc.nextLine();
		System.out.print("Address of the student is: ");
		System.out.println(add);
		
		sc.close();
	}
}