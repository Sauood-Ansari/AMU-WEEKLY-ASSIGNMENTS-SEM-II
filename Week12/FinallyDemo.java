package Week12;

import java.util.logging.Logger;
import java.net.*;

public class FinallyDemo {

	private static final Logger logger = Logger.getLogger(FinallyDemo.class.getName());

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		HttpURLConnection conn = null;

		try {
			URL url = new URL("http://example.com");
			conn = (HttpURLConnection) url.openConnection();
			conn.connect();

			System.out.println("Connection successful");

		} catch (Exception e) {
			System.out.println("Exception: NetworkConnectionException occurred.");
			logger.severe("NetworkConnectionException occurred.");

		} finally {
			if (conn != null) {
				conn.disconnect();
				System.out.println("Connection closed");
				logger.info("HttpURLConnection object closed successfully.");
			}
		}
	}
}