package pr6;

class Finder {
	private double first;
	private double second;
	private double third;

	public Finder(double first, double second, double third) {
		this.first = first;
		this.second = second;
		this.third = third;
	}

	double findResult() {
		double result;
		double min = first;
		double max = first;
		if (second >= max) {
			max = second;
		}
		if (third >= max) {
			max = third;
		}
		if (second <= min) {
			min = second;
		}
		if (third <= min) {
			min = third;
		}
		result = max + min;
		return result;
	}
}
