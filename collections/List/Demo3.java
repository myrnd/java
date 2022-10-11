import java.util.*;

public class Demo3 {
  public static void main(String[] args) {
    List<String> words = List.of("Apple","Mango","Banana");
    System.out.println(words);

    // words.add("Pinapple");   List are immutable
    List<String> wordsArrayList = new ArrayList<String>(words);
    wordsArrayList.add("Pinapple");
    System.out.println(wordsArrayList);

    List<String> wordsLinkedList = new LinkedList<String>(words);


    List<String> wordsVector = new Vector<String>(words);


  }
}