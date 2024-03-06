package Arrays_class;

public class Homework2_Arrays {

	public static void main(String[] args) {

		String name = "shiva123";

		char c1[] = name.toCharArray();

		for (int i = 0; i <= name.length() - 1; i++) {

			boolean answer = Character.isDigit(c1[i]); // .
			
			if(answer==false) {
				
				System.out.println("Index position "+i +" " + "is" +" "+ "Alphabetic");
			}
			else
			{
				
				System.out.println("Index position"+ i +"  " + "is" +" "+ "numaric");
			}
			
			System.out.println(answer);

		}

	}

}
