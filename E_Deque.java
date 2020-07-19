package HackerRankPracticeJava;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class E_Deque{

	public static void main(String[] arg) {
		deque();
		deque2();
	}
	//=============================================================
	public static void deque() {
		Scanner in = new Scanner(System.in);
		Deque<Integer> deque = new ArrayDeque<>();
		HashSet<Integer> set = new HashSet<>();

		int n = in.nextInt();
		int m = in.nextInt();
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) {
			int input = in.nextInt();

			deque.add(input);
			set.add(input);

			if (deque.size() == m) {
				if (set.size() > max) max = set.size();
				int first = deque.remove();
				if (!deque.contains(first)) set.remove(first);
			}
		}        
		System.out.println(max);
	}
	//=============================================================
	public static void deque2() {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		ArrayDeque<Integer> deque     = new ArrayDeque<Integer>();

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int max = 0;

		for (int i = 0; i < n; i++) {
			/* Remove old value (if necessary) */
			if (i >= m) {
				int old = deque.removeFirst();
				if (map.get(old) == 1) {
					map.remove(old);
				} else {
					map.merge(old, -1, Integer::sum);
				}
			}

			/* Add new value */
			int num = scan.nextInt();
			deque.addLast(num);
			map.merge(num, 1, Integer::sum);

			max = Math.max(max, map.size());

			/* If all integers are unique, we have found our largest
	               possible answer, so we can break out of loop */
			if (max == m) {
				break;
			}
		}

		scan.close();
		System.out.println(max);
	}

}