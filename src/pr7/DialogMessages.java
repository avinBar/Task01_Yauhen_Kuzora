package pr7;

enum DialogMessages {
	INPUT_DATA("Please, input data.\n"), 
	FIRST_A("Please, input a: \n"),
	SECOND_B("Please, input b: \n"),
	DX("Please, input h: \n"),
	RESULT("Result :");
	private String message;

	private DialogMessages(String message) {
		this.message = message;

	}

	String getMess() {
		return this.message;
	}
}
