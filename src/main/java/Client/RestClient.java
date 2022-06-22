package Client;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class RestClient {

	
	public void get(String url) throws ClientProtocolException, IOException
	{
		CloseableHttpClient httpsclient	= HttpClients.createDefault(); 
		//The HTTP client is an interface for sending https requests and rec http response from a resource identified by URI
		//Create default method is used to create client connection
		//Closable HTTP client is a class that implements HTTP client interface
		
		
		HttpGet httpGet = new HttpGet(url);
		CloseableHttpResponse response = httpsclient.execute(httpGet);
		
		int responseCode = response.getStatusLine().getStatusCode();
		System.out.println(responseCode);
		assertEquals(responseCode, 200);
		
	}
	
	
}
