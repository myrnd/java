import java.sql.*;
import javax.swing.JFrame;  
import javax.swing.JTable;
import java.util.Vector;

class Demo2 {  
  private JFrame frame;
  private JTable table;

  Demo2(Vector<Vector> data,Vector column) {
    frame = new JFrame();
    table = new JTable(data, column);

    table.setBounds(40,20,400,300);

    frame.add(table);
    frame.setSize(500,400);
    frame.setLayout(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
	public static void main(String args[]) {
    Vector<String> cities = new Vector();  
    Vector<Integer> ids = new Vector();  
		try {  
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila","root","Anhr@3112");  
			Statement statement = connection.createStatement();  
			ResultSet res = statement.executeQuery("select * from city where city_id < 10");        
			while(res.next()) { 
        ids.add(res.getInt(1));
        cities.add(res.getString(2));
				// System.out.println(res.getInt(1) + "  " + res.getString(2));  
			}
      // System.out.println(ids);
      // System.out.println(cities);
			connection.close(); 

		} catch(Exception e) { 
      System.out.println(e);
    }  

    Vector<String> column = new Vector();
    column.add("City ID");
    column.add("City Name");

    Vector<Vector> rowData = new Vector();
    rowData.add(ids);
    rowData.add(cities);

    System.out.println(rowData);
    Demo2 obj = new Demo2(rowData,column);

    obj.frame.setVisible(true);

	}  
}  