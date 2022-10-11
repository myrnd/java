import java.util.Map;
import java.util.TreeMap;


public class Demo4 {
  public static void main(String[] args) {

    Map<String, Integer> map = Map.of("A",96,"B",98,"C",99);
    Map<String, Integer> treeMap = new TreeMap(map);

    System.out.println(treeMap);
    treeMap.put("L",10);
    treeMap.put("D",100);
    treeMap.put("K",1200);
    System.out.println(treeMap);

  }
}