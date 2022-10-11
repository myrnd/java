import java.util.Set;
import java.util.LinkedHashSet;

public class Demo2 {
  public static void main(String[] args) {
    Set<Integer> numbers = new LinkedHashSet();

    numbers.add(765432);
    numbers.add(76543);
    numbers.add(7654);
    numbers.add(765);
    numbers.add(7651);   
    // numbers.add(7651); Dublicated can't stored but it won't give any error

    System.out.println(numbers);
  }
}