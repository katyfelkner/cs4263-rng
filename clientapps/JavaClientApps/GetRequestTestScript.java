import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

// Code based off of https://www.mkyong.com/webservices/jax-rs/restfull-java-client-with-java-net-url/
public class GetRequestTestScript {

    // http://java-random-number.appspot.com/demo
    public static void main(String[] args) {
	int i =1;
	int j =1;
	int repeats = 0;
	int unique = 0;

	boolean[] foundNumber = new boolean[1000000];
	while (j <= 10){
		while (i <= 1000) {
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
			    while ((output = br.readLine()) != null) {
				//System.out.println(output);
				int index = Integer.parseInt(output);
				if(!foundNumber[index]){
				    foundNumber[index] = true;
				    unique++;
				}
				else {
				    repeats++;
				}
				
				if ( i % 25 == 0)
				    System.out.println("Random number fetched: " + i);
			    }

			    conn.disconnect();

			} catch (MalformedURLException e) {

			    e.printStackTrace();

			} catch (IOException e) {

			    e.printStackTrace();

			}
			    i++;
		}
		System.out.println("Test #" + j);
		System.out.println("Repeated Numbers: " + repeats);
		System.out.println("Unique Numbers: " + unique);
		repeats = 0;
		unique = 0;
		j++;
	}
    }
}
