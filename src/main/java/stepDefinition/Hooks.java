package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	
	@Before
	public void beforeScnario() {
		System.out.println("========= Before Scenario =========");
	}
	
	
	@After
	public void afterScenrao () {
		System.out.println("========= After Scenario =========");

	}
	
	
//	@Before
//	public void beforeScnario() {
//		System.out.println("========= Before Scenario =========");
//	}
//	
//	
//	@After
//	public void afterScenrao () {
//		System.out.println("========= After Scenario =========");
//
//	}
//	
//	@Before
//	public void beforeScnario() {
//		System.out.println("========= Before Scenario =========");
//	}
//	
//	
//	@After
//	public void afterScenrao () {
//		System.out.println("========= After Scenario =========");
//
//	}

}
