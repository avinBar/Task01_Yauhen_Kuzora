package project.pr8;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class OneDimensionalArrayTest {
	private OneDimensionalArray odArray;
	private int array_size=1;

	@Test
	public void tst_construct() {
		odArray = new OneDimensionalArray(array_size);
		Assert.assertEquals(odArray.getArray().length, array_size);
	}
	
	@Test(dataProvider = "testFindSumData")
	public void tst_findSum(int[] arr, int divider, int result) {
		odArray = new OneDimensionalArray(arr.length);
		odArray.setArray(arr);
		Assert.assertEquals(odArray.findSum(divider), result);
	}

	@AfterMethod
	public void afterMethod() {
		odArray = null;
	}

	@DataProvider(name="testFindSumData")
	public Object[][] dp() {
		return new Object[][] { new Object[] { new int[] { 1, 2, 3, 4, 5, 6 }, 3, 9 }, //
				new Object[] { new int[] { 43, 89, 20, 28 }, 5, 20 }, //
				new Object[] { new int[] { 7, 9, 4, 13 }, 5, 0 },//
		};
	}
}
