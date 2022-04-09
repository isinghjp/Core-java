import java.sql.*;

public class Type1
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con=DriverManager.getConnection("jdbc:odbc:aap");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("Select * from emp");
			while(rs.next())
			{
			System.out.println("User Id  "+rs.getString(1)+"\t\tPassword "+rs.getString(2));
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}