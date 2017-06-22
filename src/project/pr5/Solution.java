package project.pr5;

class Solution {
	private double first, second, third;
	private ConsoleHelper helper = new ConsoleHelper();

	void start() {
		helper.printArg(DialogMessages.INPUT_THREE.getMessage());
		first = helper.inputNumber(DialogMessages.FIRST_NUMBER.getMessage());
		second = helper.inputNumber(DialogMessages.SECOND_NUMBER.getMessage());
		third = helper.inputNumber(DialogMessages.THIRD_NUMBER.getMessage());
		helper.printArg(DialogMessages.RESULT.getMessage());
		helper.printArg(String.format("%7.3f", ((Double) findResult(first))));
		helper.printArg(String.format("%7.3f", ((Double) findResult(second))));
		helper.printArg(String.format("%7.3f", ((Double) findResult(third))));
	}

	private double findResult(double first) {
		return Math.pow(first, (first >= 0) ? 2 : 4);
	}
}
