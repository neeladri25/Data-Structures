package HomeWork;
import java.util.*;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a[],n,i,j,t;
		System.out.println("Enter number of terms: ");
		n = s.nextInt();
		a = new int[n];
		t = 0;
		System.out.println("Enter numbers of array");
		for(i=0;i<n;i++)
		{
			a[i] = s.nextInt();
		}
		for(i=0;i<n;i++) {
			for(j=1;j<(n-i);j++) {
				if(a[j-1]>a[j]) 
				{
					t = a[j-1];
					a[j-1]=a[j];
					a[j]=t;
				}
			}
			System.out.println(a[i]+" ");
		}

	}

}
