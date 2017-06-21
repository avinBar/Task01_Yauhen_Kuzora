package pr8;

public enum DialogMessages {
	INPUT_DATA("Please, input data.\n"), 
	INPUT_MAS("Input mas element's.\n"),
	INPUT_EL("Input mas element"),
	INPUT_N("Please, input n: \n"),
	INPUT_K("Please, input k: \n"),
	RESULT("Result :");
	private String message;

	private DialogMessages(String message) {
		this.message = message;
	}
	
	public String getMess() {
		return this.message;
	}
}
