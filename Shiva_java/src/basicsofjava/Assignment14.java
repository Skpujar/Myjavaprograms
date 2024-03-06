package basicsofjava;

// Write a program for NOT with AND and NOT with OR operator
public class Assignment14 {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int c = 30;

		if (!(a<b)&&(c>b)) {

			System.out.println("if true print 'NOT  with AND' ");

			if(!(a<b)||(c<b)) {

				System.out.println("if true print ' NOT with OR'");
			}
	}
			else {

				System.out.println("print if both statement false");
			}

		}

	}


