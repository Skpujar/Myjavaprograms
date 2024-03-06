package basicsofjava;

public class Abhishek
{
	Abhishek()
	{
		System.out.println("1");
	}
	Abhishek(int a,int b,int c,double d)
	{
		System.out.println("3");
	}
	Abhishek(String a)
	{
		System.out.println("2");
	}
	public static void main(String[] args) 
	{
		new Abhishek();
		new Abhishek("India");
		new Abhishek(10,30,40,5.54);	
		
	}

}
