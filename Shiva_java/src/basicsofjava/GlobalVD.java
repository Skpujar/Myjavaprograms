package basicsofjava;

public class GlobalVD {
	static int a = 20;
	static int b = 200;

	static void add()

	{
		System.out.println(a + b);
	}

	static void sub()

	{
		System.out.println(a - b);
	}

	void div() {

		System.out.println(a / b);
	}

	void mul() {

		System.out.println(a * b);
	}

	void modulus() {

		System.out.println(a % b);
	}

	public static void main(String[] args) {
		add();
		sub();

		GlobalVD g1 = new GlobalVD();
		g1.div();

		g1.mul();
		g1.modulus();
	}

}
