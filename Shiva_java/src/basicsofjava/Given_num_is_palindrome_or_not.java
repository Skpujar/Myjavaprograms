package basicsofjava;

import java.util.Scanner;

public class Given_num_is_palindrome_or_not {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int num=sc.nextInt();
		
		int Original_num=num;
	
		int rev=0;

		while (num != 0) {

			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		
		System.out.println(rev);

		if (Original_num == rev) {

			System.out.println(Original_num+ "given number is palindrome");
		} 
		else 
		{
			System.out.println(Original_num+ "given not number is palindrome");
		}

	}

}
