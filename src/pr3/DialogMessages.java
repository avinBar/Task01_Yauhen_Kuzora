package pr3;

enum DialogMessages {
	INPUT_A("Please, input first side a:\n"), INPUT_B("Please, input second side b:\n"), SQUARE("Square:"), PERIMERT(
			"Perimeter:");
	private String message;

	private DialogMessages(String message) {
		this.message = message;
	}

	String getMess() {
		return this.message;
	}
}
