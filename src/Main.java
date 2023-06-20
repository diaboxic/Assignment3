public class Main {

	public static void main(String[] args) {
		
		Rectangle rec = new Rectangle(4,5);
		System.out.println("Rectangle");
		System.out.println("Area: "+rec.area());
		System.out.println("Perimeter: "+rec.perimeter());
		
		Square sq = new Square(7);
		System.out.println("\nSquare");
		System.out.println("Area: "+sq.area());
		System.out.println("Perimeter: "+sq.perimeter());

	}

}
