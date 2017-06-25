package project.pr9;

public class OneDimensionalArray {
	private double[] array;

	public OneDimensionalArray(int size) {
		this.array = new double[size];
	}

	public void setArray(double[] array) {
		this.array = array;
	}

	public double[] getArray() {
		return this.array;
	}

	public String printArray() {
		String mas3S = "";
		for (double d : array) {
			mas3S += String.format("%-6.3f\n", d);
		}
		return mas3S;
	}

	public OneDimensionalArray insertArray2InArray(OneDimensionalArray array1, OneDimensionalArray array2, int k) {
		OneDimensionalArray array = new OneDimensionalArray(array1.array.length + array2.array.length);
		for (int i = 0; i < array1.array.length; i++) {
			array.getArray()[i] = array1.getArray()[i];
		}
		for (int i = k; i < array1.array.length; i++) {
			array.getArray()[i + array2.array.length] = array.getArray()[i];
		}
		for (int i = 0; i < array2.array.length; i++) {
			array.getArray()[k + i] = array2.getArray()[i];
		}
		return array;
	}
}
