package project.pr2;

public class Data {
	private double a;
	private double b;
	private double c;
	private double result;

	public Data(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getResult() {
		result = ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a)) - Math.pow(a, 3) * c + Math.pow(b, -2);
		return result;
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
