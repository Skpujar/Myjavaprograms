package Arrays_class;

import java.util.Arrays;

//Copy the value of 1 array into another array using iteration
public class Assign50_Shiva_39B {

	public static void main(String[] args) {
		int a1[]=new int [4];
		
		a1[0]=50;
		a1[1]=45;
		a1[2]=35;
		a1[3]=15;
		System.out.println(Arrays.toString(a1));
		
		int Array2[]= new int [a1.length];
		 
		 for(int i=0; i<a1.length; i++){
			 Array2[i]=a1[i];
			 System.out.println(Arrays.toString(Array2));
		 }
		
	}
	
}
