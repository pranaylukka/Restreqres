package tests;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.yaml.snakeyaml.constructor.SafeConstructor;

import base.Common;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetUsersList extends Common{

	
	
	@Test
	public void getUsersListTest()
	{   spec.pathParam("users", "users");  
		spec.queryParam("page", "2");
		      Response response =RestAssured.given(spec).get("/{users}");
		      response.prettyPrint();
		       SoftAssert sa =new SoftAssert();
		       sa.assertEquals(response.jsonPath().get("page").toString(), "2","wrond id");
               sa.assertEquals(response.getStatusCode(), 200,"wrong statuscode");
		       sa.assertAll();
		
	}
}
