package pr1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Checker {

	boolean isFourDigitNumber(String fourDNumber) {
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
}
