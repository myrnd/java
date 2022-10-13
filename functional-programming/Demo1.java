import java.util.List;

public class Demo1 {
  private static void printWithFP(List<String> list) {
    list.stream().forEach(
      el -> System.out.println("Element - " + el)
    );
  }
  public static void main(String[] args) {
    List<String> list = List.of("Apple","Mango","Banana");
    printWithFP(list);
  }
}