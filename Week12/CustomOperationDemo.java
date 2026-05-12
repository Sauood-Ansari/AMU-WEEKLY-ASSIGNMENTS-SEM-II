package Week12;

import java.net.*;

class NetworkOperationException extends Exception {
	public NetworkOperationException(String msg) {
		super(msg);
	}
}

public class CustomOperationDemo {

	public static void main(String[] args) {
		try {
			perform("http://invalid-url");
		} catch (NetworkOperationException e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}

	@SuppressWarnings("deprecation")
	static void perform(String urlStr) throws NetworkOperationException {
		try {
			URL url = new URL(urlStr);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.connect();

			System.out.println("Operation successful");

		} catch (Exception e) {
			throw new NetworkOperationException("NetworkOperationException - Error during operation.");
		}
	}
}