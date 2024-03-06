package basicsofjava;

// Write a program with 4 Static method and 4 Non-Static method make sure all have same name

public class Assignment18 {

	public static void Print() {

		System.out.println("print static method without arrguments");
	}

	public static void Print(int numbers) {

		int a = 250;
		System.out.println(a);
	}

	public static void Print(String value) {

		System.out.println("Shivakumara");
	}

	public static void Print(double value) {

		double a = 3.1456;
		System.out.println(a);
	}

	public void print() {

		System.out.println("print non-static method without arrguments");
	}

	public void print(int numbers) {
		int a = 500;
		System.out.println(a);
	}

	public void print(String value) {

		System.out.println("poojara");
	}

	public void print(double value) {

		System.out.println("1.256");
	}

	public static void main(String[] args) {

		Print();
		Print(250);
		Print("Shivakumara");
		Print(1.256);

		Assignment18 a1 = new Assignment18();
		a1.print();
		a1.print(500);
		a1.print("kumar");
		a1.print(1.25);

	}
}
