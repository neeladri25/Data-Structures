package HomeWork;
import java.util.*;
public class BinarySearchRec {
	static int BinarySearch(int a[],int l, int r, int n) {
		if(l>r) return -1;
		int mid = (l+r)/2;
		if(a[mid]==n)
			return mid;
		else if(n>a[mid])
			return BinarySearch(a,mid+1,r,n);
		else
			return BinarySearch(a,l,mid-1,n);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int t,n;
		System.out.println("Enter number of terms");
		t=s.nextInt();
		int a[]=new int[t];
		System.out.println("Enter numbers");
		for(int i=0;i<t;i++) {
			a[i]=s.nextInt();
		}
		System.out.println("Number to be searched?");
		n=s.nextInt();
		System.out.println(BinarySearch(a,0,t-1,n));
	}

}
