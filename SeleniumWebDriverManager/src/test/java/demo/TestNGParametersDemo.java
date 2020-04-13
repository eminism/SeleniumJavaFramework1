package demo;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParametersDemo {

	@Test
	@Parameters("param1")
	public void test(@Optional("Emin") String name) {
		System.out.println("name is: " + name);
	}
}
