package pr10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {
	private int n;
	private TwoDimansialArray mas1;
	private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	void start() {
		String string;
		System.out.printf("%s", DialogMessages.INPUT_DATA.getMess());
		while (true) {
			System.out.printf("%s", DialogMessages.INPUT_ARR1.getMess());
			try {
				string = reader.readLine();
				n = Integer.parseInt(string);
				if (n <= 0 | n % 2 != 0) {
					continue;
				}
				mas1 = new TwoDimansialArray(n);
				reader.close();
				break;
			} catch (IOException | NumberFormatException e) {
			}
		}
		System.out.printf("%s\n", DialogMessages.RESULT.getMess());
		System.out.printf("%s", mas1.printArray2D());
	}
}
