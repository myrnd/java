import java.util.ArrayList;
import java.util.List;

public class UpdateEx {

  public static void main(String[] args) {
    List<String> list = List.of("One","Two","Three");
    ArrayList<String> arraylist = new ArrayList();

    arraylist.addAll(list);

    System.out.println(arraylist);

    arraylist.set(2,"3");

    System.out.println(arraylist);

  }
}