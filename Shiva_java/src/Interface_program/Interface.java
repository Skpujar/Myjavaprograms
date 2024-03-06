package Interface_program;

interface one {

	void add();

	void sub();
}

abstract class shiva implements one {

	abstract void mul();

	abstract void substraction();

	static void areaofcircle() {
		System.out.println(1);
	}

	void areaoftriangle() {
		System.out.println(2);
	}
}

abstract class kumar extends shiva {

	abstract void spk();

	abstract void poojar();
}

public class Interface extends kumar {

	static void div() {
		System.out.println(3);
	}

	static void modulus() {
		System.out.println(4);
	}

	public static void main(String[] args) {
		div();
		modulus();
		Interface f1= new Interface();
		f1.areaoftriangle();
		f1.add();
		f1.poojar();
		f1.spk();
		areaofcircle();
		f1.substraction();
		f1.sub();
		f1.mul();
	}

	public void add() {

	}

	public void sub() {

	}

	void spk() {

	}

	void poojar() {

	}

	void mul() {

	}

	void substraction() {

	}

}
