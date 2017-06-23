package project.pr2;

import project.pr2.DialogMessages;

class Solution {
	private double a, b, c, result;
	private ConsoleHelper helper = new ConsoleHelper();
	private Data data;

	void start() {
		a = helper.inputNumber(DialogMessages.INPUT_A.getMessage());
		b = helper.inputNumber(DialogMessages.INPUT_B.getMessage());
		c = helper.inputNumber(DialogMessages.INPUT_C.getMessage());
		data = new Data(a, b, c);
		result = data.getResult();
		helper.printArg(DialogMessages.RESULT.getMessage(), result);
	}
}
