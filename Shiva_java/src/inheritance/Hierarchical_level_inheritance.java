package inheritance;
// Write a program for Hierarchical level inheritance with 2 child classes by creating different class
class P1 {

	void add() {

		int a = 12;
		int b = 15;
		int sum = a + b;
		System.out.println(sum);
	}
}

class child1 extends P1 {

	void sub() {

		int a = 102;
		int b = 100;
		int sub = a - b;
		System.out.println(sub);
	}
}

class child2 extends P1 {
	void div() {

		int a = 12;
		int b = 15;
		int div = a / b;
		System.out.println(div);
	}
}

class child3 extends P1 {

	void mul() {

		int a = 12;
		int b = 15;
		int mul = a * b;
		System.out.println(mul);

	}
}

public class Hierarchical_level_inheritance {

	public static void main(String[] args) {
		child1 c1 = new child1();
		c1.add();
		c1.sub();
		child2 c2 = new child2();
		c2.add();
		c2.div();
		child3 c3 = new child3();
		c3.add();
		c3.mul();
	}
}
