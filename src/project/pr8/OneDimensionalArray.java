package project.pr8;

public class OneDimensionalArray {
	private int[] array;

	public OneDimensionalArray(int size) {
		array = new int[size];
	}

	public int[] getArray() {
		return array;
	}

	public void setArray(int[] array) {
		this.array = array;
	}

	public int findSum(int ckeckNumber) {
		int sum = 0;
		for (int i : array) {
			if ((i % ckeckNumber) == 0) {
				sum += i;
			}
		}
		return sum;
	}
}
