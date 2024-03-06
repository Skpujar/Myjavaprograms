package basicsofjava;

// Write a program using for loop that starts from 1 to 10 and find out its average?

public class Assign28_Shiva_39B {

	public static void main(String[] args) {
		int sum=0;
		
		for (int i = 1; i <= 10; i++) {

			sum = sum + i;

		}
		
		System.out.println(sum);
		
		double Average = sum / 10 ;
		System.out.println(Average);
	}

}
