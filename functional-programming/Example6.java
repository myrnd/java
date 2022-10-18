import java.util.List;
import java.util.function.Function; 

class NumberSquareMapper implements Function<Integer, Integer> {
  public Integer apply(Integer number) {
    return number * number;
  }
}

public class Example6 {
  public static void  main(String[] args) {
    List<Integer> list = List.of(7,33,21,69,6,10);

      list.stream()
        .map(el -> el*el)
        .forEach(el -> System.out.println(el));

      list.stream()
        .map(new NumberSquareMapper())
        .forEach(el -> System.out.println(el));

  }
}
