package basicsofjava;
// Write a programm to execute Nested if block
public class Assginment11 {

	public static void main(String[] args) {
		String gender = "Male";
		// String gender1 = "Female";

		int age = 18;

		if (age >= 18) {

			System.out.println("eligible  to vote");

			if (gender != "Female")

			{

				System.out.println("only male can vote");
			}

			else

			{

				System.out.println("female can vote");
			}

		}

		else

		{

			System.out.println("Not eligible  to vote");
		}

	}
}
