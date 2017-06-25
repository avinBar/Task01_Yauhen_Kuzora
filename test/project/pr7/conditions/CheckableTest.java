package project.pr7.conditions;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import project.pr7.Equation;

public class CheckableTest {
	private Checkable check;

	@Test(dataProvider = "testCheckableData")
	public void isReady(Checkable checker, double z, Equation equation, boolean result) {
		check = checker;
		Assert.assertEquals(check.isReady(z, equation), result);
	}

	@AfterMethod
	public void afterMethod() {
		check = null;
	}

	@DataProvider(name = "testCheckableData")
	public Object[][] dp() {
		return new Object[][] { new Object[] { new CheckA(), 2, new Equation(), false }, //
				new Object[] { new CheckB(), 1, new Equation(2, 0, 0), true }, //
				new Object[] { new CheckB(), 2, new Equation(1, 0, 0), false }, //
				new Object[] { new CheckDx(), 1, new Equation(1, 5, 0), false }, //
				new Object[] { new CheckDx(), 6, new Equation(1, 5, 0), false }, //
				new Object[] { new CheckDx(), -1, new Equation(-5, -1, 0), false },//
		};
	}
}
