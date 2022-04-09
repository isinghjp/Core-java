import java.sql.*;

class UpdateSelect
{
	static public void main(String arg[])
	{
		
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con = DriverManager.getConnection("jdbc:odbc:jayp","system","tiger");
			Statement st = con.createStatement();
			int count = st.executeUpdate("update employee set desi= 'COO' where emp_id = '105'");
			System.out.println("1 row inserted");
		}
		catch(Exception ex)
		{
			System.out.print("Exception :"+ex);
		}
	
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con = DriverManager.getConnection("jdbc:odbc:jayp","system","tiger");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("Select * from  employee");
			
			while(rs.next())
			{
				String id = rs.getString("emp_id");
				String name = rs.getString("name");
				String desi= rs.getString("desi");
				String dept = rs.getString("dept");
			
				System.out.print(id+"\t\t");
				System.out.print(name+"\t");
				System.out.print(desi+"\t\t");
				System.out.print(dept);
				System.out.println();
			}
		}
		catch(Exception ex)
		{
			System.out.print("Exception :"+ex);
		}
	}
}