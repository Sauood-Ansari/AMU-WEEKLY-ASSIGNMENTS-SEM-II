package Week7_Rough;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

class Student 
{
	private int id;
	private String name;
	private double marks;

	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public double getMarks() 
	{
		return marks;
	}

	public void setMarks(double marks) 
	{
		this.marks = marks;
	}

	public Student(String name, int id, double marks) 
	{
		this.name = name;
		this.id = id;
		this.marks = marks;
	}

	@Override
	public String toString() 
	{
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}

}

public class ReadWrite 
{
	public static void main(String[] args)

	{
		File fileread = new File("input.txt");
		File filewrite = new File("print.txt");
		Scanner sc = null;
		PrintWriter write = null;

		if (!fileread.exists()) 
		{
			System.out.println("File no found!!");
			System.exit(0);
		}

		try 
		{
			sc = new Scanner(fileread);

			Student[] stud = new Student[sc.nextInt()];
			String command = sc.next();
			write = new PrintWriter(filewrite);
			do {
				if (command.equals("AddStudent")) 
				{
					addstudent(stud, sc, write);
				} else if (command.equals("printStudentAll")) 
				{

					printall(stud, write);
				} else if (command.equals("printStudent")) 
				{
					int idsearc = sc.nextInt();
					searchStudent(stud, write, idsearc);
				}

				command = sc.next();
			} while (!command.equals("exit"));

		}
		catch (ArrayIndexOutOfBoundsException e1) 
		{
			System.out.println("Length provided is out of bound");
		} 
		catch (FileNotFoundException e2) 
		{
			System.out.println("File was not found");
		}
		write.flush();
		write.close();
		sc.close();

	}

	private static void searchStudent(Student[] stud, PrintWriter filew, int idsearc) 
	{
		
			for (int i = 0; i < stud.length; i++) 
			{
				if (stud[i].getId() == idsearc) 
				{
					filew.println("-------------------------------------");
					filew.println("--Processing Command:Search Found --- ");
					filew.println(stud[i].toString());
					return;
				}
			}	
			
				filew.println("Student ID provided is not found");
			
	}

	private static void printall(Student[] stud, PrintWriter filew) 
	{
		filew.println("-------------------------------------");
		filew.println("--Processing Command:PrintAllStudent --- ");
		for (int i = 0; i < stud.length; i++) 
		{
			filew.println(stud[i].toString());

		}

	}

//--------------------------------------------------
	private static void addstudent(Student[] stud, Scanner fileread, PrintWriter filew) 
	{

		filew.println("-------------------------------------");
		filew.println("--Processing Command:AddStudent --- ");
		for (int i = 0; i < stud.length; i++) 
		{
			stud[i] = new Student(fileread.next(), fileread.nextInt(), fileread.nextDouble());
			filew.println(stud[i].toString());

		}

	}

}
