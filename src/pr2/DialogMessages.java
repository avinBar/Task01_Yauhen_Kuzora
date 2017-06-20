package pr2;

enum DialogMessages {
	INPUT_A("Please, input number a:\n"), 
	INPUT_B("Please, input number b:\n"), 
	INPUT_C("Please, input number c:\n"), 
	RESULT("Result:");
	private String message;

	private DialogMessages(String message) {
		this.message = message;

	}

	String getMessage() {
		return this.message;
	}
}
