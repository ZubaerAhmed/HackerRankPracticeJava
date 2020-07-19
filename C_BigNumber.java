package HackerRankPracticeJava;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class C_BigNumber {
	
	public static BigDecimal[] scanner() {
		Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        
        String[] s = new String[n];
        BigDecimal[] a = new BigDecimal[n];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
            a[i] = new BigDecimal(s[i]);
            
        }
        sc.close();
        return a; 
	}
//------------------------------------------
	public static void testing() { 
		BigDecimal[] s = scanner();
		
		Arrays.sort(s, Collections.reverseOrder());
		for(int i=0; i<s.length; i++) {
			String string = s[i].toPlainString();
			if(string.startsWith("0")) {
				System.out.println(string.substring(1));
			}else {
				System.out.println(s[i]);
			}
//			System.out.println(s[i]);
		}
	}
//===========================================
	public static void main(String[] args) {
		testing();

	}

}
//  quick brown fox jumps over the lazy dog



