public class BiNumber {
  private int num1, num2;

  BiNumber(int num1, int num2) {
    this.num1 = num1;
    this.num2 = num2;
  }

  int add() {
    return this.num1 + this.num2;
  }

  int multiply() {
    return this.num1 * this.num2;
  }

  void doubleVal() {
    System.out.printf("\n%d %d", num1 * num1, num2 * num2);
  }

  int getNumber1() {
    return this.num1;
  }

  int getNumber2() {
    return this.num2;
  }

  public static void main(String[] args) {
    BiNumber numbers = new BiNumber(2,3);

    System.out.println(numbers.add());
    System.out.println(numbers.multiply());
    numbers.doubleVal();

    System.out.println(numbers.getNumber1());
    System.out.println(numbers.getNumber2());
  }
}