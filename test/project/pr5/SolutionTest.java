package project.pr5;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SolutionTest {
	private Solution solution;
  @Test(dataProvider = "dp")
  public void tst_findResult(double result,double number) {
	  Assert.assertEquals(solution.findResult(number), result);
  }
  @BeforeMethod
  public void beforeMethod() {
	  solution=new Solution();
  }
  @AfterMethod
  public void afterMethod() {
	  solution=null;
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 16, -2 },//
      new Object[] { 4, 2 },//
      new Object[] { 0, 0 },//
      new Object[] { Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY },//
    };
  }
}
