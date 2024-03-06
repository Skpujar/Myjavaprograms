package basicsofjava;
// Write a program to check if gender equals to male or female.If it is male and check if age is greater than 18 or not.if it is greater than 18 then the person is eligible to vote otherwise not eligible to vote.If it is female and check if age is greater than 18 or not.If the age is greater than 18 then the person is eligible to vote otherwise not eligible to vote 
public class Assignment16 {

	public static void main(String[] args) {

		String Gender = "female";
		int age = 25;

		if ((Gender=="female")||((Gender=="male")))

		{
			if (age >=18) {

				System.out.println("person eligible to vote");
			} else {

				System.out.println("person not eligible to vote");
			}
			
		} 
		
		else 
		{

			System.out.println("Not a male or female");
		}
	}

}
