package project.pr3;

public class Triangle {
	double a;
	double b;
	double c;
	double perim;

	public Triangle() {
	}

	public Triangle(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.perim = a + b + c;
	}

	public double getPerim() {
		return perim;
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
