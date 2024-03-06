package basicsofjava;
// Swap the 2 numbers without extra variable 
public class Assgn54_Shiva39B_Swap_Num_withoutvariable {

	public static void main(String[] args) {
	
		int a= 15;
		int b= 60;
		
		System.out.println("Before swap a value "+" "+ a);
		System.out.println("Before swap b value "+ " "+ b);
		
		a= a+b;
		b= a-b;
		a= a-b;
		
		
		System.out.println("after swap a value " + " " + a);
		System.out.println("after swap b value "  + " "+ b);
	}

}
