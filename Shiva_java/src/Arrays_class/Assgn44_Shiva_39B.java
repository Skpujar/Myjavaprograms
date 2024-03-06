package Arrays_class;
// Create an array of length 3 of int data type and add its value at the runtime
import java.util.Arrays;

import java.util.Scanner;

public class Assgn44_Shiva_39B {

	public static void main(String[] args) {

		int rollnum[] = new int[3];
		Scanner s1 = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.println("Enter the value of array");
			rollnum[i] = s1.nextInt();

		}
		Arrays.sort(rollnum);
		System.out.println(Arrays.toString(rollnum));

	}

}
