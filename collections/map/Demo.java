import java.util.Map;

public class Demo {
  public static void main(String[] args) {
    Map<String,Integer> map = Map.of("id",1,"emp_id",101,"code",531);

    // map.put("test",11);    //not allowed because it's a immutable

    System.out.println(map);
    System.out.println("Size of map : " + map.size());
    System.out.println("IsEmpty : " + map.isEmpty());
    System.out.println("Value of id : " + map.get("id"));
    System.out.println(map.containsKey("id"));
    System.out.println(map.containsKey("id1"));
    System.out.println(map.containsValue(101));
    System.out.println(map.containsValue(144));
    System.out.println(map.get("id1"));
    System.out.println(map.keySet());
    System.out.println(map.values());
  }
}