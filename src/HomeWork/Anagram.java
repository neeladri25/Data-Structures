package HomeWork;
import java.util.*;

public class Anagram {
	static boolean Anagramscheck(String s1, String s2) {
		if(s1.length()!=s2.length()) return false;
		int i;
		int arr1[]=new int[26];
		int arr2[]=new int[26];
		for(i=0;i<s1.length();i++) {
			arr1[s1.charAt(i)-'A']++;
			arr2[s2.charAt(i)-'A']++;
		}
		for(i=0;i<26;i++) {
			if(arr1[i]!=arr2[i])
				return false;
		}
		return true;
	}
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String str,str1;
		System.out.println("Enter first string: ");
		str = s.nextLine();
		System.out.println("Enter second string: ");
		str1 = s.nextLine();
		System.out.println(Anagramscheck(str,str1));
	}
}
