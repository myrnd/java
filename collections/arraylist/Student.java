import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


public class Student implements Comparable<Student> {
  private int id;
  private String name;

  Student(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setID(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String toString() {
    return id + " " + name;
  }

  public int compareTo(Student that) {

    // return Integer.compare(this.id, that.id);    //accending order
    return Integer.compare(that.id, this.id);       //decending order
  }



  public static void main(String[] args) {
    List<Student> studentList = List.of(new Student(1,"Vivek"),
      new Student(5,"Vishal"),
      new Student(4, "Nikhil"));

    // System.out.println(studentList);

    List<Student> studentAlList =  new ArrayList(studentList);

    System.out.println(studentAlList);

    Collections.sort(studentAlList);

    System.out.println("Dsc " + studentAlList);

    // Collections.sort(studentAlList, new StudentComparator());
    studentAlList.sort(new StudentComparator());

    System.out.println("Asc " + studentAlList);
  }
}