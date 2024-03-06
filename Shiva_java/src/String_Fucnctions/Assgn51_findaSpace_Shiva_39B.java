package String_Fucnctions;

public class Assgn51_findaSpace_Shiva_39B {

	public static void main(String[] args) {
		String name = "shiva kumar";
		char c1[] = name.toCharArray();

		for (int i = 0; i < name.length(); i++) {
			boolean answer = Character.isSpaceChar(c1[i]);
			// System.out.println(answer);
			if (answer == true) {

				System.out.println("There is space in given String");
			}

		}

	}

}
