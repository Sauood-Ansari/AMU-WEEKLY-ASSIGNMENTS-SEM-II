package Week4;
import java.util.Scanner;
public class Prob4 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number is sales done...");
		int sales=sc.nextInt();
		double com=0;
		if(sales>=0 && sales<=500)
			com=sales*0.02;
		else if(sales>500 && sales<5000)
			com=sales*0.05;
		else 
			com=sales*0.08;
		if(sales<0)
			System.out.println("Entered sales amount is wrong");
		else
			System.out.println("Total commission made is: "+com);
		sc.close();
	}

}
