package String_Fucnctions;

import java.util.Date;

public class Date_class {

	public static void main(String[] args) {
		Date d1 = new Date();
		long t1 = d1.getTime();
		System.out.println(t1);
									
		Date d2 = new Date(d1.getTime());
		System.out.println(d2);
	
		
		String a1= d2.toString(); 
		System.out.println(a1);
		
        String month=a1.substring(4, 7); // month  
        System.out.println(month);
        
        String date =a1.substring(8, 10); // date 
        System.out.println(date);
        
        System.out.println(a1.length()); // year
        String year=a1.substring(24, 28);
        System.out.println(year);
      
        String a2=date.concat(" ").concat(month).concat(" ").concat(year);  // dd mm yyyy
        String a3=date.concat("-").concat(month).concat("-").concat(year);  // da-mm-yyyy
        String a4=date.concat("/").concat(month).concat("/").concat(year);  // dd/mm/yyyy
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);

	}

}
