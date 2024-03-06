package Arrays_class;
// Create an array with double and Boolean data types?
import java.util.Arrays;

public class Assign43_Shiva_39B {

	public static void main(String[] args) {
		double hike[]=new double [4];
		
		hike[0]=5000;
		hike[1]=7000;
		hike[2]=15000;
		hike[3]=12000;
		
		
		for(int i=0; i>=3; i++) {
			
         System.out.println(hike[i]);
		}
		Arrays.sort(hike);
		System.out.println("Hike value "+" " + Arrays.toString(hike));
		
		boolean major[]= new boolean[2];
		
		major[0]= false;
		major[1]=true;
		
		System.out.println("boolean result"+" " + Arrays.toString(major));
		
	}

}
