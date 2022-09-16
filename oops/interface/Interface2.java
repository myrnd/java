public interface Interface2 extends Interface1 {
  public void method2();

  default void print() {
    System.out.println("Default implementation");
  }
}