package pr1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ConsoleHelper {
	String input4DNumber(Checker checker) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String fourDNumber;
		System.out.printf("%s", DialogMessages.INPUT_FOUR_DIGIT_NUMBER.getMessage());
		while (true) {
			try {
				fourDNumber = reader.readLine();
				if (checker.isFourDigitNumber(fourDNumber) | fourDNumber.equals("q")) {
					reader.close();
					break;
				} else {
					System.out.printf("%s", DialogMessages.NOT_FOUR_DIGIT_NUMBER.getMessage());
				}
			} catch (IOException e) {
				System.out.printf("%s", DialogMessages.INPUT_FOUR_DIGIT_NUMBER.getMessage());
			}
		}
		return fourDNumber;
	}

	void printResults(String fourDNumber, boolean result) {
		if (fourDNumber.equals("q")) {
			System.out.printf("%s", DialogMessages.END.getMessage());
		} else {
			System.out.printf("%s %s\n", DialogMessages.NUMBER.getMessage(), fourDNumber);
			System.out.printf("%s %s\n", DialogMessages.RESULT.getMessage(), result);
			System.out.printf("%s", DialogMessages.END.getMessage());
		}
	}
}
