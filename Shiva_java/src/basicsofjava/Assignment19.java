package basicsofjava;

// write a program for constructor overloading using 10 constructors

public class Assignment19 {

	Assignment19() {

		System.out.println("Constructor without arrguments");
	}

	Assignment19(int a) {

		System.out.println(15);
	}

	Assignment19(char S) {

		System.out.println("Print char value to S");
	}

	Assignment19(long d) {

		System.out.println(12.26);
	}

	public static void main(String[] args) {
		new Assignment19();
		new Assignment19(15);
		new Assignment19('S');

	}

}
