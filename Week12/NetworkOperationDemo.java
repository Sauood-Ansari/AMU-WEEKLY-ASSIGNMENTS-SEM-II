package Week12;

import java.net.*;
import java.io.*;

public class NetworkOperationDemo {

	public static void main(String[] args) {
		try {
			performOperation("http://example.com");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@SuppressWarnings("deprecation")
	static void performOperation(String urlStr) throws Exception {
		try {
			URL url = new URL(urlStr);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.connect();

			System.out.println("Operation successful");

			conn.disconnect();
			System.out.println("Connection closed");

		} catch (IOException e) {
			throw new Exception("NetworkOperationException - Error during network operation.");
		}
	}
}