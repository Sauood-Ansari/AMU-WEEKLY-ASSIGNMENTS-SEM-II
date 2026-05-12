package Week12;

import java.net.HttpURLConnection;
import java.net.URL;
import java.io.IOException;

public class NetworkConnectionDemo {

	public static void main(String[] args) {
		String urlString = "http://example.com";

		try {
			@SuppressWarnings("deprecation")
			URL url = new URL(urlString);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();

			conn.setRequestMethod("GET");
			conn.connect();

			int responseCode = conn.getResponseCode();

			if (responseCode == 200) {
				System.out.println("Connection successful");
			} else {
				System.out.println("Failed with code: " + responseCode);
			}

			conn.disconnect();
			System.out.println("Connection closed");

		} catch (IOException e) {
			System.out.println("Exception: IOException - Could not connect to the URL.");
		}
	}
}