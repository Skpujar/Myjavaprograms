package String_Fucnctions;

public class Frist_program {

	public static void main(String[] args) {

		String name = "shivakumar poojara";
		String name2="usha";
		
		 String name3= "JAIindia123";
		
		int s1 = name.length();
		System.out.println(s1);
		
		String s2 = name.toUpperCase();
		System.out.println(s2);
		
		String s3 = name.toLowerCase();
		System.out.println(s3);
		
		char s4 = name.charAt(0);
		System.out.println(s4);
		
		String s5 = name.trim();
		System.out.println(s5);
		
		String space=" ";
		String s6=name.concat(space).concat(name2);
	    System.out.println(s6);	
	    
	    boolean s7= name.endsWith("r");
	    System.out.println(s7);
	    
	    String s8=name2.replaceAll(name2, "usha c");
	    System.out.println(s8);
	    
	    
	    String s9=   name3.replaceAll("[0-9]", "");
	    System.out.println(s9);
	    
	   System.out.println( name3.replaceAll("[A-Z]", ""));
	   
	   System.out.println(name3.replaceAll("[a-z]", ""));
	   
	    boolean a1= name.isEmpty();
	    
	    System.out.println(a1);

	    boolean a2=name.equals(name2);
	    System.out.println(a2);
	    
	   boolean a3= name2.matches("u..."); // Signle charecter search
	   System.out.println(a3);
	   
	  boolean a4= name.matches("s(.*)a"); // multi charecter search
	  
	  System.out.println(a4);
	    
	}

}
