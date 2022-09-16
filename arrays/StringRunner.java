
public class StringRunner {

  public static void main(String[] args) {
    String[] daysOfWeek = { "Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday" };

    String dayWithMostChar = "";
    for(String day: daysOfWeek) {
      if(day.length() > dayWithMostChar.length()) {
        dayWithMostChar = day;
      }
    }
    System.out.println("Day with most number of char " + dayWithMostChar);
    
    System.out.println(daysOfWeek.length);

    for(int i = daysOfWeek.length - 1; i >= 0; i--) {
      System.out.println(daysOfWeek[i]);
    }
  }
}