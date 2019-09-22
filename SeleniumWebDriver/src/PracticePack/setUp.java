package PracticePack;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class setUp {

	@BeforeSuite
	public void beforeSuiteSetup(){
		System.out.println("beforeSuiteSetup");
	}
	
	@BeforeTest
	public void beforeTestSetup(){
		System.out.println("beforeTestSetup");
	}
	
	
	@AfterTest
	public void afterTestSetup(){
		System.out.println("afterTestSetup");
	}
	
	@AfterSuite
	public void afterSuiteSetup(){
		System.out.println("afterSuiteSetup");
	}
}
