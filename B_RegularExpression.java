  package HackerRankPracticeJava;

import java.util.Scanner;

public class B_RegularExpression {
	
	public static void testing(String s){
		String str = s.trim();		
		if(str.isEmpty()) {
	    	   System.out.println("0");       
		}else{
			String[] arr = str.split("[ !,?._'@]+", 10); 
			System.out.println(arr.length);
			for (String a : arr) {
			   System.out.println(a);
			}
		}   
	}
//----------------------------------------------------
	public static void testing2(String str){

		String[] tokens = str.split("[^a-zA-Z]");
		int numTokens = 0;

		for (int i=0; i<tokens.length; ++i) { 
		    if (tokens[i].length() > 0) { 
		        numTokens++;
		    }
		}
		System.out.println(numTokens);
		//System.out.println(tokens.length);
		for (int i=0; i<tokens.length;++i)
		    if (tokens[i].length() > 0)
		        System.out.println(tokens[i]);
	}
//====================================================
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        scan.close();
        testing(str);
       // System.out.println("++++++++++++++++++++++");
       // testing2(str);

	}

}
//     hello, world
//  He is a very very. good_boy, isn't he?
//             YES      leading spaces        are valid,    problemsetters are         evillllll