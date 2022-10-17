import java.util.List;

public class Example2 {
  public static void  main(String[] args) {
    List<Integer> list = List.of(2,34,21,69);

    System.out.println(list);

    System.out.println(
      list.stream().max((n1,n2) -> Integer.compare(n1,n2)).get()
    );
  }
}
