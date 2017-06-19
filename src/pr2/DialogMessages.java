package pr2;

enum DialogMessages {
	InputA("Please, input number a:\n"), 
	InputB("Please, input number b:\n"), 
	InputC("Please, input number c:\n"), 
	Result("Result:");
	private String message;

	private DialogMessages(String message) {
		this.message = message;

	}

	String getMess() {
		return this.message;
	}
}
