import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import java.awt.Color;

public class JFrameDemo {

  public static void main(String[] args) {

    JFrame frame = new JFrame();    //create frame
    frame.setTitle("Crud");     //set title on frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //exit out of application
    frame.setResizable(false);    //disable resize
    frame.setSize(420,420);   //dimension of frame
    frame.setVisible(true);     //frame visibility

    ImageIcon image = new ImageIcon("logo.png");    //creates image icon
    frame.setIconImage(image.getImage());     //change icon of frame
    // frame.getContentPane().setBackground(Color.green);    //change color of background
    frame.getContentPane().setBackground(new Color(0xf1f5f9));    
  }
}