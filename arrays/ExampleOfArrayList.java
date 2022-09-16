import java.util.*;

public class ExampleOfArrayList {

  public static void main(String[] args) {

    ArrayList items = new ArrayList();
    items.add("Apple");
    items.add("Mango");
    items.add(1);

    System.out.println(items);

    ArrayList<String> stringList = new ArrayList();

    stringList.add("Hello");
    // stringList.add(2);   //Not allowed because it will accept only string

    System.out.println(stringList);
  }
}