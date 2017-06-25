package project.pr8.conditions;

import org.testng.annotations.Test;

import project.pr9.OneDimensionalArray;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class CheckKTest {
	private CheckK checkK;

	@Test(dataProvider = "testCheckKIsReadyData")
	public void tst_isReady(double z, OneDimensionalArray array, boolean result) {
		Assert.assertEquals(checkK.isReady(z, array), result);

	}

	@BeforeMethod
	public void beforeMethod() {
		checkK = new CheckK();
	}

	@AfterMethod
	public void afterMethod() {
		checkK = null;
	}

	@DataProvider(name = "testCheckKIsReadyData")
	public Object[][] dp() {
		return new Object[][] { //
				new Object[] { -1, new OneDimensionalArray(3), true }, //
				new Object[] { 1, new OneDimensionalArray(4), false }, //
				new Object[] { 4, new OneDimensionalArray(1), true }, //
				new Object[] { 0, new OneDimensionalArray(1), true },//
		};
	}
}
