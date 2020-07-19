package HackerRankPracticeJava;

import java.util.Scanner;

class A_HackerRank{
	public static void testing() {
		 Scanner in = new Scanner(System.in);
	        String S = in.next();
	        
	        int start = in.nextInt();
	        int end = in.nextInt();
	        System.out.println();
	        char[] ch = S.toCharArray();
//	     	if( S.contains("[a-zA-Z]") && S.length() >=1 && S.length() <=100) {

	        for(int i=start; i<end; i++) {	
	        	System.out.print(ch[i]);
	        }
//	     	}
	}
}
public class A_SubString {

	public static void main(String[] args) {
		A_HackerRank.testing();

	}

}
