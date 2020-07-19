package HackerRankPracticeJava;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class D_HashSet {

	public static void main(String[] args) {

		testing();
		testing2();

	}
	//====================================================
	public static void testing() {
		String [][] pair_left = { {"john", "tom"},{"john", "mary"},{"john", "tom"},{"mary", "anna"},{"mary", "anna"} };
		String [] pair_right = new String[5];
		Set<String> set = new HashSet<String>();      
		for(int i=0; i<pair_left.length; i++) {
			set.add(pair_left[i][0] +" "+ pair_left[i][1]);
			//set.add(pair_left[i][1]);
		}
		for(String s : set) {
			//System.out.println(s);
		}
		System.out.println(set.size());
	}
//--------------------------------------------------
	public static void testing2() {
		Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        Set<String> set = new HashSet<String>();
        for(int i=0; i<pair_left.length; i++) {
        	set.add(pair_left[i] +" "+pair_right[i]);
        }
//        for(String str : set) {
//			System.out.println(str);
//		}
		System.out.println(set.size());
	}
}





