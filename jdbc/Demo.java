import java.sql.*;
public class Demo {

  public static void main(String[] args) {
    try {
      String databaseURL = "jdbc:ucanaccess://Database1.accdb";
      Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
      // Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
      Connection connection = DriverManager.getConnection(databaseURL);

      System.out.println("Connected to MS Access Database");

      Statement st = connection.createStatement();
      ResultSet rs = st.executeQuery("Select * from Employee");

      while(rs.next()) {
        System.out.println(rs.getString(2));
      }

      connection.close();

    } catch (Exception ee) {
      System.out.println(ee);
    }
  }
}