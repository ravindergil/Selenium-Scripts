package PracticePack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testTestNG extends setUp{
	
	@BeforeClass
	public void beforeClassSetup(){
		System.out.println("beforeClassSetup");
	}	
	
	@Test
	public void login(){
		System.out.println("login");
	}
	
	@Test
	public void register(){
		System.out.println("register");
	}
	
	@Test
	public void home(){
		System.out.println("home");
	}
	
	@AfterClass
	public void afterClassSetup(){
		System.out.println("afterClassSetup");
	}
	
	
}
