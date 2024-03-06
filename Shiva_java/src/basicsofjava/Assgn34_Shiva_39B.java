package basicsofjava;
// Write a program to call the parent class constructor using super calling statement
class parent {

	parent(int a) {
		System.out.println("parent class Constructor");
	}
}

public class Assgn34_Shiva_39B extends parent {

	Assgn34_Shiva_39B() {
		super(35);
		System.out.println("child class constrctor");

	}
	public static void main(String[] args) {

		new Assgn34_Shiva_39B();

	}

}
