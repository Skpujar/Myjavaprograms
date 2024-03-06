package conditional_Statements;

public class find_4_largest_num {

	public static void main(String[] args) {

		int a = 15, b = 50, c = 100, d = 450;

		if ((a > b) && (a > c) && (a > d)) 
			
		{

			System.out.println("A is the largest"+a);
		} 
		
		else if ((b > a) && (b > c) && (b > d)) 
			
		{

			System.out.println("A is the largest"+b);
		} 
		else if ((c > a) && (c > b) && (c > d)) 
			
		{

			System.out.println("C is the largest"+ c);
		} 
		
		else 
			
		{

			System.out.println("D is the largest"+ " "+ d);
		}
	}

}
