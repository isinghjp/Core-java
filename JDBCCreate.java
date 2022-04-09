import java.sql.*;

class JDBCCreate
{
	static public void main(String arg[])
	{
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","tiger");
			Statement st = con.createStatement();
			st.execute("create table Author(au_id varchar2(12),au_name varchar2(20),au_add varchar2(25),phone varchar2(12))");
			System.out.println("1 table Created");
		}
		catch(Exception ex)
		{
			System.out.print("Exception :"+ex);
		}
	}
}