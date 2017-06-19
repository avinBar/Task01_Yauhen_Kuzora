package pr8;

class OneDimensionalArray {
	private int size;
	private int[] mas;
	private int ckeckNumber;

	OneDimensionalArray(int size, int k) {
		this.size = size;
		mas = new int[size];
		this.ckeckNumber = k;
	}

	int getSize() {
		return size;
	}

	int[] getArray() {
		return mas;
	}

	int findSum() {
		int sum = 0;
		for (int i : mas) {
			if ((i % ckeckNumber) == 0) {
				sum += i;
			}
		}
		return sum;
	}
}
