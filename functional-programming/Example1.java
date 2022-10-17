import java.util.List;
import java.util.stream.IntStream;

public class Example1 {
  public static void  main(String[] args) {

    IntStream.range(1,10).map(el -> el*el).forEach(el -> System.out.println(el));

    // List.of("Apple","Ant","Bat").stream()
    //   .map(el -> el.toLowerCase())
    //   .forEach(el -> System.out.println(el));
  }

}
