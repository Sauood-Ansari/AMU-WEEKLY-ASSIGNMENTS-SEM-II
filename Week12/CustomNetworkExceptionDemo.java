package Week12;

import java.net.*;

class NetworkConnectionException extends Exception {
    public NetworkConnectionException(String msg) {
        super(msg);
    }
}

public class CustomNetworkExceptionDemo {

    public static void main(String[] args) {
        try {
            connect("http://invalid-url");
        } catch (NetworkConnectionException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    @SuppressWarnings("deprecation")
    static void connect(String urlStr) throws NetworkConnectionException {
        try {
            URL url = new URL(urlStr);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.connect();

            System.out.println("Connection successful");
            conn.disconnect();
            System.out.println("Connection closed");

        } catch (Exception e) {
            throw new NetworkConnectionException("NetworkConnectionException - Could not connect to the URL.");
        }
    }
}