package pr2;

import pr2.DialogMessages;

public class Solution {
	public void start() {
		double a, b, c, result;
		ConsoleHelper helper = new ConsoleHelper();
		Data data = new Data();
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
