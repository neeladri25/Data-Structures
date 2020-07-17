package HomeWork;
import java.util.*;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of elements in array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i<n;i++)
		{
			System.out.println("Enter the "+(i+1)+" element: ");
			arr[i] = sc.nextInt();
		} // Array completely entered
		System.out.println("Enter the number to be searched in the array: ");
		int x = sc.nextInt();
		int l = 0; //Leftmost Index
		int r = n-1;//RightMost Index
		while(l<=r)
		{
			int mid = (l+r)/2; //Index of middle element
			if(arr[mid]==x)
			{
				System.out.println("Value found at index "+mid);
				return;
			}
			else if(x<arr[mid])
			{
				r=mid-1;
			}
			else {
				l = mid+1;
			}
		}
		System.out.println("Value not Found");	
	}
}
