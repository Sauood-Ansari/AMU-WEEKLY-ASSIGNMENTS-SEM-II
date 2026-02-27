package Week5;

import java.util.Scanner;
import java.util.ArrayList;

public class Main 
{
	private static ArrayList<User>UserList=new ArrayList<>();
	
	
	
	public static void main(String[] args) 
	{
		Catalog c=new Catalog();
		int opt=0,subOpt=0;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("...................................................");
			System.out.println("Choose what you want to do...");
			System.out.println("1.Access Catalog");
			System.out.println("2.Access User");
			System.out.println("3.Exit");
			opt=sc.nextInt();
			switch (opt)
			{
			case 1:
				do
				{
					System.out.println("...................................................");
					System.out.println("What do you want to do in Catalog...");
					System.out.println("1.Add a book");
					System.out.println("2.Update availability");
					System.out.println("3.Display the catalog");
					System.out.println("4.Display available Books");
					System.out.println("5.Return to smain menu.");
					subOpt=sc.nextInt();
					switch (subOpt)
					{
					 case 1:
						 System.out.println("Choose Book type...");
						 System.out.println("1.Genreal Book");
						 System.out.println("2.Fiction Book");
						 System.out.println("3.Non-Fiction Book");
						 int choice=sc.nextInt();
						 c.Add(sc,choice);
						 break;
						 
					 case 2:
						 c.Update(sc);
						 break;
						 
					 case 3:
						 System.out.println("Enter the type of book to be displayed");
						 c.DisplayllBooks();
						 break;
						 
					 case 4:
						 c.DisplayAvailablBooks();
						 break;
						 
					 case 5:
							System.out.println("Returning to main menu.");
						 break;
						
					default:
						System.out.println("Wrong option T_T , choose again");
					}
				}while(subOpt!=5);
				break;
				
			case 2:
				do
				{
					System.out.println("...................................................");
					System.out.println("Choose What you want to do.");
					System.out.println("1.Add new User");
					System.out.println("2.Access User profile");
					System.out.println("3.Display User");
					System.out.println("4.Return to main menu");
					subOpt=sc.nextInt();
					switch(subOpt)
					{
					case 1:
						boolean o=true;
						do
						{
							
							System.out.printf("Want to add user(Yes/NO)?");
							String choose=sc.next();
							if(choose.equalsIgnoreCase("Yes"))
							{
								User u=new User();
								u.setUser(sc);
								UserList.add(u);
							}
							else
									o=false;
						}while(o);
					break;
					
					case 2:
						System.out.println("Enter the user ID");
						int uid=sc.nextInt();
						for(User u:UserList)
						{
							if(u.getUserID()==uid)
							{
								System.out.println("What do yopu want to do (Borrow/Return)?");
								String temp=sc.next();
								if(temp.equalsIgnoreCase("Borrow"))
								{
									u.BorrowBook(sc,c);
								}
								else if(temp.equalsIgnoreCase("Return"))
								{
									u.ReturnBook(sc,c);
								}
								else
									System.out.println("Wrong option");
							}
						}
					break;
					
					case 3:
						System.out.println("Enter the user ID");
						uid=sc.nextInt();
						for(User u:UserList)
						{
							if(u.getUserID()==uid)
							{
								u.Display();
							}
						
						}
					break;
					
					case 4:
						System.out.println("Returning to main menu");
					break;
						
					default:
						System.out.println("Wrong option T_T , choose again");
					}
				}while(subOpt!=4);
				break;
				
			case 3:
				System.out.println("Exited main program.");
				break;
				
			default:
				System.out.println("Wrong option T_T , choose again");
			}
		}while(opt!=3);
			
			
		sc.close();
	}

}
