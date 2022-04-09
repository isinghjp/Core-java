import java.sql.*;
public class RowUpdate
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","tiger");
			Statement stmt=con.createStatement();
			stmt.executeUpdate("update Author set AU_NAME='Jitendra' where AU_ID= '102'");
			System.out.println("One row updated");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}