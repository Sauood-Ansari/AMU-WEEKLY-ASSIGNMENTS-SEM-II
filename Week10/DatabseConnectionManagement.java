package Week10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabseConnectionManagement {

	private static final String URL = "jdbc:oracle:thin:system/system@localhost:1521:XE";

	public static void main(String[] args) {
		testDatabaseConnection(true, false);
		testDatabaseConnection(false, false);
		testDatabaseConnection(true, true);
	}

	public static void testDatabaseConnection(boolean validConnection, boolean forceError) {

		String dbURL = validConnection ? URL : "jdbc:mysql://localhost:3306/InvalidDB";

		try (Connection conn = DriverManager.getConnection(dbURL)) {

			System.out.println("Connection successful");

			if (forceError) {
				throw new SQLException("An error occurred during the database operation.");
			}

			try (Statement stmt = conn.createStatement()) {
				stmt.executeQuery("SELECT 1");
			}

		} catch (SQLException e) {
			if (!validConnection) {
				System.out.println("Exception: SQLException - Could not connect to the database.");
			} else {
				System.out.println("Exception: SQLException - " + e.getMessage());
			}
		} finally {
			System.out.println("Connection closed");
			System.out.println("-----------------------------------");
		}
	}
}