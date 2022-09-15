import java.util.Arrays;

public class MultipleArgs {

  public static void print(int... values) {
    System.out.println(Arrays.toString(values));
    // for(int val: values) {
    //   System.out.println(val);
    // }
  };

  public static void main(String[] args) {

    print(1,2,3,4);
    print(1,2,3);
    print(1,2);
  }
}