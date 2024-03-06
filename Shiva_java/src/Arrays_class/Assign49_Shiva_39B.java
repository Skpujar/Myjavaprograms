package Arrays_class;

import java.util.Arrays;

// find the out the alphabets and numaric and spaces and special charecters.
public class Assign49_Shiva_39B {

	public static void main(String[] args) {
		int count_of_Alphabets=0;
		int count_of_numaric=0;
		int count_of_spaces=0;
		int count_of_special_charecter=0;
		
		String Name= "shiva kumar12 @&^#";
		char n1[]=Name.toCharArray();		
		System.out.println(Arrays.toString(n1));
		
		for (int i=0; i<Name.length(); i++) {
		boolean answer= Character.isAlphabetic(n1[i]);
		boolean answer1=Character.isDigit(n1[i]);
		boolean answer2= Character.isSpaceChar(n1[i]);
		
		if (answer== true) {			
			count_of_Alphabets++;
		}
		 if (answer1==true) {
			 
			 count_of_numaric++;
		 }
		if (answer2==true) {
			
			count_of_spaces++;
		}
		
		}	
		
		System.out.println("Count of alphabits--->"+" "+ count_of_Alphabets);
		System.out.println("Count of numaric--->"+" "+ count_of_numaric);
		System.out.println("Count of spaces--->"+" "+ count_of_spaces);
		
		count_of_special_charecter	=Name.length()-((count_of_Alphabets)+(count_of_numaric)+(count_of_spaces));
		
		System.out.println("Count of special_charecter--->"+" "+ count_of_special_charecter);
		
	}

}
