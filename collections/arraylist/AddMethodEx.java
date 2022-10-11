import java.util.ArrayList;
import java.util.List;

public class AddMethodEx {

  public static void main(String[] args) {
    List<String> list = List.of("Apple","Mango","Bannana");
    ArrayList<String> arraylist = new ArrayList();

    arraylist.addAll(list);
    arraylist.add("papaya");
    arraylist.add(3,"Orange");

    System.out.println(arraylist);
  }
}
