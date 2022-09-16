public class Fan {
  // state
  private String make;
  private double radius;
  private String color;
  private boolean isOn;
  private byte speed;   //0 to 5

  //creation

  public Fan(String make, double radius, String color) {
    this.make = make;
    this.radius = radius;
    this.color = color;
  }

  //print the state

  public String print() {
    return String.format("make - %s, radius - %f, color - %s, isOn - %b, speed - %d",
      make, radius, color, isOn, speed);
  } 

  public void switchOn() {
    this.isOn = true;
    setSpeed((byte)5);
  }

  public void switchOff() {
    this.isOn = false;
    setSpeed((byte)0);
  }

  public void setSpeed(byte speed) {
    this.speed = speed;
  }

  public static void main(String[] args) {
    Fan fan = new Fan("Toofan",0.4,"red");
    fan.switchOn();
    System.out.println(fan.print());

    fan.setSpeed((byte)3);
    System.out.println(fan.print());

    fan.switchOff();
    System.out.println(fan.print());
  }

}