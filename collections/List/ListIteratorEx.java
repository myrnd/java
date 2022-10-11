import java.util.List;
import java.util.Iterator;

public class ListIteratorEx {

  public static void main(String[] args) {
    List<String> words = List.of("Apple","Bat","Cat");

    for(int i = 0; i < words.size(); i++) {   //accessing value with basic for loop
      System.out.println(words.get(i));
    }

    for(String word:words) {    //accessing value with inhanced for loop
      System.out.println(word);
    }

    Iterator wordsIterator = words.iterator();

    while(wordsIterator.hasNext()) {
      System.out.println(wordsIterator.next());
    }
  }
}