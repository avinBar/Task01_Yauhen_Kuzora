package project.pr2;

import project.pr2.DialogMessages;

class Solution {
	private double a, b, c, result;
	private ConsoleHelper helper = new ConsoleHelper();
	private Data data = new Data();

	void start() {
		a = helper.inputNumber(data, DialogMessages.INPUT_A.getMessage());
		data.setA(a);
		b = helper.inputNumber(data, DialogMessages.INPUT_B.getMessage());
		data.setB(b);
		c = helper.inputNumber(data, DialogMessages.INPUT_C.getMessage());
		data.setC(c);
		data.setResult();
		result = data.getResult();
		helper.printArg(DialogMessages.RESULT.getMessage(), result);
	}
}
