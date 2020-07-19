package HackerRankPracticeJava;
import java.util.Scanner;

public class B_RegexUserName {

	public static final String regularExpression = "^[A-Za-z][A-Za-z0-9_]{7,29}$";	    


	public static void main(String[] args) {
		whileLoop();
		//whileLoopScaner();

	}
	//=================================================
	public static void whileLoop() {
		//String userName = "Samantha_21";
		String[] userName = {"Julia","Samantha","Samantha_21","1Samantha","Samantha?10_2A","JuliaZ007","Julia@007","_Julia007"};
		for(int i=0; i<userName.length; i++) {
			if (userName[i].matches(regularExpression)) {
				System.out.println("Valid");
			} else {
				System.out.println("Invalid"); 
			}  
		}		         
	}
	//-------------------------------------------------
	public static void whileLoopScaner() {
		final Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		while (n-- != 0) {
			String userName = scan.nextLine();

			if (userName.matches(regularExpression)) {
				System.out.println("Valid");
			} else {
				System.out.println("Invalid"); 
			}           
		}
	}
}
