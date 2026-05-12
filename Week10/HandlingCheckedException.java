package Week10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

@SuppressWarnings("serial")
class DatabaseOperationException extends SQLException {
	public DatabaseOperationException(String msg) {
		super(msg);
	}
}

public class HandlingCheckedException {

	private static final String URL = "jdbc:oracle:thin:system/system@localhost:1521:XE";

	// ======A function to check for the connection and operation======
	public static void connectionCheck(String str1, String str4)
			throws DatabaseConnectionException, DatabaseOperationException {

		Connection con = null;
		try {
			con = DriverManager.getConnection(str1);
		} catch (SQLException e) {
			throw new DatabaseConnectionException(" Could not connect to the databse");
		}
		try {
			Statement stat = con.createStatement();
			stat.executeQuery(str4);
		} catch (SQLException e) {
			throw new DatabaseOperationException("  An error occurred during the database operation. ");
		}

		System.out.println("Connection Established");

	}

	// ======The main Function======
	public static void main(String args[]) {

		try {
//		System.out.println("First Condition");
//		connectionCheck(URL,"SELECT * FROM employee");

//		System.out.println("Second Condition");
//		connectionCheck("jdbc:mysql://First condition/mudb","SELECT * FROM employee");

			System.out.println("Third Condition");
			connectionCheck(URL, "SELECT * FROM emp");
		} catch (DatabaseConnectionException ex) {
			System.out.println(ex.getMessage());
		} catch (DatabaseOperationException ex) {

			System.out.println(ex.getMessage());
		} finally {
			System.out.println("Connection Closed");
		}

	}
}
