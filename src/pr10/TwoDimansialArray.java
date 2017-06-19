package pr10;

class TwoDimansialArray {
	private double[][] mas;
	private int size;

	TwoDimansialArray(int size) {
		this.size = size;
		this.mas = new double[size][size];
		initArray();
	}

	private void initArray() {
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas.length; j++) {
				if (i % 2 == 0) {
					mas[i][j] = j + 1;
				} else {
					mas[i][j] = size - j;
				}
			}
		}
	}

	String printArray2D() {
		String string = "";
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas.length; j++) {
				string += String.format("%4.0f ", mas[i][j]);
			}
			string += String.format("%s", "\n");
		}
		return string;
	}

	double[][] getArray() {
		return this.mas;
	}

	int getSize() {
		return this.size;
	}
}
