public class Demo1 {

  public static void main(String[] args) {

    MyCustomList<String> list = new MyCustomList();
    list.addEl("Element1");
    list.addEl("Element2");

    MyCustomList<Integer> list2 = new MyCustomList();

    list2.addEl(Integer.valueOf(5));
    list2.addEl(Integer.valueOf(7));

    System.out.println(list);
    System.out.println(list2);
    System.out.println(list.get(0));
    System.out.println(list2.get(1));

  }

}