import java.math.BigDecimal;

public class Employee extends Person{
  private String title;
  private String employer;
  private char employeeGrade;
  private BigDecimal salary;

  Employee(String name, String title) {
    super(name);
    this.title = title;
    System.out.println("Employee Constructor Called");
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getEmployer() {
    return employer;
  }

  public void setEmployer(String employer) {
    this.employer = employer;
  }

  public char getEmployeeGrade() {
    return employeeGrade;
  }

  public void setEmployeeGrade(char employeeGrade) {
    this.employeeGrade = employeeGrade;
  }

  public BigDecimal getSalary() {
    return salary;
  }

  public void setSalary(BigDecimal salary) {
    this.salary = salary;
  }

  public String toString() {
    return super.toString() + String.format(" Title: %s, Employer: %s, Employee Greade: %s"
      ,title,employer,employeeGrade);
  } 
  
  public static void main(String[] args) {
    Employee e1 = new Employee("Vivek","FrontDev");
    // e1.setName("Vivek");
    e1.setEmail("vivek@test.com");
    e1.setPhoneNumber("8080808080");
    // e1.setTitle("Full Stack Devloper");
    e1.setEmployer("Google");
    e1.setEmployeeGrade('B');

    System.out.println(e1);
  }
}