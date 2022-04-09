import java.sql.*;
import java.io.*;
class ConOracleType4
  {
    public static void main(String arg[])
      {
        try
         {
          /*
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","061395614");
          */
         
             DriverManager.registerDriver( new oracle.jdbc.driver.OracleDriver());
             Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","061395614");
          /*
            //3rd way not work
             Driver d=new oracle.jdbc.driver.OracleDriver();
             Properties p=new Properties();
             p.put("username","System");
             p.put("password","061395614"); 
             Connection c=d.connect("jdbc:oracle:thin:@localhost:1521:xe",p);
          */
            
           String t1="suresh";
            int t2=13000;
          /* Statement s=c.createStatement();
           s.executeUpdate("create table emp12(name varchar(20),salary number)");  
           s.close();
          */
           PreparedStatement ps=c.prepareStatement("insert into emp2 values(?,?)"); 
           ps.setString(1,t1);
           ps.setInt(2,t2);
           ps.executeUpdate();
           ps.close();
          
           ps=c.prepareStatement("select *from emp2"); 
           ResultSet rs=ps.executeQuery();
           while(rs.next())
             {
               System.out.println("name =="+rs.getString(1) +"  salary== "+rs.getInt(2));  
               System.out.println(); 
              }
          }catch(SQLException e)
           {
             e.printStackTrace();
            }
         catch(Exception e1)
           {
             System.out.println(e1);
           }
     }
  }   