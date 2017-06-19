package pr3;

class Triangle {
	private double a, b, c, Square, Perim;

	Triangle(double a, double b) {
		this.a = a;
		this.b = b;
		this.c = Math.sqrt(a * a + b * b);
	}
	 double findSquare(){
		 Square = a*b/2;
		 return Square;
	 }
	
	 double findPerim(){
		 Perim = a + b + c;
		 return Perim;
	 }
}
