package HackerRankPracticeJava;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

public class JavaReflectionClassMethod {

	  public static void main(String[] args) {
	        Class<Student52> Student52 = Student52.class; // uses class literal, not a function.
	        Method[] methods = Student52.getDeclaredMethods();

	        /* Get names from Methods */
	        ArrayList<String> methodList = new ArrayList<String>();
	        for (Method method : methods) {
	        	methodList.add(method.getName());
	        }
	        
	        /* Sort and print names */
	        Collections.sort(methodList);
	        for (String name: methodList) {
	            System.out.println(name);
	        }
	    }
}
//=======================================================
class Student52{ 
    private String name;
    private String id;
    private String email;

    public String getName() {
        return name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void anothermethod2(){    	
    }
    public void anothermethod3(){    	
    }
    public String getName54() {
		return email;
    	
    }
}
