public class Number {

  public static void main(String[] args) {
    // Integer num = new Integer(5);
    Integer num1 = Integer.valueOf(5);
    Integer num2 = 7;   //same as above called Auto boxing

    Boolean isOkay = true;
    Boolean isfalse = new Boolean("false");
    Boolean isTrue = Boolean.valueOf("True");


    System.out.println(num1);
    System.out.println(num2);
    System.out.println(Integer.MAX_VALUE);
    System.out.println(Integer.SIZE);
    System.out.println(isOkay);
    System.out.println(isfalse);
    System.out.println(isTrue);
  }
}