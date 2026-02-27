package Week4;
import java.util.Scanner;
public class Prob3 
{

	public static void main(String[] args) 
	{
		int word=0,sentence=0,fchar=0,schar=0;
		char a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string...");
		String sent=sc.nextLine();
		System.out.println("Enter a first and the second character...");
		a=sc.next().charAt(0);
		b=sc.next().charAt(0);
		int len=sent.length();
		int i=0;
		while(i<len)
		{
			if(sent.charAt(i)==' ')
				word++;
			else if(sent.charAt(i)=='.' || sent.charAt(i)=='?')
				sentence++;
			else if(sent.charAt(i)==a)
				fchar++;
			else if(sent.charAt(i)==b)
				schar++;
			i++;
		}
		if(len>0)
			word++;
		System.out.println("Number of words: "+word);
		System.out.println("Nu,ber of sentence: "+sentence);
		System.out.println("Number of "+a+": "+fchar);
		System.out.println("Number of "+b+": "+schar);
		
		sc.close();
	}

}
