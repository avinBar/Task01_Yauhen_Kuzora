package pr4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleHelper {
	private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	public double inputUserCoordinate(String message) {
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

	public void printArg(String messsage, Object arg) {
		System.out.printf("%7s %b", messsage, arg);
	}
}
