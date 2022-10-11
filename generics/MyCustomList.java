import java.util.ArrayList;

public class MyCustomList<TYPE> {
  ArrayList<TYPE> list = new ArrayList();

  public void addEl(TYPE ele) {
    list.add(ele);
  }

  public void removeEl(TYPE ele) {
    list.remove(ele);
  }

  public String toString() {
    return list.toString();
  }

  public TYPE get(int index) {
    return list.get(index);
  }
}
