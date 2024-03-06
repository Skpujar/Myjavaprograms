package basicsofjava;
//write a program using abstract class,abstract method ,concrete class and concrete method?

abstract class abst // parent class , abstrct class
{
	abstract void add();

	abstract void sub(); // it may have concrete methods static or non-static
}

abstract class abst2 {

	abstract void modulus();
}

public class Assign37_Shiva_39B extends abst2 { // child class , concrete class

	static void mul() {

		System.out.println("multiplication of 2 numbers ");

	}

	void div() {

		System.out.println("division of 2 numbers");

	}

	public static void main(String[] args) {
		Assign37_Shiva_39B a1 = new Assign37_Shiva_39B();
		a1.add();
		a1.sub();
		a1.div();
		mul();
		a1.modulus();

	}

	void add() {
		System.out.println("abstrct add method");

	}

	void sub() {

		System.out.println("abstrct sub method");
	}

	void modulus() {
		System.out.println("2nd abstrct modulus  method");
	}

}
