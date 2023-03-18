  package Rest_Assur_Test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;



/*
   * 1-	Given ; which we will maintain all our prerequisite  such as 
-	Set cookies, Add authorization, add parameter, Set header info 
2-	When ; We Maintain all our request under when section such as 
-  Get, Post, put, Delete  
      3- Then: we maintain all of our validation under then section such as 
-	Validate, Status Code| Extract response from API| Extract header from API | response Body 

   */

public class Get_Request {
	
@Test
public void getEMPDETAILS() {
		given().
		when().get("https://dummy.restapiexample.com/api/v1/employee/1");
		//.then().statusCode(200)
		//.statusLine("HTTP/1.1 200 OK");
	//	.assertThat().body("status", equal("success"));
		
		
	
}

private String equal(String string) {
	// TODO Auto-generated method stub
	return "Success";
}
}
