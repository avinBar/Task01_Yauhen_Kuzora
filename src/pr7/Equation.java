package pr7;

class Equation {
	private double a, b, dx;

	Equation(double a, double b, double dx) {
		this.a = a;
		this.b = b;
		this.dx = dx;
	}

	String findResult() {
		double result;
		double x = a;
		String resultToString = "";
		resultToString += String.format("|%3s%-7s%3s|%3s%-7s%3s|\n", " ", "x", " ", " ", "f(x)", " ");
		while (x < b) {
			result = (Math.sin(x) * Math.sin(x)) - Math.cos(2 * x);
			resultToString += String.format("|%3s%-7.3f%3s|%3s%-7.3f%3s|\n", " ", x, " ", " ", result, " ");
			x += dx;
		}

		if (x - dx <= b) {
			x = b;
			result = (Math.sin(x) * Math.sin(x)) - Math.cos(2 * x);
			resultToString += String.format("|%3s%-7.3f%3s|%3s%-7.3f%3s|\n", " ", x, " ", " ", result, " ");
			x += dx;
		}
		return resultToString;
	}

}
