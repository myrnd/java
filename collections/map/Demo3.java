import java.util.Map;
import java.util.LinkedHashMap;


public class Demo3 {
  public static void main(String[] args) {

    Map<String, Integer> map = Map.of("A",96,"B",98,"C",99);
    Map<String, Integer> linkedHashMap = new LinkedHashMap(map);

    System.out.println(linkedHashMap);
    linkedHashMap.put("L",10);
    linkedHashMap.put("D",100);
    linkedHashMap.put("K",1200);
    System.out.println(linkedHashMap);

  }
}