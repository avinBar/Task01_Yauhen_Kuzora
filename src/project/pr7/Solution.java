package project.pr7;

import project.pr7.conditions.CheckA;
import project.pr7.conditions.CheckB;
import project.pr7.conditions.CheckDx;

class Solution {
	private Equation equation = new Equation();
	private double a, b, dx;
	private ConsoleHelper helper = new ConsoleHelper();

	void start() {
		helper.printArg(DialogMessages.INPUT_DATA.getMess());
		a = helper.inputNumber(DialogMessages.FIRST_A.getMess(), equation, new CheckA());
		equation.setA(a);
		b = helper.inputNumber(DialogMessages.SECOND_B.getMess(), equation, new CheckB());
		equation.setB(b);
		dx = helper.inputNumber(DialogMessages.DX.getMess(), equation, new CheckDx());
		equation.setDx(dx);
		helper.printArg(equation.findResult());
	}
}
