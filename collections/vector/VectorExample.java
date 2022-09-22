import java.util.Vector;

public class VectorExample {

  public static void main(String[] args) {
    
    Vector<String> vectorList = new Vector<String>(10);     //arguments are intially capacity
    vectorList.add("Orange");
    vectorList.add("banana");
    vectorList.add("mango");
    vectorList.add("apple");

    System.out.println(vectorList);
    System.out.println(vectorList.size());
    System.out.println(vectorList.isEmpty());
    System.out.println(vectorList.indexOf("apple"));
    System.out.println(vectorList.contains("apple"));
  }
}