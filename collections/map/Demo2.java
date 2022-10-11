import java.util.Map;
import java.util.HashMap;


public class Demo2 {
  public static void main(String[] args) {

    Map<String, Integer> map = Map.of("A",96,"B",98,"C",99);
    Map<String, Integer> hashMap = new HashMap(map);

    System.out.println(hashMap);
    hashMap.put("D",100);
    System.out.println(hashMap);

  }
}