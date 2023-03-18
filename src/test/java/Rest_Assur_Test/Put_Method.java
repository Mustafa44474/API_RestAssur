package Rest_Assur_Test;

import java.util.HashMap;
import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.*;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matcher.*;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

import org.testng.annotations.BeforeClass;

import io.restassured.RestAssured;

public class Put_Method {

	public static HashMap map = new HashMap();
	String empName = RestUtils.getEmpName();
	String empSalar = RestUtils.getEmpSala();
	String empAge = RestUtils.getEmpAge();
	int empID = 1;

	@BeforeClass
	public void updateData() {

		map.put("name", empName);
		map.put("Salary", empSalar);
		map.put("Age", empAge);

		RestAssured.baseURI = "";
		RestAssured.basePath = "/update/" + empID;

	}

	@Test
	public void testPutRequest() {

		given().contentType("application/json").body(map).when().put().then().statusCode(200)

		;

	}

}
