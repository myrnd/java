import java.util.Map;
import java.util.TreeMap;


public class Demo7 {
  public static void main(String[] args) {

    TreeMap<String,Integer> treeMap = new TreeMap<>();

    treeMap.put("f",25);
    treeMap.put("z",5);
    treeMap.put("l",250);
    treeMap.put("a",15);
    treeMap.put("b",25);
    treeMap.put("g",25);

    System.out.println(treeMap);
    System.out.println(treeMap.higherKey("b"));   //return key greater than given key
    System.out.println(treeMap.higherKey("c"));
    System.out.println(treeMap.ceilingKey("b"));    //return key greater equal to given key
    System.out.println(treeMap.lowerKey("b"));   //return key less than given key
    System.out.println(treeMap.floorKey("b"));   //return key less equal to given key
    System.out.println(treeMap.firstEntry());   //return first entry
    System.out.println(treeMap.lastEntry());    //return last entry
    System.out.println(treeMap.subMap("b","z"));    //return value between given value which is inculsive in left side only
  }
}