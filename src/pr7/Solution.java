package pr7;

import pr7.Conditions.ConditionA;
import pr7.Conditions.ConditionB;
import pr7.Conditions.ConditionDx;

class Solution {
	private Equation equation;
	private double a, b, dx;
	private ConsoleHelper helper = new ConsoleHelper();

	public void start() {
		equation = new Equation();
		helper.printArg(DialogMessages.INPUT_DATA.getMess());
		a = helper.inputNumber(DialogMessages.FIRST_A.getMess(), equation, new ConditionA());
		b = helper.inputNumber(DialogMessages.SECOND_B.getMess(), equation, new ConditionB());
		dx = helper.inputNumber(DialogMessages.DX.getMess(), equation, new ConditionDx());
		equation = new Equation(a, b, dx);
		helper.printArg(equation.findResult());
	}
}
