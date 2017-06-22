package project.pr7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import project.pr7.conditions.Checkable;

class ConsoleHelper {
	private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	double inputNumber(String message, Equation equation, Checkable condition) {
		double number;
		String string;
		while (true) {
			System.out.printf("%s", message);
			try {
				string = reader.readLine();
				number = Double.parseDouble(string);
				if (condition.isReady(number, equation)) {
					continue;
				}
				break;
			} catch (IOException | NumberFormatException e) {
				System.out.printf("%s", message);
			}
		}
		return number;
	}

	void printArg(Object arg) {
		System.out.printf("%7s\n", arg);
	}
}
