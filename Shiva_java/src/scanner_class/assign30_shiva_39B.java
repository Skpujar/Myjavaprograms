package scanner_class;
// Find the area and circumference of the circle,triangle,square,rectangle & trapezium using scanner class
import java.util.Scanner;

public class assign30_shiva_39B {

	public static void main(String[] args) {
		
		// Area of the circle 
		
		final double PI = 3.14;
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the area of the circle");
		int Radius = s1.nextInt();
		double area = PI * Radius * Radius;
		System.out.println("Area of the circle" + area);

		
		// Area of the Triangle
		
		Scanner s2 = new Scanner(System.in);
		System.out.println("enter the base of the triangle");
		int base = s2.nextInt();
		System.out.println("enter the height of the triangle");
		int height = s2.nextInt();
		int area1 = (base * height) / 2;
		System.out.println("Area of the triangle is" + area1);

		
      // Area of the 	Rectangle	
		
		Scanner s3 = new Scanner(System.in);
		System.out.println("enter the Width of the rectangle");
		int Width = s3.nextInt();
		System.out.println("enter the Length of the rectangle");
		int Length = s3.nextInt();
		int Areaofrectangle = (Length * Width);
		System.out.println("Area of the triangle is" + Areaofrectangle);

		
		// Area of the square
		
		Scanner s4 = new Scanner(System.in);
		System.out.println("enter value squre of side");
		int side = s4.nextInt();
		int areaofsqure = side * side;
		System.out.println("area of the squre" + areaofsqure);

		// Area of the trapezium 
		
		
		Scanner s5 = new Scanner(System.in);
		System.out.println("enter value Trapezium of a");
		double a = s5.nextInt();
		System.out.println("enter value Trapezium of b");
		double b = s5.nextInt();
		System.out.println("enter value Trapezium of h");
		double h = s5.nextInt();
		double areaofTrapezium = ((0.5)*(a + b)*h);
		System.out.println("area of the Trapezium" + areaofTrapezium);

	}

}
