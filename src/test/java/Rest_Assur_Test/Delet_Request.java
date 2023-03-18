package Rest_Assur_Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.*;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matcher.*;
import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Delet_Request {

	@Test
	public void deletEmP_Record() {

		RestAssured.baseURI = "https://dummy.restapiexample.com/api/v1";
		RestAssured.basePath = "/delete/2";

		Response respons =

				given().when().delete().then().statusCode(200).statusLine("HTTP/1.1 200 OK").log().all().extract()
						.response();
						
					String jSonAsString =	respons.asString();
					Assert.assertEquals(jSonAsString.contains("Successfully! Record has been deleted"), true);

		

	}

}
