package tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.Common;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import pojos.CreateUserObject;

public class CreateUser extends Common {

	//@Test
	public void createUserTest()
	{
		CreateUserObject cu=new CreateUserObject("lp","haxor");
		spec.pathParam("users", "users");
		Response  response=RestAssured.given(spec)
				          .body(cu.toString())
				          .post("/{users}");
		response.prettyPrint();
		SoftAssert sa =new SoftAssert();
		sa.assertEquals(response.jsonPath().get("name"),cu.getName());
		sa.assertEquals(response.jsonPath().get("job"),cu.getJob());
		
		sa.assertAll();
		
		
	}
}
