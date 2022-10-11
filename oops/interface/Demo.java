public interface Demo {
  // private void print() {
  //   System.out.print("print");
  // }
  public void print();

  public default void showMessage() {
    System.out.println("show message");
  }

  public static void displayMessage() {
    System.out.println("display message");
  }
}