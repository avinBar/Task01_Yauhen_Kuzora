package project.pr9;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class OneDimensionalArrayTest {
	private OneDimensionalArray array;

	@Test(dataProvider = "testOneDimArrayData")
	public void insertArray2InArray(double[] arr1, double[] arr2, double[] result, int k) {
		OneDimensionalArray array1 = new OneDimensionalArray(arr1.length);
		array1.setArray(arr1);
		OneDimensionalArray array2 = new OneDimensionalArray(arr2.length);
		array2.setArray(arr2);
		array = new OneDimensionalArray(arr1.length + arr2.length);
		Assert.assertEquals(array.insertArray2InArray(array1, array2, k).getArray(), result);
	}

	@AfterMethod
	public void afterMethod() {
		array = null;
	}

	@DataProvider(name = "testOneDimArrayData")
	public Object[][] dp() {
		return new Object[][] { //
				new Object[] { new double[] { 92, 81, 15, 48, 76 }, new double[] { 85, 30, 51 },
						new double[] { 92, 85, 30, 51, 81, 15, 48, 76 }, 1 }, //
				new Object[] { new double[] { 1, 2, 3, 4 }, new double[] { 7, 8, 9, 10, 11 },
						new double[] { 1, 2, 7, 8, 9, 10, 11, 3, 4 }, 2 }, };
	}
}
