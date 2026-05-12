package Week8;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class FinancialApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opt = 0;
		do {
			System.out.println("Choose version");
			System.out.println("1.Exit");
			System.out.println("2.Arithmetic");
			System.out.println("3.OutOfBound");
			System.out.println("4.NullPointer");
			opt = sc.nextInt();
			switch (opt) {
			case 1:
				System.out.println("Program terminated");
				break;
			case 2:
				Arithmetic();
				break;
			case 3:
				OutOfBound();
				break;
			case 4:
				NullPointer();
				break;
			default:

			}
		} while (opt != 1);
		sc.close();
	}
	
	public static void Arithmetic()
	{
		try
		{
			System.out.println(10/0);
		}catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
			log("ArihtmeticException Occured");
		}
	}
	
	public static void OutOfBound()
	{
		int arr[]=new int[5];
		try
		{
			System.out.println(arr[10]);
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
			log("ArrayIndexOutOfBoundsException Occured");
		}
	}
	
	@SuppressWarnings("null")
	public static void NullPointer()
	{
		try
		{
			String str=null;
			System.out.println("Length is: "+str.length());
		}catch(NullPointerException e)
		{
			System.out.println(e.getMessage());
			log("NullPointerException Occured");
		}
	}
	
	
	public static void log(String sent) {

		try (PrintWriter write = new PrintWriter(new FileWriter("log.txt", true))) {
			write.println(sent);
		} catch (Exception e) {
			System.out.println("Error Occured: " + e.getMessage());
		}

	}

}
