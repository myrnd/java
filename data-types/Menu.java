import java.util.Scanner;

public class Menu {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter Number1 : ");
    int num1 = scanner.nextInt();

    System.out.println("Enter Number2 : ");
    int num2 = scanner.nextInt();

    System.out.println("Choices Availabel are ");
    System.out.println("1. Add");
    System.out.println("2. Substract");
    System.out.println("3. Multiply");
    System.out.println("4. Divide");

    int choice = scanner.nextInt();

    System.out.println("Your Choices are ");
    System.out.println("Number1 " + num1);
    System.out.println("Number2 " + num2);
    System.out.println("Choice " + choice);

    if(choice == 1) {
      System.out.println("Result " + (num1 + num2));
    } else if(choice == 2) {
      System.out.println("Result " + (num1 - num2));
    } else if(choice == 3) {
      System.out.println("Result " + (num1 * num2));
    } else if(choice == 4) {
      System.out.println("Result " + (num1 / num2));
    } else {
      System.out.println("Invalid Operation");
    }
  }
}