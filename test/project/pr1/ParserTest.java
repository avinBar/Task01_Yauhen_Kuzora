package project.pr1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class ParserTest {
	
	private Parser parser;

	@Test(dataProvider = "dataForParseToChars")
	public void tst_parseToChars(String str, char[] chars) {
		Assert.assertEquals(parser.parseToChars(str), chars);
	}

	@BeforeMethod
	public void beforeMethod() {
		parser = new Parser();
	}

	@AfterMethod
	public void afterMethod() {
		parser = null;
	}

	@DataProvider(name="dataForParseToChars")
	public Object[][] dp() {
		return new Object[][] { new Object[] { "1111", new char[] { '1', '1', '1', '1' } }, //
				new Object[] { "abcde", new char[] { 'a', 'b', 'c', 'd', 'e' } }, //
				new Object[] { " -+@a", new char[] { ' ', '-', '+', '@', 'a' } },//
		};
	}
}