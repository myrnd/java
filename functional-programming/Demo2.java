import java.util.List;

public class Demo2 {
  public static void main(String[] args) {
    List<Integer> list = List.of(4,5,7,8,10,12);
    List<String> list2 = List.of("Apple","Cat","Bat");
    printWithFP(list);
    printStringWithFP(list2);
  }

   private static void printWithFP(List<Integer> list) {
    list.stream()
      .filter(el -> el % 2 == 0)
      .forEach(
        el -> System.out.println("Element - " + el)
      );
  }

  private static void printStringWithFP(List<String> list) {
    list.stream()
      .filter(el -> el.endsWith("at"))
      .forEach(
        el -> System.out.println("Element - " + el)
      );
  }
}