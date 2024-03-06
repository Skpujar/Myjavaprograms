package basicsofjava;

//write a program using this keyword to assign the value of a LV(local variable) to GV(global variable)
public class Assign36_Shiva_39B {
    int a;
    float b;
    String c;
    
     void add(int a, float b, String c) 
    {
    	this.a=a;
    	this.b=b;
    	this.c=c;
    }
    
    
	public static void main(String[] args) {
		
		Assign36_Shiva_39B a1= new Assign36_Shiva_39B();
		a1.add(200,500,"Shiva");
		System.out.println(a1.a);
		System.out.println(a1.b);
		System.out.println(a1.c);

	}

}
