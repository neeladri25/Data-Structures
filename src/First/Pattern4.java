package First;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,j,k;
		for(i=1;i<=5;i++) {
			for(j=5-i;j>i;j++) {
				System.out.println("");
			}
			for(k=0;k<=i;k++) {
				System.out.println("*");
			}
			System.out.println();
		}

	}

}
