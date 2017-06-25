package project.pr7;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EquationTest {
	private Equation equation;
  @Test(dataProvider = "dp")
  public void tst_constructor(double a,double b,double dx) {
	  equation=new Equation(a,b,dx);
	  Assert.assertEquals(equation.getA(), a);
	  Assert.assertEquals(equation.getB(), b);
	  Assert.assertEquals(equation.getDx(), dx);
  }
  
  @AfterMethod
  public void afterMethod() {
	  equation=null;
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, 10, 2 },
      new Object[] { 0, 0, 0 },
    };
  }
}
