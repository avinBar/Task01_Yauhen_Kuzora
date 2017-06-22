package project.pr7.conditions;

import project.pr7.Equation;

public class CheckDx implements Checkable {
	public boolean isReady(double z, Equation equation) {
		return (z > equation.getB() - equation.getA() && z < 0);
	}
}
