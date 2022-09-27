import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class DeleteEx2 {

  public static void main(String[] args) {
    List<String> list = List.of("Apple","Bat","Cat");
    ArrayList<String> arraylist = new ArrayList();

    arraylist.addAll(list);
    System.out.println(arraylist);

    Iterator<String> arrayListIterator = arraylist.iterator();
  
    for(String item:arraylist) {
      if(item.endsWith("at")) {
        System.out.println(item);
      }
    }

    // for(String item:arraylist) {
    //   if(item.endsWith("at")) {
    //     arraylist.remove(item);       
    //   }
    // }

    while(arrayListIterator.hasNext()) {
      String temp = arrayListIterator.next();
      if(temp.endsWith("at")) {
        arrayListIterator.remove();       
      }
    }

    System.out.println(arraylist);

  }
}