package basicsofjava;
// Write a program to find Area of Circle,Triangle,Rectangle,Square,Trapezium 

import java.util.Scanner;

public class Assign_22_Shiva_39b {

	public static void main(String[] args)

	{
		double area, PI = 3.14, Radius;
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the area of the circle");
		Radius = s1.nextDouble();
		area = PI * Radius * Radius;
		System.out.println("Area of the circle" + area);

		
		
		int base = 0, height = 0, area1 = 0;
		Scanner s2 = new Scanner(System.in);
		System.out.println("enter the base of the triangle");
		base = s2.nextInt();
		System.out.println("enter the height of the triangle");
		height = s2.nextInt();
		area1 = (base * height) / 2;
		System.out.println("Area of the triangle is" + area1);

		
		
		int Length = 0, Width = 0, Areaofrectangle = 0;
		Scanner s3 = new Scanner(System.in);
		System.out.println("enter the Width of the rectangle");
		Width = s3.nextInt();
		System.out.println("enter the Length of the triangle");
		Length = s3.nextInt();
		Areaofrectangle = (Length * Width);
		System.out.println("Area of the triangle is" + Areaofrectangle);

		
		
		int side = 0, areaofsqure;
		Scanner s4 = new Scanner(System.in);
		System.out.println("enter value squre of side");
		side = s4.nextInt();
		areaofsqure = side * side;
		System.out.println("area of the squre" + areaofsqure);

		double a = 0, b = 0, h = 0,areaofTrapezium;
		Scanner s5 = new Scanner(System.in);
		System.out.println("enter value squre of a");
		a = s5.nextInt();
		System.out.println("enter value squre of b");
		b = s5.nextInt();
		System.out.println("enter value squre of h");
		h = s5.nextInt();
		areaofTrapezium = ((0.5)*(a + b) * h);
		System.out.println("area of the squre" + areaofTrapezium);

	}

}
