import java.sql.*;
import java.util.*;

public class Type3
{
	public static void main(String args[])
	{
		try
		{
			Driver d=new sun.jdbc.odbc.JdbcOdbcDriver();
			Connection c=d.connect("jdbc:odbc:jai",new Properties());  //msaccess
			//Connection c=DriverManager.getConnection("jdbc:odbc:jayp", "system", "tiger",newProperties());  //for oracle
			Statement stmt=c.createStatement();
			ResultSet rs=stmt.executeQuery("Select * from test");
			while(rs.next())
			{
				System.out.println(" "+rs.getString(1)+" "+rs.getString(2));
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}