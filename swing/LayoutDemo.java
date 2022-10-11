import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Container;
// import java.awt.*;

public class LayoutDemo {

  LayoutDemo(String title) {
    /*=============================
      JFrame Setup
    ===============================*/
    JFrame frame = new JFrame();
    frame.setTitle(title);
    frame.setSize(700,600);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);

    /*=============================
      Creating Components 
    ===============================*/
    JButton btn1 = new JButton("Button1");
    JButton btn2 = new JButton("Button2");
    JButton btn3 = new JButton("Button3");
    JButton btn4 = new JButton("Button4");
    JButton btn5 = new JButton("Button4");
    JButton btn6 = new JButton("Button6");
    JButton btn7 = new JButton("Button7");
    JButton btn8 = new JButton("Button8");
    JButton btn9 = new JButton("Button9");
    JButton btn10 = new JButton("Button10");
    JButton btn11 = new JButton("Button11");

    Container mainContainer = frame.getContentPane();
    mainContainer.setLayout(new BorderLayout(8,6))
    mainContainer.setBackground(Color.YELLOW);

    /*=============================
      Adding Components in JFrame
    ===============================*/
    
  }

  public static void main(String[] args) {
    new LayoutDemo("My Custome Layout");
  }
}