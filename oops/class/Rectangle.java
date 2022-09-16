
public class Rectangle {

  //state
  public int length;
  public int width;

  //creation
  public Rectangle(int length, int width) {
    this.length = length;
    this.width = width;
  }

  //operation
  public String print() {
    return String.format("Length = %d, Width = %d",length, width);
  }

  public int getLength() {
    return length;
  }

  public void setLength(int length) {
    this.length = length;
  }
  public int getWidth() {
    return width;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public int area() {
    return length * width;
  }

  public int perimeter() {
    return 2 * (length + width);
  }

  public static void main(String[] args) {
    Rectangle rectangle = new Rectangle(5,10);

    System.out.println(rectangle.print());

    rectangle.setLength(100);    
    System.out.println(rectangle.getLength());
    System.out.println("Area : " + rectangle.area());
    System.out.println("Perimeter : " + rectangle.perimeter());
  }
}