package project.pr4;

enum DialogMessages {
	INPUT_X("Please, input number x:\n"), 
	INPUT_Y("Please, input number y:\n"), 
	RESULT("Result :");
	private String message;

	private DialogMessages(String message) {
		this.message = message;
	}

	String getMess() {
		return this.message;
	}
}
