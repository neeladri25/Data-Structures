package HomeWork;
import java.util.*;

public class EvenOddPrime {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.print("Enter number: ");
		a = sc.nextInt();
		evenodd(a);
		prime(a);
	}
	
	public static void evenodd(int n) {
		if(n%2==0)
			System.out.println("Even");
		else 
			System.out.println("Odd");
	}
	
	public static void prime(int n) {
		int i;
		if(n<=1)
			System.out.println("Not Prime");
		if(n==2)
			System.out.println("Prime");
		else {
			for(i=2;i<=Math.sqrt(n);i++) {
				if(n%i==0)
					System.out.println("Not Prime");
				else
					System.out.println("Prime");
			}
		}
	}

}
