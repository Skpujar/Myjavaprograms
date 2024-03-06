package basicsofjava;

public class constructor {
	constructor()

	{
		System.out.println("Hello Constructor");
	}

	constructor(int a, int b) {

		System.out.println("print int value");
	}

	constructor(double value) {

		System.out.println("print double value");

	}

	constructor(String value) {

		System.out.println("print String value");
	}

	constructor(float value) {

		System.out.println("print float value");
	}

	constructor(char value) {

		System.out.println("pring char value");
	}

	constructor(boolean value) {

		System.out.println("pring boolean value");
	}

	public static void main(String[] args) {
		
		new constructor();
		new constructor(1.56);
		new constructor("Shiva");
		new constructor(2.123);
		new constructor('A');
		new constructor(false);
	}

}
