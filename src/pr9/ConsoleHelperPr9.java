package pr9;

import java.io.IOException;

import pr8.conditions.CheckK;
import pr8.conditions.Checkable;

public class ConsoleHelperPr9 extends pr8.ConsoleHelper {

	public Object inputUserNumber(String message, Checkable checkable) {
		double n;
		String string;
		while (true) {
			System.out.printf("%s", message);
			try {
				string = reader.readLine();
				n = Double.parseDouble(string);
				if (checkable.isReady(n)) {
					continue;
				}
				break;
			} catch (IOException | NumberFormatException e) {
			}
		}
		return n;
	}

	public Object inputUserNumber(String message, CheckK checkable, OneDimensionalArray array) {
		int n;
		String string;
		while (true) {
			System.out.printf("%s", message);
			try {
				string = reader.readLine();
				n = Integer.parseInt(string);
				if (checkable.isReady(n, array)) {
					continue;
				}
				break;
			} catch (IOException | NumberFormatException e) {
			}
		}
		return n;
	}
}
