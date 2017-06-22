package project.pr8.conditions;

public class CheckN implements Checkable {
	public boolean isReady(double z) {
		if (z <= 0 | z % 2 != 0) {
			return true;
		}
		return false;
	}
}
