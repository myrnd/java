import java.util.List;
import java.util.function.Predicate; 
import java.util.function.Consumer; 

class EvenPredicate implements Predicate<Integer> {
  public boolean test(Integer number) {
    return number%2 == 0;
  }
}

class PrintConsumer implements Consumer<Integer> {
  public void accept(Integer number) {
    System.out.println(number);
  }
}

public class Example5 {
  public static void  main(String[] args) {
    List<Integer> list = List.of(7,33,21,69,6,10);

      list.stream()
        .filter(el -> el%2 == 0)
        .forEach(el -> System.out.println(el));

      list.stream()
        .filter(new EvenPredicate())
        .forEach(new PrintConsumer());
  }
}
