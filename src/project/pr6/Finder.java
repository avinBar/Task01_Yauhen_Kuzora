package project.pr6;

public class Finder {
	public double findResult(double first, double second, double third) {
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
