package Week6;

import java.util.Scanner;
public class Prob3 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		//Setting String array
		
		System.out.println("Enter the number of elements...");
		int len=sc.nextInt();
		String arr[]=new String[len];
		System.out.println("Enter the elements of array...");
		for(int i=0;i<len;i++)
			arr[i]=sc.next();
		
		//sorting array lexicographically
		
		for(int i=0;i<len;i++)
		{
			for(int j=0;j<len;j++)
			{
				if(arr[i].compareToIgnoreCase(arr[j])<0)
				{
					String temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		//printing sorted array
		
		System.out.println("Sorted array is...");
		for(int i=0;i<len;i++)
			System.out.println(arr[i]+" ");

		
		
		sc.close();
	}

}
