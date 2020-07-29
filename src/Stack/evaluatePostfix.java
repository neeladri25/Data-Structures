package Stack;

import java.util.*;

public class evaluatePostfix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		Stack<Integer> st = new Stack<>();
		for(int i=0;i<s.length();i++) {
			
			char c = s.charAt(i);
			if(Character.isDigit(c)) {
				st.push(c-'0');	
			}
			else {
				int left = st.pop();
				int right = st.pop();
			
				switch(c) {
				case '+':
					st.push(left+right);
					break;
					
				case '-':
					st.push(left-right);
					break;
					
				case '*':
					st.push(left*right);
					break;
					
				case '/':
					st.push(left/right);
					break;
				}
			}
		}
		System.out.println(st.pop());

	}

}
