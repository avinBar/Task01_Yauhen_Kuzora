package project.pr3;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class RightTriangleTest {
	private RightTriangle rightTriangle;

	@Test(dataProvider = "testRightTriangleData")
	public void tst_getSquare(double perimeter,double square,double a,double b) {
		rightTriangle=new RightTriangle(a,b);
		Assert.assertEquals(rightTriangle.getSquare(), square);
	}
	
	@Test(dataProvider = "dtestRightTriangleData")
	public void tst_getPerimeter(double perimeter,double square,double a,double b) {
		rightTriangle=new RightTriangle(a,b);
		Assert.assertEquals(rightTriangle.getPerimeter(), perimeter,0.001);
		
	}
	
	@Test(dataProvider = "testRightTriangleData")
	public void tst_rightTriangle_constructor(double perimeter,double square,double a,double b) {
		rightTriangle=new RightTriangle(a,b);
		double c=Math.sqrt(a*a+b*b);
		Assert.assertEquals(rightTriangle.getA(), a);
		Assert.assertEquals(rightTriangle.getB(), b);
		Assert.assertEquals(rightTriangle.getC(), c);
	}

	@BeforeMethod
	public void beforeMethod() {
	}

	@AfterMethod
	public void afterMethod() {
		rightTriangle=null;
	}

	@DataProvider (name="testRightTriangleData")
	public Object[][] dp() {
		return new Object[][] { new Object[] { 3.414213, 0.5, 1, 1 },//
			new Object[] { 12, 6, 3, 4 },//
			new Object[] { 24, 24, 6, 8 },//
			new Object[] { 5.1213203435596, 1.125, 1.5, 1.5 },//
			};
		}
	}

