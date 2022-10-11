import java.util.ArrayList;

public class ArrayListEx {

  public static void main(String[] args) {
    
    ArrayList<String> arraylist = new ArrayList<String>(2);
    arraylist.add("Orange");
    arraylist.add("banana");
    arraylist.add("mango");
    arraylist.add("apple");

    System.out.println(arraylist);
    System.out.println(arraylist.size());
    System.out.println(arraylist.isEmpty());
    System.out.println(arraylist.indexOf("apple"));
    System.out.println(arraylist.contains("apple"));
  }
}