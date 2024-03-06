package String_Fucnctions;
// Write a program to replace surname to some other name using String functions.
public class Assign38_Shiva_39B {

	public static void main(String[] args) {

		String name = "shivakumar poojara";
		String s1 = name.replaceAll(name, "shivakumar heggade");
		System.out.println(s1);

		String name1 = "jack";
		String s2 = name1.replace('a', 'o');
		System.out.println(s2);

		String name2 = "word no 1";
		System.out.println(name2.replaceAll("[0-9]", ""));
		System.out.println(name2.replaceAll("[a-z]", ""));

		boolean a1 = name.isEmpty();
		System.out.println(a1);

		String name3 = "shiva";
		String name4 = "shiva";
		System.out.println(name3.equals(name4));

	}

}
