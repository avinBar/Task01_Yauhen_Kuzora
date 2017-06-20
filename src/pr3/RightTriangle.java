package pr3;

public class RightTriangle extends Triangle {
	private double square;

	public RightTriangle(double a, double b) {
		this.a = a;
		this.b = b;
		this.c = Math.sqrt(a * a + b * b);
		this.square = a * b / 2;
		this.perim = a + b + c;
	}

	public double getSquare() {
		return this.square;
	}
}
