import java.util.Queue;
import java.util.PriorityQueue;
import java.util.List;
import java.util.Comparator;

class StringLengthComparator implements Comparator<String> {
  public int compare(String value1, String value2) {
    return Integer.compare(value1.length(),value2.length());
  }
};

public class Demo2 {

  public static void main(String[] args) {

    Queue queue = new PriorityQueue(new StringLengthComparator());
    
    queue.addAll(List.of("Mango","Apple","Banana"));

    System.out.println(queue.poll());
    System.out.println(queue.poll());
    System.out.println(queue.poll());
    System.out.println(queue.poll());



  }
}