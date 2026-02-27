package Week5;

import java.util.Scanner;
import java.util.ArrayList;

public class User
{
	private int UserID;
	private String Name;
	private ArrayList<Integer>Books;
	
	//======Constructor======
	
	public User()
	{
		UserID=0;
		Name="";
		Books=new ArrayList<>();
	}
	
	//======setter for user======
	
	public void setUser(Scanner sc)	
	{
		System.out.print("Enter User ID: ");
		UserID=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter user name: ");
		Name=sc.nextLine();
	}
	
	//======Getter======
	
	public int getUserID()	{return UserID;}
	
	//======Borrow a Book======
	 
	public void BorrowBook(Scanner sc, Catalog c)
	{
	    System.out.print("Enter the book ID you want to borrow: ");
	    int bBookID = sc.nextInt();

	    boolean success = c.borrowBookByID(bBookID);

	    if(success)
	    {
	        Books.add(bBookID);
	        System.out.println("Book borrowed successfully.");
	    }
	    else
	    {
	        System.out.println("Book not available / Invalid ID.");
	    }
	}

	
	//======Return a Book======
	
	public void ReturnBook(Scanner sc, Catalog c)
	{
	    System.out.print("Enter the book ID you want to return: ");
	    int rBookID = sc.nextInt();

	    if(Books.contains(rBookID))
	    {
	        c.returnBookByID(rBookID);
	        Books.remove(Integer.valueOf(rBookID));
	        System.out.println("Book returned successfully.");
	    }
	    else
	    {
	        System.out.println("You didn’t borrow this book.");
	    }
	}

	
	//======Display======
	
	public void Display()
	{
		System.out.println("User ID: "+UserID);
		System.out.println("Name: "+Name);
		System.out.println("Borrowed Book: "+Books);
	}
}