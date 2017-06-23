package project.pr4;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TDCoordinatesTest {
	private TDCoordinates tdCoordinates;
  @Test(dataProvider = "dp")
  public void tstTDCoordinates_constructor(double x, double y) {
	  tdCoordinates=new TDCoordinates(x, y);
	  Assert.assertEquals(tdCoordinates.getX(), x);
	  Assert.assertEquals(tdCoordinates.getY(), y);
  }

  @AfterMethod
  public void afterMethod() {
	  tdCoordinates=null;
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, 1 },//
      new Object[] { -1, -1 },//
      new Object[] { 1.5, -1.5 },//
    };
  }
}
