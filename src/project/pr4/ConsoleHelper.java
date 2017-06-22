package project.pr4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ConsoleHelper {
	private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	double inputUserCoordinate(String message) {
		String string;
		double x;
		while (true) {
			System.out.printf("%s", message);
			try {
				string = reader.readLine();
				x = Double.parseDouble(string);
				break;
			} catch (IOException | NumberFormatException e) {
				System.out.printf("%s", message);
			}
		}
		return x;
	}

	void printArg(String message, Object arg) {
		System.out.printf("%s %b\n", message, arg);
	}
}
