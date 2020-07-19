package HackerRankPracticeJava;

import java.util.Scanner;
import java.util.regex.Pattern;

public class B_Regex {
	
	static void testing() {
		Scanner in = new Scanner(System.in);
	    int testCases = Integer.parseInt(in.nextLine());
	   // int testCases = in.nextInt();  // Not working	    
	      while(testCases>0){
	         String pattern = in.nextLine();
	          try{
	              Pattern p = Pattern.compile(pattern);
	              System.out.println("Valid");
	          }catch(Throwable t){
	              System.out.println("Invalid");
	          }
	          testCases--;
	      }
	      in.close();
	}
//==============================================
	public static void main(String[] args) {
		testing();
	}
}
//  3
//    ([A-Z])(.+)
//   [AZ[a-z](a-z)
//   batcatpat(nat