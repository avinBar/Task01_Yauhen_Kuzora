package pr1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Checker {
	public boolean isFourDigitNumber(String fourDNumber) {
		Pattern pat = Pattern.compile("[0-9]{4}");
		Matcher mat;
		try {
			mat = pat.matcher(fourDNumber);
		} catch (Exception e) {
			return false;
		}
		if (mat.matches()) {
			return true;
		}
		return false;
	}

	public boolean isTrue(char[] chars) {
		if (chars.length > 4) {
			return false;
		}
		int a, b, c, d;
		a = Integer.parseInt(chars[0] + "");
		b = Integer.parseInt(chars[1] + "");
		c = Integer.parseInt(chars[2] + "");
		d = Integer.parseInt(chars[3] + "");
		if (a + b == c + d) {
			return true;
		}
		return false;
	}
}
