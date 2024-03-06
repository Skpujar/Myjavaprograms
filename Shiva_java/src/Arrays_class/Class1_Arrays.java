package Arrays_class;

import java.util.Arrays;

public class Class1_Arrays {

	public static void main(String[] args) {
		int age[] = new int[4];

		age[0] = 50;
		age[1] = 60;
		age[2] = 12;
		age[3] = 150;

		Arrays.sort(age);
		System.out.println(Arrays.toString(age));

		/*
		 * for (int i = 0; i <= 3; i++) {
		 * 
		 * System.out.println(age[i]);
		 * 
		 * }
		 */

	}

}
