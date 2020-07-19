package HackerRankPracticeJava;

import java.util.Scanner;

public class A_Palindrom {
	
	static boolean test(String A) {
	     int i = 0;
	     int j = A.length() - 1;
	     
	     while(i<j) {
	    	 if(A.charAt(i) != A.charAt(j)) {
	    		return false;
	    	 }
	    	 i++;
	    	 j--;
	    }	    		    	 
 		return true;	    
	}
//-------------------------------------------
	static boolean test2(String A) {
		 boolean valid = true;
		 int j = A.length() - 1;
	     for(int i = 0; i < (A.length() / 2); i++) {
	         if(A.charAt(i) != A.charAt(j - i)) {
	             valid = false;
	             return false;
	         } // end if
	     } // end for(i)
		return valid; 
	}
//-------------------------------------------


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    String A=sc.next();
	    if(test(A)) {
	    	System.out.println("Yes");
	    }else {
	    	System.out.println("No");
	    }
//-------------------------------------------
	    if(test2(A)) {
	    	System.out.println("Yes");
	    }else {
	    	System.out.println("No");
	    }
	    
	    
		

	}

}
