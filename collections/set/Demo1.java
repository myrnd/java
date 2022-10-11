import java.util.Set;
import java.util.HashSet;

public class Demo1 {
  public static void main(String[] args) {
    Set<Integer> numbers = new HashSet();

    numbers.add(765432);
    numbers.add(76543);
    numbers.add(7654);
    numbers.add(765);

    System.out.println(numbers);
  }
}