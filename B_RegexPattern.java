package HackerRankPracticeJava;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class B_RegexPattern {

	public static void main(String[] args) {

		USApattern();
	}
	//=============================================
    public static void USApattern() {
     // String pattern = "(\\s|^)([a-z]+)(\\s+\\2)+(?=(?:\\s|$))";
	  String pattern = "\\b([a-z]+)\\b(?:\\s+\\1\\b)+";
    //	String pattern = "(\\b\\w+\\b)(\\s*\\1\\b)+";
        Pattern r = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());
        
        while(numSentences>0){
        //while (numSentences-- > 0) {
            String input = in.nextLine();
            Matcher m = r.matcher(input);
            //boolean findMatch = true;
            while(m.find( )){
                input = input.replaceAll(m.group(), m.group(1));
                //findMatch = false;
            }
            System.out.println(input);
            numSentences--;
            in.close();
        }
    }
    //--------------------------------------------
    /*
     Goodbye bye bye world world world
Sam went went to to to his business
Reya is is the the best player in eye eye game
in inthe
Hello hello Ab aB
     */
}
