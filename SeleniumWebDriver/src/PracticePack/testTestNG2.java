package PracticePack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testTestNG2 extends setUp{
	
	@BeforeClass
	public void beforeClassSetup(){
		System.out.println("beforeClassSetup 2 ");
	}
	

	@Test
	public void login1(){
		System.out.println("login--1");
	}
	
	@Test
	public void register1(){
		System.out.println("register--1");
	}
	
	@Test
	public void home1(){
		System.out.println("home--1");
	}
	
	@AfterClass
	public void afterClassSetup(){
		System.out.println("afterClassSetup 2");
	}
	
	
}
