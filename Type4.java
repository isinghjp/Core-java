import java.sql.*;

public class Type4
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","tiger");
			//Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			//Connection con=DriverManager.getConnection("jdbc:odbc:jayp", "system", "tiger");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("Select * from emp");
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