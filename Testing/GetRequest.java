import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

// Code based off of https://www.mkyong.com/webservices/jax-rs/restfull-java-client-with-java-net-url/
public class GetRequest {

    //http://java-random-number.appspot.com/demo
    public static void main(String[] args) {

	try {

	    URL url = new URL("http://java-random-number.appspot.com/demo");
	    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	    conn.setRequestMethod("GET");
	    conn.setRequestProperty("Accept", "text/plane");

	    if (conn.getResponseCode() != 200) {
		throw new RuntimeException("Failed : HTTP error code : "
					   + conn.getResponseCode());
	    }

	    BufferedReader br = new BufferedReader(new InputStreamReader(
									 (conn.getInputStream())));

	    String output;
	    System.out.println("Output from Server .... \n");
	    while ((output = br.readLine()) != null) {
		System.out.println(output);
	    }

	    conn.disconnect();

	} catch (MalformedURLException e) {

	    e.printStackTrace();

	} catch (IOException e) {

	    e.printStackTrace();

	}

    }

}