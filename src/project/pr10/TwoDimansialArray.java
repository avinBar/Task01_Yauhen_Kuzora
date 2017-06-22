package project.pr10;

public class TwoDimansialArray {
	private double[][] array;

	public TwoDimansialArray(int size) {
		this.array = new double[size][size];
		initArray();
	}

	private void initArray() {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (i % 2 == 0) {
					array[i][j] = j + 1;
				} else {
					array[i][j] = getArray().length - j;
				}
			}
		}
	}

	public String printArray2D() {
		String string = "";
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				string += String.format("%4.0f ", array[i][j]);
			}
			string += String.format("%s", "\n");
		}
		return string;
	}

	public double[][] getArray() {
		return this.array;
	}

	public void setArray(double[][] array) {
		this.array = array;
	}
}
