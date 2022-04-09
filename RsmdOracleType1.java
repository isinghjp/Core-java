import java.sql.*;
import java.util.*;
public class RsmdOracleType1
{
	public static void main(String args[])
	{
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbd:oracle:thin:@localhost:1521:xe","system","tiger");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from employee");
		ResultSetMetaData rsmd=rs.getMetaData();
		int count=rsmd.getColumnCount();
		System.out.println(count);
		for(int i=1; i<=count; i++)
		{
			System.out.println(rsmd.getColumnName(i));
			System.out.println(rsmd.getColumnType(i));
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