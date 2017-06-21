package pr4;

public enum DialogMessages {
	INPUT_X("Please, input number x:\n"), 
	INPUT_Y("Please, input number y:\n"), 
	RESULT("Result :");
	private String message;

	private DialogMessages(String message) {
		this.message = message;
	}

	public String getMess() {
		return this.message;
	}
}
