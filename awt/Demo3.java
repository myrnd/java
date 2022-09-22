import java.awt.*;
import java.awt.event.*;

public class Demo3 implements ActionListener {

  Demo3() {
    Frame frame = new Frame();    //creating frame

    Label label = new Label("Name");    //creating a label

    TextField textField = new TextField();    //creating a textfield

    Button btn = new Button("Submit");    //creating button

    //register listener
    btn.addActionListener(this);    

    //setting position of the components in the frame

    label.setBounds(20,80,80,30);
    textField.setBounds(20,100,80,30);
    btn.setBounds(100,100,80,30);

    //adding components into frame

    frame.add(label);
    frame.add(textField);
    frame.add(btn);

    frame.setSize(400,400);    //frame size

    frame.setTitle("Student Info");   //setting the title of frame
    frame.setLayout(null);    //default layout
    frame.setVisible(true);     //setting visibility
  }
  public void actionPerformed(ActionEvent ev) {
    System.out.println("Hello");
    // System.out.println(textField.getText().toString());
  }
  public static void main(String[] args) {
    Demo3 obj = new Demo3();
  }
  
}