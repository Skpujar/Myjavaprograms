package Interface_program;

interface one1 {
	int a=10;
	int b=15;
	void add();
	void sub();
}
public class secondprogram implements one1 {

	void mul() {
		
		System.out.println(a*b+"mul");
	}
	void div(){
		System.out.println(a/b +"div" );	
	}
	
	public static void main(String[] args) {
		secondprogram s1= new secondprogram();
		s1.add();
		s1.sub();
		s1.mul();
		s1.div();
		
	}
	public void add() {
		
		
		System.out.println(a+b+ "add");
		
	}
	
	public void sub() {
		
		System.out.println(a-b+ "sub");
	}
}
