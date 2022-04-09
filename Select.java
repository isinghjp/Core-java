import java.sql.*;

public class Select
{
	
	public static void main(String args[])
	{
		try{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con =DriverManager.getConnection("jdbc:odbc:jayp","system","tiger");
		String query = "select * from employee";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);

		while(rs.next())
		{
			String id;
			String name;
			String desi;
			String dept;
	
			id=rs.getString("emp_id");
			name=rs.getString("name");
			desi=rs.getString("desi");
			dept=rs.getString("dept");
		

			System.out.print(id);
			System.out.print("\t"+name);
			System.out.print("\t"+desi);	
			System.out.print("\t"+dept);
			System.out.println();	
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
	}
}