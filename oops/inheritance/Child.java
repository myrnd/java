public class Child extends Parent {

  public String str = "Child";

  public void display() {
    System.out.println(super.str);
    System.out.println("Child");
  }

  public static void main(String[] args) {
    Child child = new Child();
    child.display();
    // System.out.println(child.str);
    // System.out.println(super.str);   
  }
}