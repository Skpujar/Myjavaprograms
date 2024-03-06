package basicsofjava;

//Write a program with 2 Static method,2 Non-Static method,and one Constructor

public class Assignment17 {

	Assignment17() {  

		System.out.println("print constructor");
	}

	static void method1() {

		System.out.println("print Static method1");
	}

	static void method2() {

		System.out.println("print Static method2");

	}

	public void number0() {
		int a = 100;
		int b = 200;

		System.out.println(a+b);
	}

	 public void number1(String a) {

		System.out.print("non-static method");
	}

	public static void main(String[] args) {

		Assignment17 n1 = new Assignment17();
		n1.number1("non-static method");
		n1.number0();	
		method1();
		method2();
		new Assignment17 ();
		

	}

}
