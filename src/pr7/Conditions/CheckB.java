package pr7.conditions;

import pr7.Equation;

public class CheckB implements Checkable {
	public boolean isReady(double z, Equation equation) {
		if (z < equation.getA()) {
			return true;
		}
		return false;
	}
}
