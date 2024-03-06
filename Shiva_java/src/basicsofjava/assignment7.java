package basicsofjava;
// Create a class and write 5 static methods each for addition, subtration, multiplication, devision and modules, call it in the main method
public class assignment7 
{

	static void add()	
	{
		int a=20;
		int b=15;
		
		System.out.println(a+b);
	}
	
	static void sub()	
	{
		int a=20;
		int b=15;
		System.out.println(a-b);
	}
	
	static void mul() 	
	{
		int a=20;
		int b=15;
		System.out.println(a*b);
	}
	
	static void div() 	
	{
		int a=20;
		int b=15;
		
		System.out.println(a/b);
	}
	
	static void modulus() 	
	{
		int a=20;
		int b=15;
		System.out.println(a%b);
	}
		
	public static void main(String[] args) 
	
	
	{

		add();
		sub();
		mul();
		div();
		modulus();		

	}

}
