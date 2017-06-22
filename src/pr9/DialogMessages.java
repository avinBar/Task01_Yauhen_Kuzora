package pr9;

enum DialogMessages {
	INPUT_DATA("Please, input data.\n"), 
	INPUT_ARR1("Input count of element for first array(>0):\n"),
	INPUT_ARR2("Input count of element for second array(>0):\n"),
	INPUT_ELN("Input array's element.\n"),
	INPUT_EL("Input element "),
	INPUT_K("Input k (k<=count of elements first array):\n"),
	RESULT("Result :");
	private String message;

	private DialogMessages(String message) {
		this.message = message;
	}

	String getMess() {
		return this.message;
	}
}
