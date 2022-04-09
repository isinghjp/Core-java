import java.sql.*;
import java.util.*;
class DataBaseMetaData
  {
    public static void main(String arg[])
     {
       try
         {
          
          Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");  
          Connection c=DriverManager.getConnection("Jdbc:odbc:DBMDdsn","System","061395614");
          DatabaseMetaData dbmd=c.getMetaData();
             System.out.println(dbmd.getDriverName());
             System.out.println(dbmd.getUserName());
            //System.out.println(dbmd.getPassword());  
          ResultSet rs=dbmd.getTables(null,null,null,new String[]{"Table"});
           while(rs.next())        
             {
              //System.out.println(rs.getString(1));              
             // System.out.println(rs.getString(2));
              System.out.println(rs.getString(3)); 
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
