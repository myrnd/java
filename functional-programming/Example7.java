import java.util.List;

public class Example7 {
  public static void  main(String[] args) {
    List<Integer> list = List.of(7,33,21,69,6,10);
    List<String> str = List.of("apple","ant","bat","banna");

      // list.stream()
      //   .map(el -> el*el)
      //   .forEach(el -> System.out.println(el));

      list.stream()
        .map(el -> el*el)
        .forEach(System.out::println);

      // str.stream()
      //   .map(el -> el.length())
      //   .forEach(System.out::println);
      
      str.stream()
        .map(String::length)
        .forEach(System.out::println);

  }
}
