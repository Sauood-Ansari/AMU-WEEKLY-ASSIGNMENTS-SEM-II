package Week12;

import java.util.logging.Logger;
import java.net.*;

public class LoggingNetworkDemo {

	private static final Logger logger = Logger.getLogger(LoggingNetworkDemo.class.getName());

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		try {
			URL url = new URL("http://invalid-url");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.connect();

		} catch (Exception e) {
			System.out.println("Exception: NetworkConnectionException - Could not connect to the URL.");
			logger.severe("NetworkConnectionException occurred.");
		}
	}
}