package basicsofjava;
// Write a program for Declaration and Intilization for Local and Global Variables
public class Assgn23_LVD_Shiva_39B {

	static void add()

	{
		int a = 10;
		int b = 20;
		int sum = a + b;
		System.out.println(sum);
	}

	static void sub()

	{
		int a = 10;
		int b = 20;
		int sub = a - b;
		System.out.println(sub);
	}

	static void mul()

	{
		int a = 10;
		int b = 20;
		int mul = a * b;
		System.out.println(mul);
	}

	void div()

	{
		int a = 10;
		int b = 20;
		int div = a / b;
		System.out.println(div);
	}

	void modulus()

	{
		int a = 10;
		int b = 20;
		int modulus = a % b;
		System.out.println(modulus);
	}

	public static void main(String[] args) {

		add();
		mul();
		Assgn23_LVD_Shiva_39B d1 = new Assgn23_LVD_Shiva_39B();
		d1.div();
		sub();
		d1.modulus();

	}

}
