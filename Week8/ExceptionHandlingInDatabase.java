package Week8;

import java.util.logging.Logger;
import java.sql.SQLException;

class DatabaseException extends Exception {
	public DatabaseException(String msg) {
		super(msg);
	}
}

class DBConnection implements AutoCloseable {

	public DBConnection(boolean valid) throws DatabaseException {
		if (!valid) {
			throw new DatabaseException("Could not connect to database");
		}
		System.out.println("Database conneced successfully ");
	}

	public void DBWork(boolean valid) throws SQLException {
		if (!valid) {
			throw new SQLException("Error Occured during database operation");
		}
	}

	public void close() {
		System.out.println("Connction Closed");
	}
}

public class ExceptionHandlingInDatabase {
	static final Logger logger = Logger.getLogger(LoggingFrameworkIntegration.class.getName());

	public static void main(String[] args) {
		System.out.println("\n\nTest 1\n\n");
		try (DBConnection conn = new DBConnection(true)) {
			conn.DBWork(true);
		} catch (DatabaseException e) {
			System.out.println(e.getMessage());
			logger.log(java.util.logging.Level.SEVERE, e.getMessage());
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			logger.log(java.util.logging.Level.SEVERE, e.getMessage());
		}
		System.out.println("\n\nTest 2\n\n");
		try (DBConnection conn = new DBConnection(true)) {
			conn.DBWork(false);
		} catch (DatabaseException e) {
			System.out.println(e.getMessage());
			logger.log(java.util.logging.Level.SEVERE, e.getMessage());
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			logger.log(java.util.logging.Level.SEVERE, e.getMessage());
		}
		System.out.println("\n\nTest 3\n\n");
		try (DBConnection conn = new DBConnection(false)) {
			conn.DBWork(false);
		} catch (DatabaseException e) {
			System.out.println(e.getMessage());
			logger.log(java.util.logging.Level.SEVERE, e.getMessage());
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			logger.log(java.util.logging.Level.SEVERE, e.getMessage());
		}
	}
}
