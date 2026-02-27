package Week5;

import java.util.Scanner;
public class Book
{
	private int BookID;
	private String Title,Author,Genre;
	private Boolean isAvailable;	
	
	//======Constructor for the Book class======
	
	public Book( )
	{
		BookID=0;
		Title="";
		Author="";
		Genre="";
		isAvailable=false;
	}
	
	//======Setters======
	
	public void setBook(Scanner sc)	
	{ 
		System.out.print("Enter Book ID: ");
		BookID=sc.nextInt();
		sc.nextLine();
	
		System.out.print("Enter Book Title: ");
		Title=sc.nextLine();
	
		System.out.print("Enter Book AUthor: ");
		Author=sc.nextLine();
 
		System.out.print("Enter Book Genre: ");
		Genre=sc.nextLine();
		
		System.out.print("Is it available(true/false): ");
		isAvailable=sc.nextBoolean();
		setAvailable(isAvailable);
	}	
	
	//======Set Availability======
		
	public void setAvailable(boolean status)
	{
	    isAvailable = status;
	}

	
	//======Getters======
	
	public int getBookID()	{return BookID;}
	
	public String getTitle()	{return Title;}
	
	public String getAuthor() 	{return Author;}
	
	public String getGenre()	{return Genre;}
	
	public Boolean getAvailable() 	{return isAvailable;}		
	
	//======Display======
	
	void Display()
	{
		System.out.println("Book ID: "+getBookID());
		System.out.println("Title: "+getTitle());
		System.out.println("Author: "+getAuthor() );
		System.out.println("Genre: "+getGenre());
		System.out.println("Availability: "+getAvailable());
		System.out.println("............................................................");
	}
	
}