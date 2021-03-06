package project.pr6;

import project.pr5.ConsoleHelper;
import project.pr5.DialogMessages;

class Solution {
	private Finder finder = new Finder();
	private double first, second, third;
	private ConsoleHelper helper = new ConsoleHelper();

	void start() {
		helper.printArg(DialogMessages.INPUT_THREE.getMessage());
		first = helper.inputNumber(DialogMessages.FIRST_NUMBER.getMessage());
		second = helper.inputNumber(DialogMessages.SECOND_NUMBER.getMessage());
		third = helper.inputNumber(DialogMessages.THIRD_NUMBER.getMessage());
		helper.printArg(DialogMessages.RESULT.getMessage());
		helper.printArg(String.format("%7.3f", ((Double) finder.findResult(first, second, third))));
	}
}
