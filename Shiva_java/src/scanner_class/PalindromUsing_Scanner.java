package scanner_class;
// write a program to check whether the given string is palindrome or not
import java.util.Scanner;

public class PalindromUsing_Scanner {

	public static void main(String[] args) {
		String reverse="";
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter the String/number");
		String original  =s1.nextLine();
		for ( int i=original.length()-1; i>=0; i--) 
			
		reverse=reverse+original.charAt(i);
		System.out.println(reverse);
		
	     boolean answer=original.equals(reverse);
		
			if (answer==true) {
				
				System.out.println("entered String is Palindrom");		
			}
			else { 
				
				System.out.println("entered String is not Palindrom");
			}
	
	}
	
}
