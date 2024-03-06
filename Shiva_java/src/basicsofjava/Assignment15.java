package basicsofjava;

//How to call non-static method inside a main method

public class Assignment15 {

	public void add() {
		int a = 100;
		int b = 200;
		System.out.println(a + b);
	}

	public void String() {

		System.out.println("non void String method");
	}

	public static void main(String[] args)

	{
		Assignment15 a1 = new Assignment15();
		a1.add();
		a1.String();
			

	}

}
