

public class SumOfNum {

  public static int sum(int... values) {
    int sum = 0;
    for(int val: values) {
      sum += val;
    }
    return sum;
  }
  public static void main(String[] args) {
    System.out.println(sum(1,2,3,4,5));
    System.out.println(sum(1,2,4,5));
  }
}