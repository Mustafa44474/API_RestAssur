package Rest_Assur_Test;
import java.util.ArrayList;
import java.util.HashMap;
import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import static org.hamcrest.Matcher.*;

import org.testng.annotations.Test;
public class CreateDatainInDBPost {

public HashMap map = new HashMap();
/*
 * status": "success",
        "name": "test",
        "salary": "123",
        "age": "23",
        "id": 25
   
}
 */

@Test
public void CreatedNewRecorinDB() {
	map.put("status", "success");
	map.put("name", "test");
	map.put("salary", "123");
	map.put("age", "23");
	map.put("id", "25");
	
	ArrayList <String> arrlist = new ArrayList ();
	arrlist.add("Java");
	arrlist.add("Paython");
	arrlist.add("Seleniu");
	
	map.put("course", arrlist);
	
	 given().contentType(ContentType.JSON).body(map)
	.when().post("https://dummy.restapiexample.com/api/v1/create").
	then()
	//.statusCode(200).and().
.body("message", equalTo("Successfully! Record has been added.")).log().all();
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	

}
