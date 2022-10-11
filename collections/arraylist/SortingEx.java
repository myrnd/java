import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class SortingEx {
  public static void main(String[] args) {
    List<Integer> numbers = List.of(3,34,62,1,3);

    List<Integer> numbersAL = new ArrayList(numbers);

    System.out.println(numbersAL);

    Collections.sort(numbersAL);

    System.out.println(numbersAL);

  }

}