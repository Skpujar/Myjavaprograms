package basicsofjava;

public class Methodoverloadding {

	static void add() {
		int a = 10;
		int b = 20;
		System.out.println(a + b);

	}

	static void add(int b, double a) {

		int b1 = 50;
		double a1 = 1.26;
		double c = a1 + b1;
		System.out.println(c);
	}

	void add(int d, String e) {

		System.out.println(15+"Shiva");
	}

	public static void main(String[] args) {
		add();
		add(50,1.26);
		Methodoverloadding m1= new Methodoverloadding();
		m1.add(500, "shiva");
	
	}

}
