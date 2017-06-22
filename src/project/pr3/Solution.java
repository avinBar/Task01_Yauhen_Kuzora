package project.pr3;

import project.pr3.DialogMessages;

class Solution {
	private RightTriangle triangle;
	private ConsoleHelper helper = new ConsoleHelper();
	private double a, b;

	void start() {
		a = helper.inputTriangeSide(DialogMessages.INPUT_A.getMess());
		b = helper.inputTriangeSide(DialogMessages.INPUT_B.getMess());
		triangle = new RightTriangle(a, b);
		helper.printArg(DialogMessages.PERIMERT.getMess(), triangle.getPerimeter());
		helper.printArg(DialogMessages.SQUARE.getMess(), triangle.getSquare());
	}
}