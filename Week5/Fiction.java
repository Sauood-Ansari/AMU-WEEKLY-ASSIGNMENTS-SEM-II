package Week5;

public class Fiction extends Book
{
	//======Constructor======
	
	public Fiction()
	{
		super();
	}
	
	//======Overriding Display======
	
	void Display()
	{
		System.out.println("Book Type: Fiction");
		super.Display();
	}
}
