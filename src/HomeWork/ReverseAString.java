package HomeWork;
import java.util.*;  

public class ReverseAString {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str;
		str=sc.nextLine();
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
	}

}
