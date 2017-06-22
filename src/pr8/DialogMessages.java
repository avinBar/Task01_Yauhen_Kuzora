package pr8;

enum DialogMessages {
	INPUT_DATA("Please, input data.\n"), 
	INPUT_MAS("Input array's element's.\n"),
	INPUT_EL("Input element "),
	INPUT_N("Please, input n: \n"),
	INPUT_K("Please, input k: \n"),
	RESULT("Result :");
	private String message;

	private DialogMessages(String message) {
		this.message = message;
	}
	
	String getMess() {
		return this.message;
	}
}
