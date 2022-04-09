import java.sql.*;

class DeleteTable
{
	static public void main(String arg[])
	{
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","tiger");
			Statement st = con.createStatement();
			st.execute("Drop table Author");
			System.out.println("Table Deleted");
		}
		catch(Exception ex)
		{
			System.out.print("Exception :"+ex);
		}
	}
}