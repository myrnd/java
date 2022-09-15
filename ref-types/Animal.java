public class Animal {

  public static void main(String[] args) {
    String str = "hell " + "world " + "java " + "is " + "awesome ";   //here 10 String instance created for concat
    System.out.println(str);

    System.out.println(str.concat("and secure too"));
    System.out.println(str);

    StringBuffer str1 = new StringBuffer("Welcome");
    System.out.println(str1);

    StringBuffer str2 = str1.append(" To Java");

    System.out.println(str1);
    System.out.println(str2);

  }
}