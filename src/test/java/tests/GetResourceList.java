package tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.Common;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetResourceList extends Common{

	
	
	@Test
	public void getResourceListTest()
	{   spec.pathParam("unkown", "unkown");  
		
		      Response response =RestAssured.given(spec).get("/{unkown}");
		     
		      
		    Root lor=response.as(Root.class);
		    System.out.println(lor.getData().get(1).getColor());
		       SoftAssert sa =new SoftAssert();
		
		       sa.assertAll();
		
	}
}
