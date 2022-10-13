/* Program to find even number with functional programming approach*/

import java.util.List;

public class Demo1 {
  private static void printWithFP(List<Integer> list) {
    list.stream()
      .filter(el -> el % 2 == 0)
      .forEach(
        el -> System.out.println("Element - " + el)
      );
  }
  public static void main(String[] args) {
    List<String> list = List.of("Apple","Mango","Banana");
    printWithFP(list);
  }
}