package First;

public class primitiveDT {
	// Java is not purely object oriented because primitive Data type are not objects
	// We can create objects from them using the wrapper class
	public static void main(String args[]) {
		
		int x = 5;
		int y = 10;
		int z = x+y;
		System.out.println(z);
		//x,y - operands
		//+ - operators
		
		byte a = 10;
		int b = a; // implicit type casting or widening
		System.out.println(b);
		
		int c=25;
		byte d =(byte)c;
		System.out.println(d); // explicit type casting or narrowing
		
		float f = 9.9f;
		float g = (float)10.8;
		float h = f+g;
		
		double i = 10.8;
		System.out.println(h);
		System.out.println(i);
	}

}
