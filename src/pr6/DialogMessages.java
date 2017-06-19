package pr6;

enum DialogMessages {
	InputThree("Please, input three numbers.\n"), 
	FirstNumber("Please, input first number: \n"),
	SecondNumber("Please, input second number: \n"),
	ThirdNumber("Please, input third number: \n"),
	Result("Result :");
	private String message;

	private DialogMessages(String message) {
		this.message = message;

	}

	String getMess() {
		return this.message;
	}
}
