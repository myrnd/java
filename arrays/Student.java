import java.math.*;
import java.util.Arrays;

public class Student {

  private String name; 
  private int[] marks;

  // Student(String name, int[] marks) {
  Student(String name, int... marks) {
    this.name = name;
    this.marks = marks;
  }

  int getNumberOfMarks() {
    // System.out.println("Total Number of Marks : " + this.marks.length);
    return marks.length;
  }

  void displayMarks() {
    System.out.println(Arrays.toString(marks));
  }

  void getMaxMark() {
    int max = 0;
    for(int mark: marks) {
      if(mark > max)
        max = mark;
    }
    System.out.println("Maximum Marks : " + max);
  }

  void getMinMark() {
    int min = Integer.MAX_VALUE;
    for(int mark: marks) {
      if(mark < min)
        min = mark;
    }
    System.out.println("Minimum Marks : " + min);
  }

  int getTotalSumOfMarks() {
    int sum = 0;
    for(int mark: marks) {
      sum += mark;
    }
    // System.out.println("Sum of Marks : " + sum);
    return sum;
  }

  void getAverageMarks() {
    int sum = getTotalSumOfMarks();
    int number = getNumberOfMarks();

    int PRECISION = 3;

    // BigDecimal average = new BigDecimal(sum).divide(new BigDecimal(number));  error because of division result has long precison

    BigDecimal average = new BigDecimal(sum).divide(new BigDecimal(number), PRECISION, RoundingMode.UP);

    System.out.println("Average Marks : " + average);
  }
  
  public static void main(String[] args) {
    int[] marks = {97,98,100};
    Student student = new Student("Vivek",marks);
    Student student2 = new Student("Ankush", new int[] {100,30,40,50});  // Passing array as argument inline

    // student.getNumberOfMarks();
    student.getMaxMark();
    student.getMinMark();
    // student.getTotalSumOfMarks();
    student.getAverageMarks();

    student2.getAverageMarks();
    student.displayMarks();
  }

}

