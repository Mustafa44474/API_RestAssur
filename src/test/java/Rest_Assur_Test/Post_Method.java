package Rest_Assur_Test;

import java.util.HashMap;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matcher.*;


import org.testng.annotations.BeforeClass;

import io.restassured.RestAssured;

public class Post_Method {
	
	public static HashMap map = new HashMap();
	@BeforeClass
	public void postMethod(){
		
		map.put("FirstName", RestUtils.getFirstName());
		map.put("LastName", RestUtils.getLastName());
		map.put("UserName", RestUtils.getUserName());
		map.put("Password", RestUtils.getPassword());
		map.put("Email", RestUtils.getEmail());
		
		RestAssured.baseURI ="https://dummy.restapiexample.com/api/v1";
		RestAssured.basePath = "/create";
		
	}
	@Test
	public void test_CreatePot() {
		
		given().contentType("application/json").body(map).when().post ()
		.then()
		.statusCode(200)
		.and()
		.body("status", equalTo("success")).
		and()
		.body("message", equalTo("Successfully! Record has been added."))
		.log().all();
		
		
	 
		
		
		
		
		
	}
		
		
		
		
		
		
		
		
		
	 
	
	
	
	
	
	
	
	
	
	
	
}
