package HomeWork;

public class RecursionEg {
	static int c = 0;
	static void rec() {
		c++;
		if(c<=5) {
			System.out.println(c);
			rec();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rec();

	}

}
