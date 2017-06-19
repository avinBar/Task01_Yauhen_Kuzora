package pr1;

enum DialogMessages {
	InputFourDigitNumber("Please input four-digit number or 'q' for quit:\n"), 
	Result("Resuls:"),
	Number("Number:"),
	End("Program ended\n"),
	NotFourDigitNumber("It is not four-digit number, please, try input it again or 'q' for quit:\n");
	private String message;

	private DialogMessages(String message) {
		this.message = message;

	}

	String getMess(){
		return this.message;
	}
}
