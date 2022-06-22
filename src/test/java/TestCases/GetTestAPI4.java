package TestCases;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.Baseclass;
import Client.RestClient;

public class GetTestAPI4 extends Baseclass{
	RestClient rc;
	Baseclass bc;
	String uri;
	@BeforeMethod
	public void setup()
	{
	 bc = new Baseclass();
	 uri = prop.getProperty("URL")+prop.getProperty("serviceUrl");
	//String service1 = prop.getProperty("serviceUrl");
		 //String = 
	}
	
	@Test
	public void Test1() throws ClientProtocolException, IOException
	{
		rc = new RestClient();
		rc.get(uri);
		
	}
	
}
