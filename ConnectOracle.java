import java.sql.*;
import java.util.*;
class ConnectOracle

  {
    public static void main(String arg[])
     {
       try
         {
           Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");  
           Connection c=DriverManager.getConnection("Jdbc:Odbc:Mydsn1","System","061395614");
           Statement s=c.createStatement();
           ResultSet rs=s.executeQuery("select * from emp") ;
           System.out.println(rs.next());
           while(rs.next())
             {
              
               System.out.println("e_id  "+rs.getString(1) +"name  "+rs.getString("name")+"  salary "+rs.getString(3) );  
                 
             }
           
          }
         catch(SQLException e) 
           {
             e.printStackTrace();
            }
         catch(Exception e1)  
              {
                }
      }
  }  
