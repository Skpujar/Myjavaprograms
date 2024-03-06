package scanner_class;
// create 5 methods for addition , subtraction , multiplication ,divison , modulus using scanner class with global variable
import java.util.Scanner;

public class Assign27_Shiva_39B {
	static int a;
	static int b;

	static void add() {
		System.out.println(a + b);
	}

	static void sub() {
		System.out.println(a - b);
	}

	static void mul() {
		System.out.println(a * b);
	}

	static void div() {
		System.out.println(a / b);
	}

	static void moduls() {
		System.out.println(a % b);
	}

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the value of a");
		a = s1.nextInt();
		System.out.println("Enter the value of b");
		b = s1.nextInt();
		add();
		sub();
		mul();
		div();
		moduls();
	}

}
