package project.pr7.conditions;

import project.pr7.Equation;

public class CheckB implements Checkable {
	public boolean isReady(double z, Equation equation) {
		return (z < equation.getA());
	}
}
