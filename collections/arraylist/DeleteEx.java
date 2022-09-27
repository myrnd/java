import java.util.ArrayList;
import java.util.List;

public class UpdateEx {

  public static void main(String[] args) {
    List<String> list = List.of("One","Two","Three");
    ArrayList<String> arraylist = new ArrayList();

    arraylist.addAll(list);

    System.out.println(arraylist);

    System.out.println(arraylist.remove(2));    //delete element from arraylist based on index and return the element

    System.out.println(arraylist);

    System.out.println(arraylist.remove("One"));  //delete element from arralist based on element and return true if found else false
    System.out.println(arraylist.remove("One"));  

    System.out.println(arraylist);
  }
}