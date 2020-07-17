package HomeWork;
import java.util.*;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a[],n,i,j,t;
		System.out.print("Enter number of terms: ");
		n = sc.nextInt();
		a = new int[n];
		System.out.println("Enter numbers: ");
		for(i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		int size = a.length;
		for(i=0;i<size;i++) {
			int min = i;
			for(j=i+1;j<size;j++) {
				if(a[j]<a[min])
					min = j;
			}
			t = a[min];
			a[min] = a[i];
			a[i] = t;
			System.out.println(a[i]+" ");
		}
		
	}

}
