package pr7.conditions;

import pr7.Equation;

public class CheckDx implements Checkable {
	public boolean isReady(double z, Equation equation) {
		if (z > equation.getB() - equation.getA() && z < 0) {
			return true;
		}
		return false;
	}
}
