import java.sql.*;

public class Type2
{
	public static void main(String args[])
	{
		try
		{
			//Class.forName(sun.jdbc.odbc.JdbcOdbcDriver());
			DriverManager.registerDriver(new sun.jdbc.odbc.JdbcOdbcDriver());
			//Connection c=DriverManager.getConnection("jdbc:odbc:jai");  //msaccess
			Connection c=DriverManager.getConnection("jdbc:odbc:jayp", "system", "tiger");  //for oracle
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