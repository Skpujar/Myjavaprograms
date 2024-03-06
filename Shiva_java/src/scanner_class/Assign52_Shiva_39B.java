package scanner_class;

import java.util.Scanner;

// Find the factorial of numbers

public class Assign52_Shiva_39B {

	public static void main(String[] args) {
		Scanner s1= new Scanner (System.in);
		System.out.println("Enter the factorial num");

			int	fact =s1.nextInt();
		
			int result=1;
			
		for ( int i=1; i<=fact; i++ ) {
			
			result = result *i;
		
		System.out.println(result);
			
		}
	}

}
