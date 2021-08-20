package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	@Before
	public void beforeEachScenario() {
		System.out.println("===== Before Scenario ======");
	}
	@After
	public void afterEachScenario() {
		System.out.println("===== After each Scenario ====== ");
	}
	@Before("@First or @Third")
	public void beforeScenarioForFirst() {
		System.out.println("===== Only before @First and @Third Scenario ======");
	}
	@After("@First")
	public void afterScenarioForFirst() {
		System.out.println("===== Only after @First Scenario ====== ");
	}
	@Before("@Third")
	public void beforeScenarioForThird() {
		System.out.println("===== Only before @Third Scenario ======");
	}
	@After("@Second")
	public void afterScenario() {
		System.out.println("===== Only after @Third Scenario ====== ");
	}
}
