package Week6;

import java.util.Scanner;

//======Interface======

interface inter
{
	public void draw();
	public double getArea(Scanner sc);
}

//======Circle Class======

class Circle implements inter
{
	public double getArea(Scanner sc)
	{
		System.out.println("Enter the radius");
		int radius=sc.nextInt();
		double area=0;
		area=Math.PI*(radius*radius);
		return area;
	}
	
	public void draw()
	{
		System.out.println("Drawing Circle...");
	}
}

//======Triangle Class======

class Triangle implements inter
{
	public double getArea(Scanner sc)
	{
		System.out.println("Enter the heigth and base");
		int height=sc.nextInt();
		int base=sc.nextInt();
		double area=0;
		area=0.5*base*height;
		return area;
	}
	
	public void draw()
	{
		System.out.println("Drawing Triangle...");
	}
}

//======Rectangle Class======

class Rectangle implements inter
{
	public double getArea(Scanner sc)
	{
		System.out.println("Enter the length and breadth");
		int length=sc.nextInt();
		int breadth=sc.nextInt();
		double area=0;
		area=length*breadth;
		return area;
	}
	
	public void draw()
	{
		System.out.println("Drawing Rectangle...");
	}
}

//======Main Class======

public class Prob4 
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int opt=1;
		do
		{
			
			System.out.println("Choose any one...");
			System.out.println("1.Circle");
			System.out.println("2.Rectangle");
			System.out.println("3.Triangle");
			System.out.println("4.Exit");
			opt=sc.nextInt();
			switch(opt)
			{
			case 1:
				Circle c=new Circle();
				System.out.println("Area: "+c.getArea(sc));
				c.draw();
				break;
			case 2:
				Rectangle r=new Rectangle();
				System.out.println("Area: "+r.getArea(sc));
				r.draw();
				break;
			case 3:
				Triangle t=new Triangle();
				System.out.println("Area: "+t.getArea(sc));
				t.draw();
				break;
			case 4:
				System.out.println("Thank You!");
				break;
				
			default:
			System.out.println("Wrong Option");
			}
		}while(opt!=4);
		
		
		sc.close();
	}
}
