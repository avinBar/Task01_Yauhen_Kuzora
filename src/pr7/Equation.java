package pr7;

public class Equation {
	private double a, b, dx;

	public Equation() {
	}

	public Equation(double a, double b, double dx) {
		this.a = a;
		this.b = b;
		this.dx = dx;
	}

	public String findResult() {
		double result;
		double x = a;
		String resultToString = "";
		resultToString += String.format("|%3s%-8s%3s|%3s%-8s%3s|\n", " ", "x", " ", " ", "f(x)", " ");
		while (x < b) {
			result = (Math.sin(x) * Math.sin(x)) - Math.cos(2 * x);
			resultToString += String.format("|%3s%-8.3f%3s|%3s%-8.3f%3s|\n", " ", x, " ", " ", result, " ");
			x += dx;
		}
		if (x - dx <= b) {
			x = b;
			result = (Math.sin(x) * Math.sin(x)) - Math.cos(2 * x);
			resultToString += String.format("|%3s%-8.3f%3s|%3s%-8.3f%3s|\n", " ", x, " ", " ", result, " ");
			x += dx;
		}
		return resultToString;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getDx() {
		return dx;
	}

	public void setDx(double dx) {
		this.dx = dx;
	}

}
