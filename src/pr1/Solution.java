package pr1;

public class Solution {
	public void start() {
		Checker checker = new Checker();
		Parser parser = new Parser();
		ConsoleHelper helper = new ConsoleHelper();
		String fourDNumber;
		boolean result;
		fourDNumber = helper.input4DNumber(checker);
		result = checker.isTrue((parser.parseToChars(fourDNumber)));
		helper.printResults(fourDNumber, result);
	}
}
