package project.pr8.conditions;

public class CheckLessZero implements Checkable {
	public boolean isReady(double z) {
		if (z < 0) {
			return true;
		}
		return false;
	}
}
