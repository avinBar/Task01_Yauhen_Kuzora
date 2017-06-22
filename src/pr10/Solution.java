package pr10;

import pr8.ConsoleHelper;
import pr8.conditions.CheckN;


class Solution {
	private int n;
	private TwoDimansialArray array;
	private ConsoleHelper helper = new ConsoleHelper();

	void start() {
		helper.printArg(DialogMessages.INPUT_DATA.getMess());
		n = (int) helper.inputUserNumber(DialogMessages.INPUT_ARR1.getMess(), new CheckN());
		array = new TwoDimansialArray(n);
		helper.printArg(DialogMessages.RESULT.getMess());
		helper.printArg(array.printArray2D());
	}
}
