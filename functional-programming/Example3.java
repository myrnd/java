import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Collectors;


public class Example3 {
  public static void  main(String[] args) {
    List<Integer> list = List.of(2,34,21,69);

    // System.out.println(list);

    System.out.println(
      list.stream().min((n1,n2) -> Integer.compare(n1,n2)).get()
    );

    // IntStream.range(1,10)
    //   .filter(el -> el%2 != 0)
    //   .forEach(el -> System.out.println(el));

    System.out.println(
      list.stream()
      .filter(el -> el%2 != 0)
      .collect(Collectors.toList())
    );

    System.out.println(
      IntStream.range(1,10)
      .map((el) -> el * el)
      .boxed()          //IntStream doesn't return stream instead return IntPipeline boxed method covert them into stream
      .collect(Collectors.toList())
    );
  }
}
