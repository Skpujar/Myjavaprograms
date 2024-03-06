package Arrays_class;

import java.util.Arrays;

// In a string "mango" calculate how many are alpha and how many are numeric

public class Assign_48_Shiva39B {

	public static void main(String[] args) {
		String name = "mango";
		int Length = name.length();
		System.out.println(Length);
		char n1[] = name.toCharArray();
		String s1 = Arrays.toString(n1);
		System.out.println(s1);

		int count_of_alpha = 0;
		int count_of_numaric = 0;

		for (int i = 0; i < name.length(); i++) {
			boolean b1 = Character.isAlphabetic(n1[i]);
			// System.out.println(b1);

			if (b1 == true) {
				count_of_alpha++;
				//System.out.println("Index position " + i + " " + "is" + " " + "Alphabetic");
			} 
			
			else {
				count_of_numaric++;
				//System.out.println("Index position " + i + " " + "is" + " " + "numaric");
			}

		}
		System.out.println("Total number of alphabets in given string"+" "+ count_of_alpha++);
		System.out.println("Total number of numaric in given string"+" "+ count_of_numaric++);
	}

}
