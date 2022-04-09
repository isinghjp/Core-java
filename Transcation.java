import java.sql.*;
import java.util.*;

public class Transcation
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con=DriverManager.getConnection("jdbc:odbc:jayp","system","tiger");
			Statement stmt=con.createStatement();
			con.setAutoCommit(false);
			int x=stmt.executeUpdate("Update employee set name='shanti' where emp_id=106");
			//con.commit();
			ResultSet rs=stmt.executeQuery("select * from employee");
			while(rs.next())
			{
				System.out.println("E_id"+rs.getString(1)+"name"+rs.getString(2)+"desi"+rs.getString(3)+"dept"+rs.getString(4));
			}
			System.out.println();
			con.rollback();
			ResultSet rs1=stmt.executeQuery("select * from employee");
			while(rs1.next())
			{
				System.out.println("E_id"+rs.getString(1)+"name"+rs.getString(2)+"desi"+rs.getString(3)+"dept"+rs.getString(4));
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		catch(Exception e1)
		{
			System.out.println(e1);
		}
	}
}