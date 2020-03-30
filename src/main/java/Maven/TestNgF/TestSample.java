package Maven.TestNgF;

import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestSample {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("BeforeSuite");

	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("BeforeTest");

	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("BeforeClass");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BeforeMethod");
	}

	

	@Test(retryAnalyzer=IRetryAnalyzer.class)
	public void test2() {
		
		System.out.println("Test2");
		Assert.assertTrue(false);
	}

	@Test
	public void test3() {
		System.out.println("Test3r");
	}

	@Test
	public void test4() {
		System.out.println("Test4");
	}

	@Test(groups = { "odd" })
	public void test5() {
		System.out.println("Test5");
	}

	@Test(dependsOnGroups = { "odd" })
	public void test6() {
		System.out.println("Test6");
	}

	@Test
	public void test7() {
		System.out.println("Test7");
	}

	@Test
	public void test8() {
		System.out.println("Test8");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("AfterMethod");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("AfterClass");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("AfterTest");

	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("AfterSuite");

	}

}
