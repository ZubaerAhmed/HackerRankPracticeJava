package HackerRankPracticeJava;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class B_RegexPaternWebTag {

	public static void main(String[] args) {
		webTag();
		//	webTag2();
	}
	//=====================================================
	public static void webTag() {
		String line = "<h1>Nayeem loves counseling</h1>";
		String pattern = "<(.+)>(([^<>]+))</\\1>";
	
		Pattern r = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
		Matcher m = r.matcher(line);
		//OR -> one line
		//Matcher m = Pattern.compile(pattern).matcher(line); 
		if (!m.find()) { 
			System.out.println("None");
		}          
		m.reset();
		while (m.find()){
			System.out.println(m.group(2));
		}		
	}
	//-----------------------------------------------------
	public static void webTag2() {
		String regex = "<([^<>]+)>([^<>]+)</\\1>";
		Pattern pattern = Pattern.compile(regex);

		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String line = in.nextLine();
			Matcher matcher = pattern.matcher(line);
			int counter = 0;
			while (matcher.find()) {
				System.out.println(matcher.group(2));
				counter++;
			}
			if (counter == 0) System.out.println("None");
			testCases--;
		}
	}
}
/*
<h1>Nayeem loves counseling</h1>
<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>
<Amee>safat codes like a ninja</amee>
<SA premium>Imtiaz has a secret crush</SA premium>
 */