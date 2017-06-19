package pr3;

enum DialogMessages {
	INPUT_A("Please, input number a:\n"), 
	INPUT_B("Please, input number b:\n"), 
	SQUARE("Square:"),
	PERIMERT("Perim:");
	private String message;

	private DialogMessages(String message) {
		this.message = message;

	}

	String getMess() {
		return this.message;
	}
}
