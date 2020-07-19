package HackerRankPracticeJava;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;
import static java.lang.System.in;

class Prime{
	public void checkPrime(int ... a){
		for(int i : a){
			if(i==1 || i<2){       
				System.out.print("");      
			}
			else if(i==2){
				System.out.print(i + " ");
			}else{
				int sum=1;
				for(int y=2;y<i;y++){
					if(i%y==0){
						sum=0;
						break;
					}
				} 
				if(sum==1){
					System.out.print(i + " ");
				}          
			}   
		}
		System.out.println("");
	}}
//=========================================================== 
public class InstancePrimeChecker {

	public static void main(String[] args) {
		try{
			BufferedReader br=new BufferedReader(new InputStreamReader(in));
			int n1=Integer.parseInt(br.readLine());
			int n2=Integer.parseInt(br.readLine());
			int n3=Integer.parseInt(br.readLine());
			int n4=Integer.parseInt(br.readLine());
			int n5=Integer.parseInt(br.readLine());

			Prime ob=new Prime();
			ob.checkPrime(n1);
			ob.checkPrime(n1,n2);
			ob.checkPrime(n1,n2,n3);
			ob.checkPrime(n1,n2,n3,n4,n5);	

			Method[] methods = Prime.class.getDeclaredMethods();
			Set<String> set=new HashSet<>();
			boolean overload=false;
			for(int i=0;i<methods.length;i++){
				if(set.contains(methods[i].getName())){
					overload=true;
					break;
				}
				set.add(methods[i].getName());			
			}
			if(overload){
				throw new Exception("Overloading not allowed");
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}

}


