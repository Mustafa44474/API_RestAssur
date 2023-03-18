package Rest_Assur_Test;

import org.apache.commons.lang3.RandomStringUtils;

public class RestUtils {

	public static String getFirstName() {
		String generatedString = RandomStringUtils.randomAlphabetic(1);
		return ("John" + generatedString);
	}

	public static String getLastName() {
		String generatedString = RandomStringUtils.randomAlphabetic(1);
		return ("Kenedy" + generatedString);
	}

	
	public static String getUserName() {
		String generatedString = RandomStringUtils.randomAlphabetic(1);
		return ("John" + generatedString);
	}

	
	public static String getPassword() {
		String generatedString = RandomStringUtils.randomAlphabetic(3);
		return ("John" + generatedString);
	}

	public static String getEmail() {
		String generatedString = RandomStringUtils.randomAlphabetic(3);
		return ( generatedString +"gmail.com");
	}
	
	public static String getEmpName() {
		String generatedString = RandomStringUtils.randomAlphabetic(3);
		return ( "John" + generatedString);
	}
	
	public static String getEmpSala() {
		String generatedString = RandomStringUtils.randomAlphanumeric(5);
		return ( generatedString);
	}

	public static String getEmpAge() {
		String generatedString = RandomStringUtils.randomAlphanumeric(2);
		return ( generatedString);
	}

	
	
	
}
