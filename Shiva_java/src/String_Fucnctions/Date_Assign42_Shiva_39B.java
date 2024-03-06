package String_Fucnctions;
// write a program to get 10 days before the current time and 10 days after the current time using Date Class?
import java.util.Date;

public class Date_Assign42_Shiva_39B {

	public static void main(String[] args) {

		Date d0 = new Date();
		long t1 = d0.getTime();
		
		System.out.println(t1);
		Date d1 = new Date(d0.getTime());
		
		System.out.println("preset time---> "+" "+ d1);
		
		Date d2 = new Date(d1.getTime()+(1000*60*60*24*10));
		//System.out.println(d2);
		String time1=d2.toString();
		String future=time1.substring(11, 20);
		System.out.println("10 days after time--->"+ " "+ future);
		
		Date d3 = new Date(d1.getTime()-(1000*60*60*24*10));
		//System.out.println(d3);
		String time2=d3.toString();
		String past= time2.substring(11, 20);
		System.out.println("10 days before time--->"+ " "+ past);
		
		

		
		
		
		
			
		
		
		
	}

}
