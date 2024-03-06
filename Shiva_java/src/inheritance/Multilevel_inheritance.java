package inheritance;
// Write a program for multi level inheritance by creating different class
class kumar extends Gparent {

	static void add() {
		System.out.println("addtion");
	}

	static void sub() {

		System.out.println("sustraction");
	}
}

public class Multilevel_inheritance extends kumar {

	void mul() {

		System.out.println("mul");
	}

	void div() {

		System.out.println("div");
	}

	public static void main(String[] args)

	{
		Multilevel_inheritance m1 = new Multilevel_inheritance();

		m1.mul();
		m1.div();
		add();
		sub();
		m1.modulus();

	}

}

