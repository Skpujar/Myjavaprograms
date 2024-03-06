package Arrays_class;

import java.util.Arrays;

public class Findspac_numaric_alpha {

	public static void main(String[] args) {
		String name = "shiva kumar 45678";
		int Length = name.length();
		System.out.println(Length);
		char n1[] = name.toCharArray();
		String s1 = Arrays.toString(n1);
		System.out.println(s1);

		int count_of_alpha = 0;
		int count_of_numaric = 0;
		int count_of_space = 0;

		for (int i = 0; i < name.length(); i++) {
			boolean b1 = Character.isAlphabetic(n1[i]);
			boolean b2 = Character.isDigit(n1[i]);
			boolean b3 = Character.isSpaceChar(n1[i]);

			// System.out.println(b1);

			if (b1 == true) {
				count_of_alpha++;
				// System.out.println("Index position " + i + " " + "is" + " " + "Alphabetic");
			}
			if (b2 == true) {
				count_of_numaric++;
				// System.out.println("Index position " + i + " " + "is" + " " + "numaric");
			}

			if (b3 ==true) {
				count_of_space++;
				// System.out.println("Index position " + i + " " + "is" + " " + "space");
			}

		}
		System.out.println("Total number of alphabets in given string" + " " + count_of_alpha);
		System.out.println("Total number of numaric in given string" + " " + count_of_numaric);
		System.out.println("Total number of space in given string" + " " + count_of_space);

	}

}
