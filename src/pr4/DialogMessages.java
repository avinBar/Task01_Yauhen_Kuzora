package pr4;

enum DialogMessages {
	InputX("Please, input number x:\n"), 
	InputY("Please, input number y:\n"),
	Result("Result :");
	private String message;

	private DialogMessages(String message) {
		this.message = message;

	}

	String getMess() {
		return this.message;
	}
}
