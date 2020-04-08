package mainapp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginDAO {

	public boolean validate(LoginPojo pojo) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String username=pojo.getUsername();
		String password=pojo.getPassword();
		
		ConnecctionManager con= new ConnecctionManager();
		Statement st=con.getConnection().createStatement();
		
		
		ResultSet rs=st.executeQuery("SELECT * from USERDETAILS");
		
		while(rs.next())
		{
			if(username.contentEquals(rs.getString("USERNAME")) && password.equals("PASSWORD"))
			{
				con.getConnection().close();
				return true;
			}
			else
				return false;	
		}
		return false;
		
	}
	
}
