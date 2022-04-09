import java.sql.*;
import java.util.*;
class BatchFile
  {
    public static void main(String arg[])
     {
       try
         {
            
          Class.forName("oracle.jdbc.driver.OracleDriver");
	  Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","tiger");
          Statement st=con.createStatement();
        
           String s="update employee set name='ramesh' where id=104";
           String s1="insert into employee values(108,'ramu','Clerck','admin')";
           String s2="delete from employee where id=108";
        
           st.addBatch(s);
           st.addBatch(s1);
           st.addBatch(s2);
          
           st.executeBatch();
           ResultSet rs=st.executeQuery("select * from employee") ;
              while(rs.next())   
                {
               
                 System.out.println("Emp_id:"+rs.getInt(1) +" name  "+rs.getString(2)+"Desiganation"+rs.getString(3)+"Department"+rs.getString(4));              
                 }
           
         }
          catch(Exception e1)  
              {
		System.out.println(e1);              
                }
      }
  }  
