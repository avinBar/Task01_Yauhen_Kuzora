package pr5;

public enum DialogMessages {
	INPUT_THREE("Please, input three numbers.\n"), 
	FIRST_NUMBER("Please, input first number: \n"), 
	SECOND_NUMBER("Please, input second number: \n"), 
	THIRD_NUMBER("Please, input third number: \n"), 
	RESULT("Result :");
	private String message;

	private DialogMessages(String message) {
		this.message = message;
	}

	public String getMessage() {
		return this.message;
	}
}
