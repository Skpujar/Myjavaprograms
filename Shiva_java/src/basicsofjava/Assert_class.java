package basicsofjava;

public class Assert_class {
	
	public static void main(String[] args) throws AssertionError {

		String name="shivakumar";
		
		assert name.length() > 15;
		
		for ( int i=0; i<name.length(); i++ ) { 
			
			System.out.println(name.concat("poojar"));
		}

	}

}
