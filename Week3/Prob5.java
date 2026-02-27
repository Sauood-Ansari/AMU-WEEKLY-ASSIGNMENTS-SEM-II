package Week3;
import java.util.Scanner;
public class Prob5 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter hte x-axis,y-axis,width and height of first rectangle");
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		int w1=sc.nextInt();
		int h1=sc.nextInt();
		System.out.println("Enter hte x-axis,y-axis,width and height of second rectangle");
		int x2=sc.nextInt();
		int y2=sc.nextInt();
		int w2=sc.nextInt();
		int h2=sc.nextInt();
		if((x1+w1)<(x2+w2) && (y1+h1)<(y2+h2) && x1<x2 && y1<y2)
		{
			System.out.println("Point of intersection are: "+x2+" and "+y2);
			System.out.println("Width and Height  are: "+(x1+w1-x2)+" and "+(y1+h1-y2));
		}
		else if((x1+w1)>(x2+w2) && (y1+h1)>(y2+h2) && x1>x2 && y1>y2)
		{
			System.out.println("Point of intersection are: "+x1+" and "+y1);
			System.out.println("Width and Height  are: "+(x2+w2-x1)+" and "+(y2+h2-y1));

		}
		else
			System.out.println("Rectngle do not intersect");
		
		sc.close();
	}

}
