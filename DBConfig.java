
package jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class DBConfig {

  private static final String DB_DRIVER="org.h2.Driver";
  private static final String DB_URL="jdbc:h2:tcp://localhost/~/jdbctest";
  private static final String DB_USERNAME="sa";
  private static final String DB_PASSWORD="";
  private static Connection con=null;
  private static Statement stmt=null;
  
  
  private static void openConnection()throws Exception{
     Class.forName(DB_DRIVER);
      con=DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
      stmt=con.createStatement();
  }
  
  public static boolean executeUpdate(String sql)throws Exception{
      openConnection();
      int x=stmt.executeUpdate(sql);
      
      if(x>=0){
          return true;
      }
      else{
          return false;
      }
  }
  public static ResultSet executeQuery(String sql)throws Exception{
      openConnection();
    ResultSet rs=stmt.executeQuery(sql);
      
    
          return rs;
   
  }
  
  public static void closeAll()throws Exception{
      stmt.close();
      con.close();
  }
    
    
}
