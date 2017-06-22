package pr8.conditions;

import pr9.OneDimensionalArray;

public class CheckK implements Checkable {
	public boolean isReady(double z) {
		return false;
	}

	public boolean isReady(double z, OneDimensionalArray array) {
		if (z <= 0 || z > array.getArray().length) {
			return true;
		}
		return false;
	}
}
