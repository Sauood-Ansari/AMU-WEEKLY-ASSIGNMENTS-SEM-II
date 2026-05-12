package Week12;

import java.net.*;
import java.io.*;
import java.util.logging.Logger;

class NetworkConnectionException extends Exception {
    public NetworkConnectionException(String msg) {
        super(msg);
    }
}

class NetworkOperationException extends Exception {
    public NetworkOperationException(String msg) {
        super(msg);
    }
}

public class FinalNetworkManager {

    private static final Logger logger = Logger.getLogger(FinalNetworkManager.class.getName());

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {

        HttpURLConnection conn = null;

        try {
            URL url = new URL("http://example.com");
            conn = (HttpURLConnection) url.openConnection();
            conn.connect();

            System.out.println("Operation successful");

        } catch (MalformedURLException e) {
            System.out.println("Exception: NetworkConnectionException - Invalid URL");
            logger.severe("NetworkConnectionException occurred.");

        } catch (IOException e) {
            System.out.println("Exception: NetworkOperationException - Network error");
            logger.severe("NetworkOperationException occurred.");

        } finally {
            if (conn != null) {
                conn.disconnect();
                System.out.println("Connection closed");
                logger.info("HttpURLConnection object closed successfully.");
            }
        }
    }
}