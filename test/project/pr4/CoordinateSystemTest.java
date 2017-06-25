package project.pr4;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CoordinateSystemTest {
	private CartesianCoordinateSystem plane;

	@Test(dataProvider = "testCheckPointData")
	public void tst_checkPointInAllChoosenAreas(Area area, TDCoordinates point, boolean result) {
		plane.addAreaInCheckedArea(area);
		Assert.assertEquals(plane.checkPointInAllChoosenAreas(point), result);
	}

	@BeforeMethod
	public void beforeMethod() {
		plane = new CartesianCoordinateSystem();
	}

	@AfterMethod
	public void afterMethod() {
		plane = null;
	}

	@DataProvider(name="testCheckPointData")
	public Object[][] dp() {
		return new Object[][] { //
				new Object[] { new RectangleArea(new TDCoordinates(-4, -3), new TDCoordinates(4, 0),
						new TDCoordinates(4, 0), new TDCoordinates(4, -3)), new TDCoordinates(-5, 0), false }, //
				new Object[] { new RectangleArea(new TDCoordinates(-2, 0), new TDCoordinates(-2, 4),
						new TDCoordinates(2, 4), new TDCoordinates(2, 0)), new TDCoordinates(2, 1), true }, //
		};
	}
}
