package base;

import org.testng.annotations.BeforeMethod;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class Common {
     protected RequestSpecification spec;
	@BeforeMethod
     public void init()
     {
		spec =new RequestSpecBuilder().setBaseUri("https://reqres.in/api").build();
    	
    	
     }
	
}
