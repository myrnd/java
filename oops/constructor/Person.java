public class Person {

  private int id;

  Person() {
    this(5);    //calling constructor from constructor
  }

  Person(int id) {
    System.out.println("Constructor is called");
    this.id = id;
  }
  
  public static void main(String[] args) {
    Person p1 = new Person(10);
    Person p2 = new Person(10);
    Person p5 = new Person();

    System.out.println(p1.id);
    System.out.println(p5.id);
  }
}