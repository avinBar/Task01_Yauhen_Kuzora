package pr7.Conditions;

import pr7.Equation;

public class ConditionDx implements Condition {
	public boolean isReady(double z, Equation equation) {
		if (z > equation.getB() - equation.getA() && z < 0) {
			return true;
		}
		return false;
	}
}
