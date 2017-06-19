package pr4;

class CartesianCoordinateSystem {
	private double x, y;

	CartesianCoordinateSystem(double x, double y) {
		this.x = x;
		this.y = y;
	}

	boolean checkArea() {
		if (this.y >= -4 & this.y <= 0) {
			if (this.x >= -4 & this.x <= 4) {
				return true;
			}
		} else if (this.y >= 0 & this.y <= 4) {
			if (this.x >= -2 & this.x <= 2) {
				return true;
			}
		}
		return false;
	}
}
