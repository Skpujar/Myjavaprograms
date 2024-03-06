package String_Fucnctions;

public class Second_Reverse_String_Assign41_Shiva_39B {

	public static void main(String[] args) {
		String name = "pajju";
		String reverse = "";
		for (int i = 0; i < name.length(); i++) {

			char a1 = name.charAt(i);
			reverse = a1+reverse;
		}
		System.out.println(reverse);
		

		boolean b1 = name.equals(reverse);
		// System.out.println(b1);

		if (b1 == true) {

			System.out.println("The given string is palindrom");
		} else {

			System.out.println("The given string is not palindrom");
		}
	}

}
