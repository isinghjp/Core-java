import java.sql.*;

public class JdbcFirst
{
	public static void main(String args[])
	{
		try
		{	
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","tiger");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("Select * from Author");
			while(rs.next())
			{
				//System.out.println(" "+rs.getString(1)+" "+rs.getString(2))+" "+rs.getString(3)+" "+rs.getString(4));
				
				String empid=rs.getString("AU_ID");

				String ename=rs.getString("AU_NAME");
				String eadd=rs.getString("AU_ADD");
				String econtact=rs.getString("PHONE");

				System.out.print(empid);
				System.out.print("\t" +ename);
				System.out.print("\t" +eadd);
				System.out.print("\t" +econtact);
				System.out.println();
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}