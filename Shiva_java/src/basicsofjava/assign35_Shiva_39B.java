package basicsofjava;
// Write a program for method overriding 
class parent1 {

	void add(int a) {

		System.out.println(a);
	}

	void add(double b) {

		System.out.println(b);
	}
}

public class assign35_Shiva_39B extends parent1 {

	void add(double c) {

	System.out.println(c);
	}

	 void add(int d) {
	 super.add(1.256);
	 super.add(100);
	 System.out.println(d);

	}

	public static void main(String[] args) {

		assign35_Shiva_39B a1 = new assign35_Shiva_39B();
		a1.add(12.25);
		a1.add(45);
		
		
		

	}

}
