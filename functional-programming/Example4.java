import java.util.List;

public class Example4 {
  public static void  main(String[] args) {
    List<Integer> list = List.of(7,33,21,69,6,10);

    // System.out.println(list);

    System.out.println(
      list.stream()
        .filter(el -> el%2 == 0)
        .max((n1,n2) -> Integer.compare(n1,n2))
        .orElse(5)
    );

  }
}
