public class Rectangle {

	public double length;
	public double width;
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
		}
	
	public double area() { 
		return length * width;
	}
	
	public double perimeter() {
		return 2 * (length + width);
	}

}
