package pr3;

enum DialogMessages {
	InputA("Please, input number a:\n"), 
	InputB("Please, input number b:\n"), 
	Square("Square:"),
	Perimetr("Perim:");
	private String message;

	private DialogMessages(String message) {
		this.message = message;

	}

	String getMess() {
		return this.message;
	}
}
