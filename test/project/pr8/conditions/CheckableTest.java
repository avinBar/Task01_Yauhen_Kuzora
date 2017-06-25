package project.pr8.conditions;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CheckableTest {
	private Checkable check;

	@Test(dataProvider = "testIsReadyData")
	public void tst_isReady(Checkable checker, double z, boolean result) {
		check = checker;
		Assert.assertEquals(check.isReady(z), result);
	}

	@AfterMethod
	public void afterMethod() {
		check = null;
	}

	@DataProvider(name = "testIsReadyData")
	public Object[][] dp() {
		return new Object[][] { //
				new Object[] { new CheckN(), 5, true }, //
				new Object[] { new CheckN(), 4, false }, //
				new Object[] { new CheckN(), -1, true }, //
				new Object[] { new CheckLessOrEqZero(), -1, true }, //
				new Object[] { new CheckLessOrEqZero(), 1, false }, //
				new Object[] { new CheckLessOrEqZero(), 0, true }, //
				new Object[] { new CheckLessZero(), 0, false }, //
				new Object[] { new CheckLessZero(), -1, true }, //
				new Object[] { new CheckLessZero(), 1, false }, //
				new Object[] { new CheckK(), 1, false },//
		};
	}
}
