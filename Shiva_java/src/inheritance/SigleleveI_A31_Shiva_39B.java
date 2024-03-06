package inheritance;
// Write a program for single level inheritance
class parent {

	void mul() {

		System.out.println("parent class");
	}
}

public class SigleleveI_A31_Shiva_39B extends parent {

	void add() {

		System.out.println("child class");
	}

	void sub() {

		System.out.println("child class2");
	}

	public static void main(String[] args) {

		SigleleveI_A31_Shiva_39B s1 = new SigleleveI_A31_Shiva_39B();
		s1.add();
		s1.mul();
		s1.sub();
	}

}
