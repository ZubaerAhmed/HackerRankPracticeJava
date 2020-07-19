package HackerRankPracticeJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class E_ListStudentGrade2 {
	public static void main(String[] args){
	      Scanner in = new Scanner(System.in);
	      int testCases = Integer.parseInt(in.nextLine());
	      
	      List<Student> studentList = new ArrayList<Student>();
	      while(testCases>0){
	         int id = in.nextInt();
	         String fname = in.next();
	         double cgpa = in.nextDouble();
	         
	         Student st = new Student(id, fname, cgpa);
	         studentList.add(st);
	         
	         testCases--;
	      }
	      // line 27-31 does not need StudentComparator() method --> Interface
	      Collections.sort(studentList, Comparator.comparing(Student :: getCgpa).reversed()
	    		  .thenComparing(Student :: getFname).thenComparing(Student :: getId));
	      
	         for(Student st: studentList){ 
	         System.out.println(st.getFname());
	      }
//	         //another way
//	         Student[] studentArray = {   };
//	         Arrays.parallelSort(studentArray, new StudentComparator());
//	         //OR
//	         Collections.sort(studentList,  new StudentComparator());
//	         Arrays.parallelSort(studentArray, new StudentComparator());
//	         //OR
//		      Comparator<Student> student = Comparator.comparing(Student::getCgpa);
//		      Collections.sort(studentList, student.reversed());
	}
}
//==========================================================================================	
class Student{
	private int id;
	   private  String fname;
	   private double cgpa;
	   public Student(int id, String fname, double cgpa) {
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
//================================================================
class StudentComparator implements Comparator<Student> {  
    public int compare(Student s1, Student s2) {
        int comparison = Double.compare(s2.getCgpa(),s1.getCgpa());
        if(comparison != 0) { 
        	return comparison; 
        }       
        comparison = s1.getFname().compareTo(s2.getFname());
        if(comparison != 0) { 
        	return comparison; 
        }
        return s1.getId() - s2.getId();
    }
}
//================================================================
/*
class Student implements Comparable<Student> {
  // ...
  private static final Comparator<Student> comp =
    Comparator.comparingDouble(Student::getCgpa).reversed()
              .thenComparing(Student::getFname)
              .thenComparingInt(Student::getId);
  // ...
  @Override
  public int compareTo(final Student other) {
    return comp.compare(this, other);
  }
}

public class Solution {
  public static void main(final String[] args) {
    final Scanner in = new Scanner(System.in);
    final int numTestCases = in.nextInt();
    in.nextLine();
    
    final List<Student> students = Stream.generate(() ->
        new Student(in.nextInt(),
                    in.next(),
                    in.nextDouble())
      ).limit(numTestCases).sorted().collect(toList());
        
    for (Student student : students) {
      System.out.println(student.getFname());
    }
  }
}
6|Add CommentParentPermalink
*/