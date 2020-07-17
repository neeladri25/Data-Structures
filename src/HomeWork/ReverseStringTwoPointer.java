package HomeWork;
import java.util.*;

public class ReverseStringTwoPointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str;
		str=s.nextLine();
		char ch[]=str.toCharArray();
		int l=0;
		int r=ch.length-1;
		while(l<r) {
			char temp=ch[l];
			ch[l]=ch[r];
			ch[r]=temp;
			l++;
			r--;
		}
		String rev = new String(ch);
		System.out.println(rev);
		if(rev.equals(str)) {
			System.out.println("Palindrome");
		}
		else
			System.out.println("Not Palindrome");
	}

}
