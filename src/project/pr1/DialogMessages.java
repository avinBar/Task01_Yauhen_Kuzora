package project.pr1;

enum DialogMessages {
	INPUT_FOUR_DIGIT_NUMBER("Please input four-digit number or 'q' for quit:\n"), 
	RESULT("Resuls:"), 
	NUMBER("Number:"), 
	END("Program ended.\n"), 
	NOT_FOUR_DIGIT_NUMBER("It is not four-digit number, please, try input it again or 'q' for quit:\n");
	private String message;

	private DialogMessages(String message) {
		this.message = message;
	}

	String getMessage() {
		return this.message;
	}
}
