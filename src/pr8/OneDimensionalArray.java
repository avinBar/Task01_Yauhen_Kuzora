package pr8;

class OneDimensionalArray {
	private int size;
	private int[] mas;

	OneDimensionalArray(int size) {
		this.size = size;
		mas = new int[size];
	}

	int getSize() {
		return size;
	}

	int[] getArray() {
		return mas;
	}

	int findSum(int ckeckNumber) {
		int sum = 0;
		for (int i : mas) {
			if ((i % ckeckNumber) == 0) {
				sum += i;
			}
		}
		return sum;
	}
}
