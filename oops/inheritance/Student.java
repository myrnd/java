public class Student extends Person {

  private String collegeName;
  private int year;

  public String getCollegeName() {
    return this.collegeName;
  }

  public void setCollegeName(String collegeName) {
    this.collegeName = collegeName;
  }
  
  public int getYear() {
    return this.year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public String toString() {    // Method Overriding
    return String.format("%s %d",collegeName,year);
  }

  public static void main(String[] args) {
    Student student = new Student();

    student.setName("Nikhil");
    student.setYear(2022);

    System.out.println(student.getName());
    System.out.println(student.getYear());

    System.out.println(student);


  }
}