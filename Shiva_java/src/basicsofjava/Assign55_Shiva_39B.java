package basicsofjava;
// Print the numbers from 1 to 1000, if the number is divisible by 3 print sun and if number is divisible by 5 then print moon,and again if the both numbers divisible (3&5) print sun and moon 
public class Assign55_Shiva_39B {

	public static void main(String[] args) {

		for (int i = 1; i <= 1000; i++) {

			//System.out.println("Number from 1 to 1000,"+ " " + i );

			if (i % 3 == 0) {

			//System.out.println("3 divisible num---->"+ " "+ "sun" + " " + i);
			}

			if (i % 5 == 0) {

			//System.out.println("5 divisble num---->"+" " + "moon" + " "+ i);
			}
	
		   if ((i % 3 == 0) != (i % 5 == 0)) {

			 System.out.println("3 divisble num---> " + "  " + "sun" + "  " + i + "  " + "5 divisble num---> " + "  "
						+ "moon" + "  " + i);

			}
		}

	}

}
