import java.util.List;

public class Demo {

  public static void main(String[] args) {
    // List<String> list = new List("Apple","Mango","Banana");    //List is an interface hence it can't be instantiated
    List<String> list = List.of("Apple","Mango","Banana");

    System.out.println(list);
    // System.out.println(list[1]);     //index cannot be used with list
    System.out.println(list.get(1));
    for(String fruit:list) {
      System.out.println(fruit);
    }
  }
}