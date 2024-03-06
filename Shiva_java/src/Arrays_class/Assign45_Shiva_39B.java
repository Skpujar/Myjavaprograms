package Arrays_class;

import java.util.Arrays;
import java.util.Scanner;

public class Assign45_Shiva_39B {

	public static void main(String[] args) {

		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the size of an array");
		int size = s1.nextInt();
		int a1[] = new int[size];

		for (int i = 0; i < size; i++) 
		{
			System.out.println("enter the value  of an array");
			a1[i] = s1.nextInt();

		}

		Arrays.sort(a1);
		System.out.println(Arrays.toString(a1));

	}

}
