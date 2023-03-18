package Rest_Assur_Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_Class {
	@BeforeTest
	public void before() {
		System.out.println(" This is my @before Method");

	}

	@Test
	public void googleTest() {
		System.out.println("Google Test");

	}

}
