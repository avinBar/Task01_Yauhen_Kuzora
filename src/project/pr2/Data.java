package project.pr2;

public class Data {
	private double a;
	private double b;
	private double c;
	private double result;

	public double getResult() {
		return result;
	}

	public void setResult() {
		result = (b + Math.sqrt(b * b + 4 * a * c) / (2 * a)) - a * a * a * c + 1 / (b * b);
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

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

}
