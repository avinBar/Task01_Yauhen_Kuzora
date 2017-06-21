package pr7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import pr7.Conditions.Condition;

public class ConsoleHelper {
	private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	public double inputNumber(String message, Equation equation, Condition condition) {
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

	public void printArg(Object arg) {
		System.out.printf("%7s\n", arg);
	}
}
