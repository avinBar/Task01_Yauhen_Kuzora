package project.pr1;

class Solution {
	private Checker checker = new Checker();
	private Parser parser = new Parser();
	private ConsoleHelper helper = new ConsoleHelper();
	private String fourDNumber;
	private boolean result;

	void start() {
		fourDNumber = helper.input4DNumber(checker);
		result = checker.isTrue((parser.parseToChars(fourDNumber)));
		helper.printResults(fourDNumber, result);
	}
}
