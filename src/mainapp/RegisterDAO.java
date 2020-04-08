package mainapp;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.border.EmptyBorder;

public class RegisterDAO {
	public void addUser(Register register) throws ClassNotFoundException, SQLException {
		String firstname=register.getFirstname();
		String lastname=register.getLastname();
		String username=register.getUsername();
		String password=register.getPassword();
		String email=register.getEmail();
		ConnecctionManager cm=new ConnecctionManager();
		
		String sql="insert into USERDETAILS(FIRSTNAME,LASTNAME,USERNAME,PASSWORD,EMAIL)VALUES(?,?,?,?,?)";
		PreparedStatement st=cm.getConnection().prepareStatement(sql);
		
		st.setString(1, firstname);
		st.setString(2, lastname);
		st.setString(3, username);
		st.setString(4, password);
		st.setString(5, email);
		
		st.executeUpdate();
		cm.getConnection().close();
	}
}
