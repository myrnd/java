import java.util.List;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.HashSet;

public class Demo4 {
  public static void main(String[] args) {
    List<Character> characters = List.of('a','z','a','b','z','f');

    System.out.println(characters);
    Set<Character> linkedHashSet = new LinkedHashSet(characters);

    System.out.println(linkedHashSet);

    Set<Character> treeSet = new TreeSet(characters);

    System.out.println(treeSet);

    Set<Character> hashSet = new HashSet(characters);

    hashSet.add('k');

    System.out.println(hashSet);






  }
}