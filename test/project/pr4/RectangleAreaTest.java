package project.pr4;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RectangleAreaTest {
  private RectangleArea rectArea;
	
  @Test(dataProvider = "dp1")
  public void tstRectangleArea_constructor(TDCoordinates f1,TDCoordinates f2,TDCoordinates f3,TDCoordinates f4,TDCoordinates point) {
	  rectArea=new RectangleArea(f1,f2,f3,f4);
	  Assert.assertEquals(rectArea.getF1(), f1);
	  Assert.assertEquals(rectArea.getF2(), f2);
	  Assert.assertEquals(rectArea.getF3(), f3);
	  Assert.assertEquals(rectArea.getF4(), f4);
  }
  
  @Test(dataProvider = "testPointInAreaData")
  public void tst_checkPointInArea(TDCoordinates f1,TDCoordinates f2,TDCoordinates f3,TDCoordinates f4,TDCoordinates point) {
	  rectArea=new RectangleArea(f1,f2,f3,f4);
	  Assert.assertTrue(rectArea.checkPointInArea(point));
  }
  
  @Test(dataProvider = "dp2")
  public void tst_false_checkPointInArea(TDCoordinates f1,TDCoordinates f2,TDCoordinates f3,TDCoordinates f4,TDCoordinates point) {
	  rectArea=new RectangleArea(f1,f2,f3,f4);
	  Assert.assertFalse(rectArea.checkPointInArea(point));
  }

  @AfterMethod
  public void afterMethod() {
	  rectArea=null;
  }


  @DataProvider(name="testPointInAreaData")
  public Object[][] dp1() {
    return new Object[][] {
      new Object[] { new TDCoordinates(-2,0),new TDCoordinates(-2,4),new TDCoordinates(2,4),new TDCoordinates(2,0),new TDCoordinates(1,1) },//
      new Object[] { new TDCoordinates(-2,0),new TDCoordinates(-2,4),new TDCoordinates(2,4),new TDCoordinates(2,0),new TDCoordinates(0,0) },//
      new Object[] { new TDCoordinates(-2,0),new TDCoordinates(-2,4),new TDCoordinates(2,4),new TDCoordinates(2,0),new TDCoordinates(-2,2) },//
      new Object[] { new TDCoordinates(-2,0),new TDCoordinates(-2,4),new TDCoordinates(2,4),new TDCoordinates(2,0),new TDCoordinates(0,4) },//
      new Object[] { new TDCoordinates(-2,0),new TDCoordinates(-2,4),new TDCoordinates(2,4),new TDCoordinates(2,0),new TDCoordinates(2,2) },//
      new Object[] { new TDCoordinates(-2,0),new TDCoordinates(-2,4),new TDCoordinates(2,0),new TDCoordinates(2,4),new TDCoordinates(0,2) },//
      new Object[] { new TDCoordinates(-4,-3),new TDCoordinates(-4,0),new TDCoordinates(4,0),new TDCoordinates(4,-3),new TDCoordinates(-4,0) },//
    };
  }
  
  @DataProvider(name="testPointNotInAreaData")
  public Object[][] dp2() {
    return new Object[][] {
      new Object[] { new TDCoordinates(-2,0),new TDCoordinates(-2,4),new TDCoordinates(2,4),new TDCoordinates(2,0),new TDCoordinates(-5,1) },//
      new Object[] { new TDCoordinates(-2,0),new TDCoordinates(-2,4),new TDCoordinates(2,0),new TDCoordinates(2,4),new TDCoordinates(1,1) },//
      new Object[] { new TDCoordinates(-4,-3),new TDCoordinates(-4,0),new TDCoordinates(4,0),new TDCoordinates(4,-3),new TDCoordinates(0,5) },//
    };
  }
}
