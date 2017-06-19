package pr10;

enum DialogMessages {
	INPUT_DATA("Please, input data.\n"), 
	INPUT_ARR1("Input count of element for two-dimensial array(>0):\n"),
	RESULT("Result :");
	private String message;

	private DialogMessages(String message) {
		this.message = message;
	}

	String getMess() {
		return this.message;
	}
}
