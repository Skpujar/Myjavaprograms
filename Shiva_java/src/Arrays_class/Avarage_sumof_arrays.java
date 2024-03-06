package Arrays_class;

public class Avarage_sumof_arrays {

	public static void main(String[] args) {
		int Array[] = new int[6];

		Array[0] = 50;
		Array[1] = 12;
		Array[2] = 45;
		Array[3] = 26;
		Array[4] = 15;
		Array[5] = 18;

		int sum = 0;

		for (int i = 0; i < Array.length; i++) {

			sum = sum + Array[i];
		}

		System.out.println(sum);

		double avarage = sum + Array.length;

		System.out.println(avarage);

	}

}
