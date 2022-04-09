//import java.sun.jdbc.odbc.*;
import java.sql.*;
import java.util.*;
class ConwithAccess

  {
    public static void main(String arg[])
     {
       try
         {
           //First way    
       
          Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");  
          Connection c=DriverManager.getConnection("Jdbc:Odbc:sun");
        //Second way

         // DriverManager.registerDriver(new sun.jdbc.odbc.JdbcOdbcDriver());
         // Connection c=DriverManager.getConnection("jdbc:odbc:mydsn3");
         
       //Third way
        /*   Driver d=new sun.jdbc.odbc.JdbcOdbcDriver();
           Connection c=d.connect("jdbc:odbc:Mydsn",new Properties());
         */
      //fourth way
           
         /*  System.setProperty("jdbc.Drivers","sun.jdbc.odbc.jdbcodbcDriver");
            Properties p=new Properties();
              // p.put("user name ","System");
              // p.put("password","061395614");
           Connection c=DriverManager.getConnection("jdbc:odbc:Mydsn",p);   
          */
           Statement s=c.createStatement();
           //insert into Table1    
           ResultSet rs=s.executeQuery("select *from emp8") ;
          // System.out.println(rs.next());
           while(rs.next())
             {
               System.out.println("e_id  "+rs.getString(1) +" name  "+rs.getString(2) );  
                 
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
