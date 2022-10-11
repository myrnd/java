import javax.swing.*;
import java.awt.event.*;

public class Demo1 implements ActionListener {

  Demo1() {
    JFrame frame = new JFrame();
    JButton btn = new JButton("click");
    // JButton btn = new JButton();
    JRadioButton radiobtn1 = new JRadioButton("A");
    JRadioButton radiobtn2 = new JRadioButton("B");

    //register listener  
    btn.addActionListener(this);    //passing outer class instance  

    btn.setBounds(130,100,100,40);
    radiobtn1.setBounds(140,130,40,40);
    radiobtn2.setBounds(180,140,40,40);

    ButtonGroup btnGroup = new ButtonGroup();
    btnGroup.add(radiobtn1);
    btnGroup.add(radiobtn2);

    frame.add(btn);
    frame.add(radiobtn1);
    frame.add(radiobtn2);

    frame.setSize(400,400);
    frame.setLayout(null);
    frame.setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    System.out.println("hii");
  }

  public static void main(String[] args) {
    // System.out.println("Hello World");
    new Demo1();
  }
}

