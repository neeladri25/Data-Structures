package HomeWork;
import java.util.*;

public class SumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,a[],b[],result[],i;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of elements in an array: ");
		n = s.nextInt();
		a = new int[n];
		b = new int[n];
		
		System.out.println("Enter "+n+" numbers 1st array");
		for(i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		
		System.out.println("Enter "+n+" numbers 2nd array");
		for(i=0;i<n;i++) {
			b[i]=s.nextInt();
		}
		System.out.println();
	    System.out.println("---------------------");
	    result = new int[n];
	    for(i=0;i<n;i++) {
	    	result[i]=a[i]+b[i];
	    }
	    for(i=0;i<result.length;i++) {
            System.out.print(result[i]+"\t");
        }
	}

}
