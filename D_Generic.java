package HackerRankPracticeJava;

public class D_Generic {

	public static void main(String[] args) {
		Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        Printer.printArray(intArray);
        Printer.printArray(stringArray);
	}
}

class Printer{
  public static <T> void printArray(T[] array){
	  for(T element : array) {
		System.out.printf("%s ", element);
		//System.out.println(element);
	  }
		System.out.println();
  }
 
}
