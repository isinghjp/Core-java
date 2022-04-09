import java.sql.*;
import java.util.*;
class ConwithSql

  {
    public static void main(String arg[])
     {
       try
         {
           //First way    
       
           Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");  
           Connection c=DriverManager.getConnection("Jdbc:Odbc:Sdsn2");      
           Statement s=c.createStatement();
          
           ResultSet rs=s.executeQuery("select * from student") ;
           System.out.println(rs.next());
           while(rs.next())
             {
               System.out.println("e_id  "+rs.getString(1) +" Sname  "+rs.getString(2) );  
                 
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




      //Second way
/*
          DriverManager.registerDriver(new sun.jdbc.odbc.JdbcOdbcDriver());
          Connection c=DriverManager.getConnection("jdbc:odbc:Sdsn");
  */       
       //Third way
        /*   Driver d=new sun.jdbc.odbc.JdbcOdbcDriver();
           Connection c=d.connect("jdbc:odbc:Sdsn",new Properties());
         */
      //fourth way
           
         /*  System.setProperty("jdbc.Drivers","sun.jdbc.odbc.jdbcodbcDriver");
            Properties p=new Properties();
              // p.put("user name ","System");
              // p.put("password","061395614");
           Connection c=DriverManager.getConnection("jdbc:odbc:Mydsn",p);   
          */
         
  