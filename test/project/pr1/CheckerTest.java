package project.pr1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class CheckerTest {
	private Checker checker;

	@BeforeMethod
	public void beforeMethod() {
		checker = new Checker();
	}
	
	@AfterMethod
	public void afterMethod() {
		checker = new Checker();
	}
	
	@Test(dataProvider = "positiveDataForIsTrue")
	public void tst_isTrue(char[] numbers) {
		Assert.assertTrue(checker.isTrue(numbers));
	}

	@Test(dataProvider = "negativeDataForIsTrue")
	public void tst_negative_isTrue(char[] numbers) {
		Assert.assertFalse(checker.isTrue(numbers));
	}

	@Test(dataProvider = "dataForIsFourDigitNumber")
	public void tst_isFourDigitNumber(boolean expected, String number) {
		Assert.assertEquals(checker.isFourDigitNumber(number), expected);
	}

	@DataProvider(name="positiveDataForIsTrue")
	public Object[][] dp1() {
		return new Object[][] { new Object[] { '0', '0', '0', '0' }, //
				new Object[] { '9', '9', '9', '9' }, //
				new Object[] { '1', '2', '1', '2' }, //
				new Object[] { '1', '2', '2', '1' }, //
				new Object[] { '2', '1', '2', '1' }, //
				new Object[] { '2', '1', '2', '1' }, //
				new Object[] { '2', '1', '1', '2' },//
		};
	}

	@DataProvider(name="negativeDataForIsTrue")
	public Object[][] dp2() {
		return new Object[][] { new Object[] { '1', '1', '2', '2' }, //
				new Object[] { '1', '1', '1' }, //
				new Object[] { '1', '1', '1', '1', '1' },//
		};
	}

	@DataProvider(name="dataForIsFourDigitNumber")
	public Object[][] dp3() {
		return new Object[][] { new Object[] { true, "1234" }, //
				new Object[] { true, "0000" }, //
				new Object[] { false, "99999" }, //
				new Object[] { false, "999" }, //
				new Object[] { false, "12.3" }, //
				new Object[] { false, "aaaa" }, //
				new Object[] { false, "++++" },//
		};
	}
}