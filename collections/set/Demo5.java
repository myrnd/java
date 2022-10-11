import java.util.Set;
import java.util.TreeSet;

public class Demo5 {

  public static void main(String[] args) {
    TreeSet<Integer> numbers = new TreeSet(Set.of(1,2,3,60,4));

    System.out.println(numbers);
    System.out.println(numbers.floor(60));      //return small number <= given value
    System.out.println(numbers.lower(3));     //return small number < given value
    System.out.println(numbers.ceiling(3));     //return large number <= given value
    System.out.println(numbers.lower(5));     //return large number < given value
    System.out.println(numbers.subSet(2,4));     //return subset betn given value where lower limit is inculsive and upper limit is exculisive
    System.out.println(numbers.subSet(2,3));     //return subset betn given value where lower limit is inculsive and upper limit is exculisive
    System.out.println(numbers.headSet(4));     //return number upto given value
    System.out.println(numbers.tailSet(4));     //return all the number  after the given value
  }
}