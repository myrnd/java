public class MyChar {

  private char ch;

  MyChar(char character) {
    this.ch = character;
  }

  public boolean isAlphabet() {
    if ((ch >= 97 && ch <= 122) || (ch >= 65 && ch <= 90)) {
      return true;
    }
    return false;
  }

  public boolean isDigit() {
    return ch >= 48 && ch <= 57;
  }

  public static void main(String[] args) {
    MyChar mychar = new MyChar('1');

    System.out.println(mychar.isAlphabet());
    System.out.println(mychar.isDigit());
  }
}