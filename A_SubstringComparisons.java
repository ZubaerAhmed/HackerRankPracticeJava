package HackerRankPracticeJava;

import java.util.Arrays;
import java.util.Scanner;

class B_HackerRank{
	public String testing(String s, int k) {		
	    String string = s.trim();
        int len = string.length() - k + 1;
        String[] a = new String[len];
        for (int i = 0; i < len; i++) {
            a[i] = string.substring(i, i + k);
        }
        Arrays.sort(a);
        String smallest = a[0];
        String largest = a[len - 1];
        return smallest + "\n" + largest; 
	} 
//-------------------------------------------
	public static void testing2(String str, int num) {		
		String min = str.substring(0, num);
        String max = str.substring(0, num);
        String compare;
        for (int i = 0; i+num <= str.length(); i++) {
            compare = str.substring(i, i+num);
            //System.err.println(compare);
            if (compare.compareTo(min) < 0)
                min = compare;
            if (compare.compareTo(max) > 0)
                max = compare;
        }
        System.out.println(min);
        System.out.println(max);
	}
} 

public class A_SubstringComparisons {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    String s = in.next();
	    int k = in.nextInt();
	    
	    B_HackerRank a = new B_HackerRank();
	    a.testing(s, k);
//	    System.out.println(a.testing(s, k));
	    
	    System.out.println("------------");
	    B_HackerRank.testing2(s , k);
	}

}
