package Week5;

public class NonFiction extends Book 
{
	//======Constructor======
	
	public NonFiction()
	{
		super();
	}
	
	//======Overriding Display======
	
	public void Display()
	{
		System.out.println("Book Type: Non-Fiction");
		super.Display();
	}	

}
