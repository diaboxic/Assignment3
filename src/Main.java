import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("One side of Rectangle: ");
		int a = scn.nextInt();
		System.out.println("Another side of Rectangle: ");
		int b = scn.nextInt();
		System.out.println("Side of Square: ");
		int c = scn.nextInt();

		
		Rectangle rec = new Rectangle(a,b);
		System.out.println("\nRectangle");
		System.out.println("Area: "+rec.area());
		System.out.println("Perimeter: "+rec.perimeter());
		
		Square sq = new Square(c);
		System.out.println("\nSquare");
		System.out.println("Area: "+sq.area());
		System.out.println("Perimeter: "+sq.perimeter());
		
		scn.close();

	}

}
