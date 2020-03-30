package Maven.TestNgF;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class Test {
	@BeforeSuite
	private void beforesuite() {
		System.out.println("Before Suite");
	}

	@BeforeClass
	private void beforeclass() {
		System.out.println("BEfore Class");
	}

	@BeforeSuite
	private void beforesuite3() {
		System.out.println("Before Suite3");
	}

	@BeforeClass
	private void beforeclass1() {
		System.out.println("BEfore Class1");
	}

	@BeforeClass
	private void beforeclass2() {
		System.out.println("BEfore Class2");
	}

	@BeforeTest
	private void beforetest() {
		System.out.println("BEforeTest");
	}

	@BeforeTest
	private void beforetest1() {
		System.out.println("BEforeTest1");
	}

	@BeforeMethod
	private void beforemethod() {
		System.out.println("Before Method");
	}

	@BeforeMethod
	private void beforemethod1() {
		System.out.println("Before Method1");
	}
	
	@org.testng.annotations.Test
	public void test2() {
		System.out.println("Test2");
		//System.out.println(x+"==="+y);
	}

	@org.testng.annotations.Test(groups= {"k","v"})
	private void test1() {
		System.out.println("test1");
	}

	@org.testng.annotations.Test(dependsOnMethods = "test1")
	private void test3() {
		System.out.println("test3");
	}

	@AfterMethod
	private void aftermethod() {
		System.out.println("AfterMethod");
	}

	@AfterMethod
	private void aftermethod1() {
		System.out.println("AfterMethod1");
	}

	@AfterMethod
	private void aftermethod2() {
		System.out.println("AfterMethod2");
	}

	@AfterClass
	private void afterclass() {
		System.out.println("Afterclass");
	}

	@AfterClass
	private void afterclass1() {
		System.out.println("Afterclass1");
	}

	@org.testng.annotations.Test
	private void test4() {
		System.out.println("TEst4");
	}

	@AfterTest
	private void aftertest() {
		System.out.println("After Test");
	}

	@AfterSuite
	private void aftersuite() {
		System.out.println("After Suite");
	}

	@BeforeSuite
	private void beforesuite1() {
		System.out.println("Before Suite1");
	}

	@BeforeSuite
	private void beforesuite2() {
		System.out.println("Before Suite2");
	}

	@AfterSuite
	private void aftersuite1() {
		System.out.println("After Suite1");
	}

	@AfterSuite
	private void aftersuite2() {
		System.out.println("After Suite2");
	}

	@AfterTest
	private void aftertest1() {
		System.out.println("After Test1");
	}

	@AfterTest
	private void aftertest2() {
		System.out.println("After Test2");
	}

}