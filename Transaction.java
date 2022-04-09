import java.sql.*;
import java.util.*;
class Transaction
  {
    public static void main(String arg[])
     {
       try
         {
          
          Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");  
          Connection c=DriverManager.getConnection("Jdbc:odbc:Transactiondsn","System","061395614");
          Statement s=c.createStatement();
          c.setAutoCommit(false);
          int x=s.executeUpdate("Update emp3 set name='raju' where eid=102");
           
    //c.commit();
          ResultSet rs=s.executeQuery("select * from emp3") ;
          while(rs.next())   
             {
              System.out.println("eid  "+rs.getInt(1) +" name  "+rs.getString(2));              
             }
        System.out.println();          
     c.rollback();    
        ResultSet rs1=s.executeQuery("select * from emp3") ;
         while(rs1.next())   
           {
             System.out.println("eid  "+rs1.getInt(1) +" name  "+rs1.getString(2));              
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
