package Week6;

class Prob2 implements A,B
{
	//======overriding  from interface A======
	
	public void methodA()
	{
		System.out.println("Method A implemented");
	}
	
	//======overriding  from interface A======
	
	public void methodB()
	{
		System.out.println("Method B implemented");		
	}
	
	
	public static void main(String args[])
	{
		Prob2 obj=new Prob2();
		obj.methodA();
		obj.methodB();
	}
}
