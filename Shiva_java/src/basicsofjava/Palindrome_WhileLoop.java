package basicsofjava;

public class Palindrome_WhileLoop {

	public static void main(String[] args) {
		String name = "moom";
		int i = 0, j = name.length() - 1;

		while (i<j) {

			if ((name.charAt(i)) != name.charAt(j)) {

				System.out.println("The given Sting is not a palindrome");
				System.exit(0);

			}
			
			i++;
			j--;

		}

		System.out.println("The given String is palindrome");

	}

}
