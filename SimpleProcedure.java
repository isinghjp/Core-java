import java.sql.*;
public class SimpleProcedure
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","tiger");
			CallableStatement cstmt=con.prepareCall("{call p5}");
			cstmt.executeUpdate();
			System.out.println("done");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}