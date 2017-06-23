package project.pr2;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataTest {
	private Data data;

	@Test(dataProvider = "dp")
	public void tst_DataConstructor(double expected,double a, double b, double c) {
		data=new Data(a,b,c);
		Assert.assertEquals(data.getA(), a);
		Assert.assertEquals(data.getB(), b);
		Assert.assertEquals(data.getC(), c);
	}

	@Test(dataProvider = "dp")
	public void tst_getResult(double expected, double a, double b, double c) {
		data = new Data(a, b, c);
		Assert.assertEquals(data.getResult(), expected);
	}


	@AfterMethod
	public void afterMethod() {
		data=null;
	}

	@DataProvider
	public Object[][] dp() {
		return new Object[][] { new Object[] { Double.NaN, 1, 1, -1 }, //
				new Object[] { 1.618033988749895, 1, 1, 1 },//
				new Object[] { 1.0, 1, 1, 2 },//
				new Object[] { Double.POSITIVE_INFINITY, 0, 2, 2 },//
				new Object[] { -3.0000215668056605, 1.5, 1.5, 1.5 },//
		};
	}
}
