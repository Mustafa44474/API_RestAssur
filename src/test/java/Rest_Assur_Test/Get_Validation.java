package Rest_Assur_Test;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;

import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import static org.hamcrest.Matcher.*;

public class Get_Validation {

	@Test(priority = 1)

	public void testGetValidation() {

		given().when().get("https://dummy.restapiexample.com/api/v1/employees").then().statusCode(200)
	.log().all();		
	}

	@Test(priority =2 )
	public void testLoging() {
		given().when().get("https://dummy.restapiexample.com/api/v1/employee/1").

				then().statusCode(200)
				.body("status", equalTo("success")).log().all();
	}
}
