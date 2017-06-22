package project.pr1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Checker {
	boolean isFourDigitNumber(String fourDNumber) {
		Pattern pattern = Pattern.compile("[0-9]{4}");
		Matcher matcher = pattern.matcher(fourDNumber);
		return matcher.matches();
	}

	boolean isTrue(char[] chars) {
		if (chars.length > 4) {
			return false;
		}
		int a, b, c, d;
		a = Integer.parseInt(chars[0] + "");
		b = Integer.parseInt(chars[1] + "");
		c = Integer.parseInt(chars[2] + "");
		d = Integer.parseInt(chars[3] + "");
		return (a + b == c + d);
	}
}
