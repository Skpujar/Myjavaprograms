package basicsofjava;

public class simple {
	{

		System.out.println("IIB");
	}

	simple() {

		System.out.println("Constructor");
	}

	public static void main(String[] args) {
		
		System.out.println("Start main method");
		simple s1= new simple();
		System.out.println("end main method");
		
	}

}
