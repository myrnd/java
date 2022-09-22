import java.awt.*;

class AwtDemo extends Frame {
  AwtDemo() {
    Button btn = new Button("Click me");
    Button btn = new Button("Click me");
    btn.setBounds(30,100,80,30);    //set position of button
    setSize(400,400);   //frame size
    setLayout(null);    //default layout
    setVisible(true);   
    add(btn);     //to add button in frame
  }

  public static void main(String[] args) {
    AwtDemo a1 = new AwtDemo();
  }
}