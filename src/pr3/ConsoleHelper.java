package pr3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ConsoleHelper {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	double inputTriangeSide(String message) {
		String string;
		double a;
		while (true) {
			System.out.printf("%s", message);
			try {
				string = reader.readLine();
				a = Double.parseDouble(string);
				if (a <= 0) {
					continue;
				}
				break;
			} catch (IOException | NumberFormatException e) {
				System.out.printf("%s", message);
			}
		}
		return a;
	}

	void printArg(String messsage, Object arg) {
		System.out.printf("%7s %6.3f", messsage, arg);
	}
}
