import java.util.Queue;
import java.util.PriorityQueue;
import java.util.List;

public class Demo {

  public static void main(String[] args) {
   
    // Queue<String> queue = Queue.of("Apple","Mango","Banana");      not allowed
    // Queue<String> queue = List.of("Apple","Mango","Banana");       not allowed to store list into array directly
    
    Queue<String> queue = new PriorityQueue<>();  

    queue.offer("Apple");

    queue.addAll(List.of("Zebar","Cat","Monkey"));

    System.out.println(queue);

    System.out.println(queue.poll());
    System.out.println(queue.poll());
    System.out.println(queue.poll());
    System.out.println(queue.poll());
    System.out.println(queue.poll());

  }
}