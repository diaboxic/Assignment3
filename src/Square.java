public class Square extends Rectangle {
	
	public Square(double side) {
		super(side, side);
	}
	
	public double area() { 
		return length * width;
	}
	
	public double perimeter() {
		return 2 * (length + width);
	}

}

