import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.DatagramSocket;
import java.net.InetAddress;

// Code based off of https://www.mkyong.com/webservices/jax-rs/restfull-java-client-with-java-net-url/
public class GetRequest {


    public static void main(String[] args) {
    	//Making a GET request to a domain and print respones 
    	// Central Domains
    	System.out.println("Central Region: App Java, App Python, Instance Java, Instance Python");
    	makeHTTPRequest("http://java-random-number.appspot.com/demo", "US-Central-1", "App", "Java");
    	makeHTTPRequest("http://randompythongen.appspot.com/randomNumber/", "US-Central-1", "App", "Python");
    	makeHTTPRequest("http://104.199.77.112:5000/", "EUS-Central-1", "Instance", "Java");
    	makeHTTPRequest("http://35.238.165.97:5000/", "EUS-Central-1", "Instance", "Python");

    	//West Domains
    	System.out.println();
    	System.out.println();
    	System.out.println("EU-WEST-1 Region: App Java, App Python, Instance Java, Instance Python");
    	makeHTTPRequest("https://composed-anvil-254017.appspot.com/demo", "EU-WEST-1", "App", "Java");
    	makeHTTPRequest("https://cs4263-test.appspot.com", "EU-WEST-1", "App", "Python");
    	makeHTTPRequest("http://34.77.239.200:5000/", "EU-WEST-1", "Instance", "Java");
    	makeHTTPRequest("http://35.238.165.97:5000/", "EU-WEST-1", "Instance", "Python");
    	
    }

    public static void makeHTTPRequest(String urlS, String region, String domain, String lang) {
    	try {

		    URL url = new URL(urlS);
		    long startTime = System.currentTimeMillis();
		    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		    conn.setRequestMethod("GET");
		    conn.setRequestProperty("Accept", "text/plane");

		    if (conn.getResponseCode() != 200) {
			throw new RuntimeException("Failed : HTTP error code : "
						   + conn.getResponseCode());
		    }

		    BufferedReader br = new BufferedReader(new InputStreamReader(
										 (conn.getInputStream())));
			long elapsedTime = System.currentTimeMillis() - startTime;
		    String output;
		    InetAddress IP=InetAddress.getLocalHost();
		    System.out.print(IP.getHostAddress()+": ");
		    System.out.print(region + "_");
		    System.out.print(domain + "_");
		    System.out.print(lang + " @");
		    System.out.print(elapsedTime+" ");
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