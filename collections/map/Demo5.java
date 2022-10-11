import java.util.Map;
import java.util.HashMap;


public class Demo5 {
  public static void main(String[] args) {

    String str = "This is an awesome occasion. This has never happend before.";

    Map<Character, Integer> occurances = new HashMap<>();

    char[] characters = str.toCharArray();

    for(char character:characters) {
      Integer integer = occurances.get(character);
      if(integer == null) {
        occurances.put(character, 1);
      } else {
        occurances.put(character, integer + 1);
      }
    }
    System.out.println(occurances);

  }
}