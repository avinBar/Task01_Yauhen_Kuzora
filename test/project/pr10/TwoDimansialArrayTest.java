package project.pr10;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TwoDimansialArrayTest {
	private TwoDimansialArray tdArray;
	private int matrixSize = 2;
	private String printResult = "   1    2 \n   2    1 \n";

	@Test(dataProvider = "testInitArrayData")
	public void tst_initArray(double[][] expected_matrix, int size) {
		tdArray = new TwoDimansialArray(size);
		for (int i = 0; i < tdArray.getArray().length; i++) {
			Assert.assertEquals(tdArray.getArray()[i], expected_matrix[i]);
		}
	}

	@Test
	public void tst_printArray2D() {
		tdArray = new TwoDimansialArray(matrixSize);
		Assert.assertEquals(tdArray.printArray2D(), printResult);
	}

	@AfterMethod
	public void afterMethod() {
	}

	@DataProvider(name = "testInitArrayData")
	public Object[][] dp() {
		return new Object[][] { //
				new Object[] { new double[][] { { 1, 2, 3 }, { 3, 2, 1 }, { 1, 2, 3 } }, 3 }, //
				new Object[] { new double[][] { { 1, 2, 3, 4 }, { 4, 3, 2, 1 }, { 1, 2, 3, 4 }, { 4, 3, 2, 1 } }, 4 },//
		};
	}
}
