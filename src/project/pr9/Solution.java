package project.pr9;

import project.pr8.ConsoleHelper;
import project.pr8.conditions.*;

class Solution {
	private int n, m, k;
	private double el;
	private OneDimensionalArray mas1, mas2, mas3;
	private ConsoleHelperPr9 newHelper = new ConsoleHelperPr9();
	private ConsoleHelper defaultHelper = new ConsoleHelper();

	void start() {
		defaultHelper.printArg(DialogMessages.INPUT_DATA.getMess());
		n = (int) defaultHelper.inputUserNumber(DialogMessages.INPUT_ARR1.getMess(), new CheckLessOrEqZero());
		mas1 = new OneDimensionalArray(n);
		defaultHelper.printArg(DialogMessages.INPUT_ELN.getMess());
		for (int i = 0; i < mas1.getArray().length; i++) {
			el = (double) newHelper.inputUserNumber(String.format("%s [%d]: ", DialogMessages.INPUT_EL.getMess(), i),
					new CheckK());
			mas1.getArray()[i] = el;
		}
		m = (int) defaultHelper.inputUserNumber(DialogMessages.INPUT_ARR2.getMess(), new CheckLessOrEqZero());
		mas2 = new OneDimensionalArray(m);
		defaultHelper.printArg(DialogMessages.INPUT_ELN.getMess());
		for (int i = 0; i < mas2.getArray().length; i++) {
			el = (double) newHelper.inputUserNumber(String.format("%s [%d]: ", DialogMessages.INPUT_EL.getMess(), i),
					new CheckK());
			mas2.getArray()[i] = el;
		}
		k = (int) newHelper.inputUserNumber(DialogMessages.INPUT_K.getMess(), new CheckK(), mas1);
		mas3 = new OneDimensionalArray(n + m);
		newHelper.printArg(DialogMessages.RESULT.getMess());
		mas3 = mas3.insertArray2InArray(mas1, mas2, k);
		newHelper.printArg(mas3.printArray());
	}
}
