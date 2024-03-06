package String_Fucnctions;

public class Reverse_String {

	public static void main(String[] args)
	{
		String name ="shivakumar";
		String reverse="";
		for (int i=name.length()-1; i>=0; i--) 
		{
		  char	answer =name.charAt(i);		   	
		  reverse=reverse+answer;		  			
		}
		
		System.out.println( reverse);
		boolean sc=name.equals(reverse);
		
		if (sc==true) {
			
			System.out.println("Given string is palindrom");
		}
		else {
			
			System.out.println("Given string is not palindrom");
		}
		
	}

}
