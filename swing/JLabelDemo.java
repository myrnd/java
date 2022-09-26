import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

import java.awt.Color;
import java.awt.Font;

public class JFrameDemo {

  public static void main(String[] args) {

    JFrame frame = new JFrame();  
    JLabel label = new JLabel();    //create a label

    ImageIcon image = new ImageIcon("logo.png"); 
    Border border = new BorderFactory.createLineBorder(Color.green,3);

    label.setText("Hello World");   //set text of label
    label.setIcon(image); 
    label.setHorizontalTextPosition(JLabel.CENTER);   //set text LEFT,CENTER, RIGHT of imageicon
    label.setVerticalTextPosition(JLabel.TOP);    //set text TOP,CENTER,BOTTOM of imageicon
    label.setForeground(Color.green);   //set color of text
    label.setFont(new Font("MV Boli",Font.PLAIN,20));   //set font of text
    label.setIconTextGap(100);    //set gap of text to image
    label.setBackground(Color.black);   //set background color
    label.setOpaque(true);    //display background color
    label.setBorder(border);

    frame.setTitle("JLabel Demo");     
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
    frame.setResizable(false);    
    frame.setSize(420,420);  
    frame.setVisible(true);     

    frame.getContentPane().setBackground(new Color(0xf1f5f9));  
    frame.add(label);
  }
}