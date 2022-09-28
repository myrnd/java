import java.util.Set;
import java.util.HashSet;

public class Demo {

  public static void main(String[] args) {
    Set<String> set = Set.of("Apple","Boy","Cat");

    System.out.println(set);

    // set.add("Dog");    Set is immutable

    Set<String> hashSet = new HashSet(set);

    hashSet.add("Apple");   //Not added because Apple is already there
    hashSet.add("Mango");  

    System.out.println(hashSet);

    // hashSet.add(2, "Mango");   //not allowed positioning entry


  }
}