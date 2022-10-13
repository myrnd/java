/* Find sum of given list using functional programming */

import java.util.List;

public class Demo4 {
  public static void main(String[] args) {
    List<Integer> list = List.of(1,4,5,23,4);

    int sum = list.stream()
      .filter(el -> el % 2 != 0)
      .reduce(
        0,(num1, num2) -> num1 + num2
      );

    System.out.println(sum);
  }
}