import java.util.LinkedList;

public class ArrayListEx {

  public static void main(String[] args) {
    
    LinkedList<String> linkedList = new LinkedList<String>();
    linkedList.add("Orange");
    linkedList.add("banana");
    linkedList.add("mango");
    linkedList.add("apple");

    System.out.println(linkedList);
    System.out.println(linkedList.size());
    System.out.println(linkedList.isEmpty());
    System.out.println(linkedList.indexOf("apple"));
    System.out.println(linkedList.contains("apple"));
  }
}