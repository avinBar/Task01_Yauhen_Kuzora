package pr8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import pr8.conditions.Checkable;

public class ConsoleHelper {
	protected BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	public Object inputUserNumber(String message, Checkable checkable) {
		int n;
		String string;
		while (true) {
			System.out.printf("%s", message);
			try {
				string = reader.readLine();
				n = Integer.parseInt(string);
				if (checkable.isReady(n)) {
					continue;
				}
				break;
			} catch (IOException | NumberFormatException e) {
			}
		}
		return n;
	}

	public void printArg(Object arg) {
		System.out.printf("%7s\n", arg);
	}
}
