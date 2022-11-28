package steps;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;

public class Hooks {

	@BeforeAll
	public static void beforeAll() {
		System.out.println("@BeforeAll-Create DB Connection");
	}

	@AfterAll
	public static void afterAll() {
		System.out.println("@AfterAll-Close DB Connection");
	}

	@Before
	public void setUp() {

		System.out.println("@Before--Launching browser");

	}

	@After
	public void tearDown() {
		System.out.println("@After--Quit browser");

	}

	@BeforeStep(order = 0)
	public void beforeStep() {
		System.out.println("@BeforeStep--Adding a log");

	}

	@AfterStep(order = 1)
	public void afterStep() {
		System.out.println("@AfterStep--Deleting a log");

	}
}
