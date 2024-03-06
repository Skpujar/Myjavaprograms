package Arrays_class;
// In  a string "mango123" check which character is numeric and which is alpha 
import java.util.Arrays;

public class Assign47_Shiva_39B {

	public static void main(String[] args) {
		String name = "mango123";

		char c1[] = name.toCharArray();

		Arrays.sort(c1);

		System.out.println(Arrays.toString(c1));
		for (int i = 0; i < name.length(); i++) {

			boolean answer = Character.isAlphabetic(c1[i]);

			// System.out.println(answer);
			
			if (answer==true) {
				
				System.out.println("Index position "+i +" " + "is" +" "+ "Alphabetic");
			}else {
				
				System.out.println("Index position "+i +" " + "is" +" "+ "numaric");
			}
		}
	}

}
