package project.pr3;

public class RightTriangle extends Triangle {
	private double square;

	public RightTriangle(double a, double b) {
		this.a = a;
		this.b = b;
		this.c = Math.sqrt(a * a + b * b);
	}
	
	public double getSquare() {
		this.square = a * b / 2;
		return this.square;
	}
}
