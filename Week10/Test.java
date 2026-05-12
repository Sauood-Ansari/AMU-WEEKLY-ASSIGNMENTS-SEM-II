package Week10;

import java.sql.*;
import java.util.Scanner;

public class Test {

	private static final String URL = "jdbc:mysql://localhost:3306/companydb";
	private static final String username = "root";
	private static final String password = "Test@123";
	
	//======Function to update the database======

	public static void UpdateDB(Statement stat) throws SQLException {

		String query = String.format("UPDATE employee SET salary=%f WHERE EmpId=%d", 75000.00, 107);

		int rowsUpdated = stat.executeUpdate(query);

		if (rowsUpdated > 0) {
			System.out.println("Data Updated.");
		} else {
			System.out.println("Data not updated");
		}
	}
	
	//======function to add rows to the database=======
	public static void AddToDB(Statement stat) throws SQLException {
		String query = String.format(
				"INSERT INTO Employee(FirstName, LastName, Department, Salary) VALUES('%s','%s','%s',%f)", "Sauood",
				"Ansari", "IT", 100000.00);
		int rowsAffected = stat.executeUpdate(query);

		if (rowsAffected > 0) {
			System.out.println("Data Added.\nChanges in rows: " + rowsAffected);
		} else {
			System.out.println("Data not inserted");
		}
	}

	//======function to delete rows from the database======
	public static void DeleteFromDB(Statement stat) throws SQLException {
		
		String query = String.format("DELETE FROM employee WHERE EmpId=110");

		int rowsDeleted = stat.executeUpdate(query);

		if (rowsDeleted > 0) {
			System.out.println("Data deleted.");
		} else {
			System.out.println("Data not deleted");
		}

	}

	//======function to display the values from the database======
	public static void DisplayFromDB(Statement stat) throws SQLException {
		String query = "select * from Employee";
		ResultSet rs = stat.executeQuery(query);
		while (rs.next()) {
			System.out.println("************************************************************");
			int id = rs.getInt("EmpID");
			String name = rs.getString("FirstName");
			String dep = rs.getString("Department");
			Double sal = rs.getDouble("Salary");
			System.out.println("ID: " + id + "\tName: " + name + "\tDepartment: " + dep + "\tSalary: " + sal);
		}
	}

	//======the main function======
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		Scanner sc=new Scanner(System.in);

		try {
			Connection conn = DriverManager.getConnection(URL, username, password);
			Statement stat = conn.createStatement();

			System.out.println("Choose one option...");
			System.out.println("1.Update the DB");
			System.out.println("2.Add to DB");
			System.out.println("3.Delete from DB");
			System.out.println("4.Display from DB");
			int opt=sc.nextInt();
			switch(opt)
			{
			case 1:
				UpdateDB(stat);
				break;
			case 2:
				AddToDB(stat);
				break;
			case 3:
				DeleteFromDB(stat);
				break;
			case 4:
				DisplayFromDB(stat);
				break;
			default:
			}

			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
		
	}

}
