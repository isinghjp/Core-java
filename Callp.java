import java.sql.*;
import java.io.*;
class Callp
  {
    public static void main(String arg[]) 
     {
       try
         {
           class.forName("oracle.jdbc.driver.OracleDriver") ;
           Connection c=DriverManager.getConnection(jdbc:oracle:thin:@localhost:1521:xe","system","061395614");
           Statements s=c.createStatements();
           callableStatement cs=c.preparecall("{call reinsert(?,?)}");
            cs.setInt(1,101);
            cs.setString(2,"Ram");
          cs.executeUpdate();
         ResultSet rs=s.executeQuery("select * from emp12");
         while(rs.next())   
            {
              System.out.println("ei "+rs.getInt());
              System.out.println("name "+rs.getString());
            }
          }
        catch(SQLException e) 
          {
            e.printSackTrace();
           }
      }
  } 