import java.util.Iterator;
import java.util.List;

public class Demo1 {

  public static void main(String[] args) {
    List<String> list = List.of("apple","boy","cat");

    // Iterator<String> iterator = new Iterator();      ///Iterator is an interface hence it can't be instantiated
    Iterator<String> iterator = list.iterator(); 

    while(iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }
}