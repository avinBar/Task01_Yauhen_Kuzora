package project.pr9;

public class OneDimensionalArray {
	private double[] array;

	public OneDimensionalArray(int size) {
		this.array = new double[size];
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

	public OneDimensionalArray insertArray2InArray(OneDimensionalArray mas1, OneDimensionalArray mas2, int k) {
		OneDimensionalArray m = new OneDimensionalArray(mas1.array.length + mas2.array.length);
		for (int i = 0; i < mas1.array.length; i++) {
			m.getArray()[i] = mas1.getArray()[i];
		}
		for (int i = 0; i < mas1.array.length; i++) {
			if (i >= k) {
				m.getArray()[i + mas2.array.length] = m.getArray()[i];
			}
		}
		for (int i = 0; i < mas2.array.length; i++) {
			m.getArray()[k + i] = mas2.getArray()[i];
		}
		return m;
	}
}
