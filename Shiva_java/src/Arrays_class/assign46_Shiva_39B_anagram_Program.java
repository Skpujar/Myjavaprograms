package Arrays_class;

//Check any 2 strings are anagram or not 
import java.util.Arrays;

public class assign46_Shiva_39B_anagram_Program {

	public static void main(String[] args) {

		String name = "inch";
		String name1 = "chin";

		char a1[] = name.toCharArray();
		char a2[] = name1.toCharArray();

		Arrays.sort(a1);
		Arrays.sort(a2);

		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(a2));

		boolean answer = Arrays.equals(a1, a2);
		// System.out.println(answer);

		if (name.length() == name1.length()) {

			System.out.println("The Length of 2 String are same");

		}

		else {

			System.out.println("The Length of 2 String are not same");

		}

		if (answer == true) {

			System.out.println("Then given 2 String are anagram of each other");

		} else {

			System.out.println("Then given 2 String are not anagram of each other");

		}

	}

}
