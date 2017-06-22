package project.pr8;

import project.pr8.conditions.*;

class Solution {
	private int n, k, el;
	private OneDimensionalArray array;
	private ConsoleHelper helper = new ConsoleHelper();

	void start() {
		helper.printArg(DialogMessages.INPUT_DATA.getMess());
		n = (int) helper.inputUserNumber(DialogMessages.INPUT_N.getMess(), new CheckLessOrEqZero());
		k = (int) helper.inputUserNumber(DialogMessages.INPUT_K.getMess(), new CheckLessOrEqZero());
		array = new OneDimensionalArray(n);
		helper.printArg(DialogMessages.INPUT_MAS.getMess());
		for (int i = 0; i < array.getArray().length; i++) {
			el = (int) helper.inputUserNumber(DialogMessages.INPUT_EL.getMess() + String.format("[%d]: ", i),
					new CheckLessZero());
			array.getArray()[i] = el;
		}
		helper.printArg(String.format("%s %-7d\n", DialogMessages.RESULT.getMess(), array.findSum(k)));
	}
}
