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
	    
	// All three are utilized later to track repeats through each iteration.
	int repeats = 0;
	int unique = 0;
	boolean[] foundNumber = new boolean[1000000];
	
	// Does 10 tests of 1,000 random numbers to determine if the numbers are sufficiently random (at least 750/1000).
	while (j <= 10){
		while (i <= 1000) {
			try {
			    // Our URL for the APP Engine Application. Left running for ease of testing. 
			    URL url = new URL("http://java-random-number.appspot.com/demo");
			    
			    // Opens the URL to be used for GET requests.
			    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			    conn.setRequestMethod("GET");
			    conn.setRequestProperty("Accept", "text/plane");
			    
			    // Throws an error for any connection problems here. 
			    if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
							   + conn.getResponseCode());
			    }

			    BufferedReader br = new BufferedReader(new InputStreamReader(
											 (conn.getInputStream())));
			    // Logic used to track whether a number is repeated or not by setting foundNumber[index] to true.
			    // If it is found to already be true, it increments repeats. Otherwise increments unique.
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
		// Output to gauge randomness for each test. 
		System.out.println("Test #" + j);
		System.out.println("Repeated Numbers: " + repeats);
		System.out.println("Unique Numbers: " + unique + "\n");
		
		//Reset variables for the next test. 
		for(int k = 0; i < 1000000; ++i){
			foundNumber[i] = false;
		}
		repeats = 0;
		unique = 0;
		i = 1;
		j++;
	}
    }
}
