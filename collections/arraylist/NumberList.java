import java.util.List;
import java.util.ArrayList;

public class NumberList {

  public static void main(String[] args) {
    List<Integer> numbers = List.of(101,102,103,104,105);

    ArrayList<Integer> numbersAL = new ArrayList(numbers);
    System.out.println(numbersAL);

    System.out.println(numbersAL.indexOf(103));
    // System.out.println(numbersAL.remove(103));   //not working  remove(int index), remove(Object 0)
    System.out.println(numbersAL.remove(Integer.valueOf(103)));

    System.out.println(numbersAL);

  }
}