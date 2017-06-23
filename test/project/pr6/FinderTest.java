package project.pr6;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FinderTest {
	private Finder finder;

	@Test(dataProvider = "dp")
	public void tst_findResult(double result, double first, double second, double third) {
		Assert.assertEquals(finder.findResult(first, second, third), result);
	}

	@BeforeMethod
	public void beforeMethod() {
		finder = new Finder();
	}

	@AfterMethod
	public void afterMethod() {
		finder = null;
	}

	@DataProvider
	public Object[][] dp() {
		return new Object[][] { //
				new Object[] { 2, 1, 1, 1 }, //
				new Object[] { 1, -1, 1, 2 }, //
				new Object[] { 1, -1, 1, 2 }, //
				new Object[] { 6, 3, 1, 5 }, //
				new Object[] { 1, -1,1, 2 },//
				new Object[] { Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY,1, 2 },//
		};
	}
}
