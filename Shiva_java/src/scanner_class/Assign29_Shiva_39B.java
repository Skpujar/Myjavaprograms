package scanner_class;

import java.util.Scanner;

// create 5 methods for addition , subtraction , multiplication ,division
// modulus using 5 scanner class with local  variables

public class Assign29_Shiva_39B {

	static void add() {
		Scanner s1 = new Scanner(System.in);
		int a = s1.nextInt();
		int b = s1.nextInt();
		int c = a + b;
		System.out.println("addtion" + c);
	}

	static void sub() {
		Scanner s2 = new Scanner(System.in);
		int a = s2.nextInt();
		int b = s2.nextInt();
		int c = a - b;
		System.out.println("subtraction" + c);
	}

	static void mul() {
		Scanner s3 = new Scanner(System.in);
		int a = s3.nextInt();
		int b = s3.nextInt();
		int c = a * b;
		System.out.println("multiplication" + c);
	}

	static void div() {
		Scanner s4 = new Scanner(System.in);
		int a = s4.nextInt();
		int b = s4.nextInt();
		int c = a / b;
		System.out.println("division" + c);
	}

	static void modulus() {
		Scanner s5 = new Scanner(System.in);
		int a = s5.nextInt();
		int b = s5.nextInt();
		int c = a % b;
		System.out.println("modulus" + c);

	}

	public static void main(String[] args) {
		add();
		sub();
		mul();
		div();
		modulus();

	}

}
