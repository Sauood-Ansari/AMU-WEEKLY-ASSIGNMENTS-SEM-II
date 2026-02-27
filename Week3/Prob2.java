package Week3;

import java.util.Scanner;

public class Prob2 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the three digit number...");
		int num=sc.nextInt();
		int res=num;
		int d3=num%10;
		int d2=(num%100)/10;
		int d1=num/100;
		System.out.println(res);
		for(int i=1;i<6;i++)
		{
			if(i%2==0)
			{
				int temp=d1;
				d1=d3;
				d3=temp;
			}
			else
			{
				int temp=d2;
				d2=d3;
				d3=temp;
			}
			
			res=(d1*100)+(d2*10)+d3;
			System.out.println(res);
		}
		
		sc.close();
	}

}
