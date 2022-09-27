import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

  public int compare(Student std1, Student std2) {
    return Integer.compare(std1.getId(),std2.getId());
  }
}