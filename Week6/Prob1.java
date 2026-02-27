package Week6;

import java.util.Scanner;
import java.util.StringTokenizer;
public class Prob1 
{

	public static void main(String[] args) 
	{
		String sent;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		sent=sc.nextLine();
		StringTokenizer st=new StringTokenizer(sent," ");
		while(st.hasMoreTokens())
		{
			String word=st.nextToken();
			int len=word.length();
			for(int i=len-1;i>=0;i--)
			{
				System.out.print(word.charAt(i));
			}
			System.out.print(" ");
		}
		sc.close();
	}

}
