package project.pr4;

public class RectangleArea extends Area {
	private TDCoordinates f1;
	private TDCoordinates f2;
	private TDCoordinates f3;
	private TDCoordinates f4;

	public RectangleArea() {
	}

	public RectangleArea(TDCoordinates f1, TDCoordinates f2, TDCoordinates f3, TDCoordinates f4) {
		this.f1 = f1;
		this.f2 = f2;
		this.f3 = f3;
		this.f4 = f4;
	}

	public TDCoordinates getF1() {
		return f1;
	}

	public void setF1(TDCoordinates f1) {
		this.f1 = f1;
	}

	public TDCoordinates getF2() {
		return f2;
	}

	public void setF2(TDCoordinates f2) {
		this.f2 = f2;
	}

	public TDCoordinates getF3() {
		return f3;
	}

	public void setF3(TDCoordinates f3) {
		this.f3 = f3;
	}

	public TDCoordinates getF4() {
		return f4;
	}

	public void setF4(TDCoordinates f4) {
		this.f4 = f4;
	}

	public boolean checkPointInArea(TDCoordinates point) {
		return ((point.getX() >= this.f1.getX() & point.getY() >= this.f1.getY())
				& (point.getX() >= this.f2.getX() & point.getY() <= this.f2.getY()))
				& ((point.getX() <= this.f3.getX() & point.getY() <= this.f3.getY())
						& (point.getX() <= this.f4.getX() & point.getY() >= this.f4.getY()));
	}
}
