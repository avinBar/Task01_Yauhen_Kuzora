package pr9;

class OneDimensialArray {
	private double[] mas;
	private int size;

	public OneDimensialArray(int size) {
		this.size = size;
		this.mas = new double[size];
	}

	double[] getMas() {
		return this.mas;
	}

	int getSize() {
		return this.size;
	}

	String printArray() {
		String mas3S = "";
		for (double d : mas) {
			mas3S += String.format("%-6.3f\n", d);
		}
		return mas3S;
	}

	OneDimensialArray arrayInArray2(OneDimensialArray mas1, OneDimensialArray mas2, int k) {
		OneDimensialArray m = new OneDimensialArray(mas1.size + mas2.size);
		for (int i = 0; i < mas1.getSize(); i++) {
			m.getMas()[i] = mas1.getMas()[i];
		}
		for (int i = 0; i < mas1.getSize(); i++) {
			if (i >= k) {
				m.getMas()[i + mas2.getSize()] = m.getMas()[i];
			}
		}
		for (int i = 0; i < mas2.getSize(); i++) {
			m.getMas()[k + i] = mas2.getMas()[i];
		}
		return m;
	}

}
