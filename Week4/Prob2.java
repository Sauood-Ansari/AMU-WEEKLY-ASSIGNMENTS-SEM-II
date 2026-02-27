package Week4;
import java.util.Scanner;
public class Prob2 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of the circle...");
		int radius=sc.nextInt();
		System.out.println("Enter the co-ordinates of the circle...");
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		System.out.println("Enter the point ot be examined...");
		int tx=sc.nextInt();
		int ty=sc.nextInt();
		double area=Math.PI*radius*radius;
		double perimeter=2*Math.PI*radius;
		double temp=(Math.sqrt(Math.pow((tx-x1),2)+Math.pow((ty-y1),2)))-radius;
		System.out.println("Area of the circle is: "+area);
		System.out.println("Perimeter of the circle is: "+perimeter);
		if(temp==0)
			System.out.println("The given point is on the circle");
		else if(temp<0.0)
			System.out.println("The given point is inside the circle");
		else 
			System.out.println("The given point is outside the circle");
		
		sc.close();
	}
}
