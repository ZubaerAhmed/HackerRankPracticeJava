package HackerRankPracticeJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class E_ListStudentGrade {
	public static void main(String[] args){
//		//scanner loop 
//		Scanner in = new Scanner(System.in);
//		int testCases = Integer.parseInt(in.nextLine());
//		
		List<Student2> studentList = new ArrayList<Student2>();
//		while(testCases>0){
//			int id = in.nextInt();
//			String fname = in.next();
//			double cgpa = in.nextDouble();			
//			Student2 st = new Student2(id, fname, cgpa);
//			studentList.add(st);			
//			testCases--;
		Student2 student = new Student2(1212, "Zubaer", 3.98);
		studentList.add(student);
//		}
			
//-------Sorting and compare-----------------------------------------------
	      Collections.sort(studentList,new Comparator<Student2>(){
	          public int compare(Student2 s1, Student2 s2){
	              if((s1.getCgpa()*100) != (s2.getCgpa()*100)){
	                  return (int)((s2.getCgpa()*1000) - (s1.getCgpa()*1000));
	              }
	              else if(!(s1.getFname().equals(s2.getFname()))){
	                  return s1.getFname().compareTo(s2.getFname());
	              }
	              else{
	                  return s1.getId()-s2.getId();
	              }
	          }
	        });
		//------------------------------------------------------
      	for(Student2 st: studentList){
			System.out.println(st.getFname()+" "+st.getCgpa()+" "+st.getId());
		}
	}
}
//================================================================	
class Student2{
	private int id;
	private String fname;
	private double cgpa;
	public Student2(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}


