package HackerRankPracticeJava;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
	
	static boolean isAnagram(String A, String B) {	
		if (A.length() != B.length()) { 
	          return false;
	      }
		//Case not sensitive
		boolean value = false;
		char[] arrA = A.toUpperCase().toCharArray();
	       char[] arrB = B.toUpperCase().toCharArray();
	       java.util.Arrays.sort(arrA);
	       java.util.Arrays.sort(arrB);
	       
	       for(int i = 0; i < A.length(); i++) {
	               if((arrA[i]) == (arrB[i])) {
	            	   value = true;
	               }else {
	            	 value = false;
	            	 break;
	               }
	       }
	       return value;
	}

//---------------------------------------------------
	static boolean isAnagram2(String A, String B) {	
		if (A.length() != B.length()) { 
	          return false;
	      }
		 char[] chars = A.toUpperCase().toCharArray();
	     Arrays.sort(chars);
	     String sorted = new String(chars);
	       
	     char[] chars1 = B.toUpperCase().toCharArray();
	     Arrays.sort(chars1);
	     String sorted1 = new String(chars1); 

	    if (sorted.equalsIgnoreCase(sorted1)) {
	           return true;
	       } else {
	           return false;
	       }
	}
//-----------------------------------------------------
	static boolean isAnagram3(String A, String B) {	
		if (A.length() != B.length()) { 
		    return false;
		}
		char[] a = A.toLowerCase().toCharArray();
		char[] b = B.toLowerCase().toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		//new use as constructor for String
		boolean value = new String(a).equals(new String(b));       
		return value ;
		}
//============================================
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        boolean ret = isAnagram(A,B);
        if(ret) {
        	System.out.println("Anagrams");
        }else {
        	System.out.println("Not Anagrams");
        	
        }
   System.out.println("----------------------");
   boolean ret2 = isAnagram2(A,B);
   if(ret2) {
   	System.out.println("Anagrams");
   }else {
   	System.out.println("Not Anagrams");   	
   }
   System.out.println("------------------------");
   boolean ret3 = isAnagram3(A,B);
   if(ret3) {
   	System.out.println("Anagrams");
   }else {
   	System.out.println("Not Anagrams");
   	
   }
	}

}
