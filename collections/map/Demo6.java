import java.util.Map;
import java.util.HashMap;


public class Demo6 {
  public static void main(String[] args) {

    String str = "This is an awesome occasion. This has never happend before";

    Map<String, Integer> wordOccurances = new HashMap<>();

    String[] words = str.split(" ");

    for(String word:words) {
      Integer integer = wordOccurances.get(word);
      if(integer == null) {
        wordOccurances.put(word, 1);
      } else {
        wordOccurances.put(word, integer + 1);
      }
    }
    System.out.println(wordOccurances);

  }
}