import java.sql.*;

public class DeleteRecord
{
	public static void main(String args[])	
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","tiger");
			Statement stmt=con.createStatement();
			stmt.execute("delete Author");
			System.out.println("One row delete");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}