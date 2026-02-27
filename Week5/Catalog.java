package Week5;
import java.util.Scanner;
import java.util.ArrayList;

public class Catalog
{
	private ArrayList<Book>CatalogList;
	
	//======Constructor======
	
	public Catalog()
	{
		CatalogList=new ArrayList<>();
	}
	
	//======function to add book======
	
	public void Add(Scanner sc, int choice)
	{
			
			Book b;
			if (choice==1)
				b=new Book();
			else if(choice==2)
				b=new Fiction();
			else
				b=new NonFiction();
			b.setBook(sc);
			CatalogList.add(b);
						
	}
	
	//=======Function to update the catalog======
	public void Update(Scanner sc) 
	{ 
		System.out.print("Enter the BookID : ");
		int ID=sc.nextInt(); 
		ChangeAvailability(ID,sc); 
	}
	
	//======Borrow book======
	public boolean borrowBookByID(int ID)
	{
	    for(Book b : CatalogList)
	    {
	        if(b.getBookID() == ID && b.getAvailable())
	        {
	            b.setAvailable(false);
	            return true;
	        }
	    }
	    return false;
	}

	//======Return book======
	public void returnBookByID(int ID)
	{
	    for(Book b : CatalogList)
	    {
	        if(b.getBookID() == ID)
	        {
	            b.setAvailable(true);
	        }
	    }
	}

	//======Function to change availability======
	
	public void ChangeAvailability(int ID,Scanner sc)
	{
		boolean status;
		for(Book b:CatalogList)
		{
			if(b.getBookID()==ID)
			{
				System.out.println("Is the Book available(Yes/No)?");
				String temp=sc.next();
				if(temp.equalsIgnoreCase("yes"))
					status=true;
				else 
					status=false;
				
				b.setAvailable(status);
			}
		}
	}
	
	//======Display function======
	
	public void DisplayAvailablBooks()
	{
		System.out.println("======Catalog======");
		System.out.println("Available Books are...");
		for(Book b:CatalogList)
		{
			if(b.getAvailable())
			{
				System.out.println("Book ID: "+b.getBookID());
				System.out.println("Title: "+b.getTitle());
				System.out.println("Author: "+b.getAuthor() );
				System.out.println("Genre: "+b.getGenre());
				System.out.println("............................................................");
			}
		}
	}
	
	//======Display All Books======
	public void DisplayllBooks()
	{
		System.out.println("======Catalog======");
		
		for(Book b:CatalogList)
		{			
			b.Display();
		}
	}
}