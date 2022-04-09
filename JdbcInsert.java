import java.sql.*;
public class JdbcInsert
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","tiger");
			Statement stmt=con.createStatement();
			stmt.executeUpdate("insert into Author values('103','Sweety Kumari','Panta','994555421')");
			System.out.println("One row inserted");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}