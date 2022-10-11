import javax.swing.JFrame;
import javax.swing.JTable;

public class TableDemo {
  private JFrame frame;
  private JTable table;

  TableDemo() {
    frame = new JFrame();

    String[][] data = {{"101","Amit","67000"},{"102","Sachin","3000"},{"103","Vishal","5000"}};

    String[] column = {"ID","NAME","SALARY"};

    System.out.println(column);

    table = new JTable(data,column);

    table.setBounds(30,40,200,300);

    frame.add(table);
    frame.setSize(300,400);
    frame.setLayout(null);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  }

  public static void main(String[] args) {
    new TableDemo();
  }
}