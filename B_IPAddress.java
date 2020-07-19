package HackerRankPracticeJava;

import java.util.Scanner;

public class B_IPAddress {
	 public String pattern = "\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}";
//OR
//   public String pattern = "((\\d|\\d\\d|[0-1]\\d\\d|2[0-4][0-9]|25[0-5])\\.){3}(\\d|\\d\\d|[0-1]\\d\\d|2[0-4][0-9]|25[0-5])";
	public static void main(String[] args) {
//		String pattern = 
//				"^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
//				"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
//				"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
//				"([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

		 //System.out.println( "000.12.12.034".matches( new myRegex().pattern ) );
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            boolean matched = false;
            boolean checked = true;
            
            if( IP.matches(new B_IPAddress().pattern ) ) {
                matched = true;
                checked = true;
                String [] ipFragments = IP.split( "\\." );
                int ipFragment;
                for( int i = 0; i < ipFragments.length; i++ ) {
                    ipFragment = Integer.valueOf( ipFragments[i] );
                    if( ipFragment >= 0 && ipFragment <= 255 ) {
                        
                    } else {
                        checked = false;
                    }
                }
            }
            System.out.println( matched && checked );
        }
    
	}

}
