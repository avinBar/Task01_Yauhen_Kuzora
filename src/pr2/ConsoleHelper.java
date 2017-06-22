package pr2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ConsoleHelper {
	private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	double inputNumber(Data data, String message) {
		String string;
		double a;
		while (true) {
			System.out.printf("%s", message);
			try {
				string = reader.readLine();
				a = Double.parseDouble(string);
				break;
			} catch (IOException | NumberFormatException e) {
				System.out.printf("%s", message);
			}
		}
		return a;
	}

	void printArg(String message, Object arg) {
		System.out.printf("%s %6.3f", message, arg);
	}
}
