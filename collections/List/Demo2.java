import java.util.*;

public class Demo2 {

  public static void main(String[] args) {
    List<String> words = List.of("Apple","Boy","Cat");

    System.out.println(words.size());   //3

    System.out.println(words.isEmpty());    //false
    System.out.println(words.get(1));     //Cat

    System.out.println(words.contains("Mango"));    //false
    System.out.println(words.contains("Apple"));    //true

    System.out.println(words.indexOf("Cat"));   //2
    System.out.println(words.indexOf("Mango"));   //-1

    // words.add("PineApple");      //Not allowed list is immutable collections


    // for(String word: words) {
    //   System.out.println(word);
    // }
  }
}