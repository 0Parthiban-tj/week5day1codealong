package mainapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnecctionManager {
	public Connection getConnection() throws  SQLException, ClassNotFoundException{
		
		//Register the driver class
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = null;
		//con=DriverManager.getConnection("jdbc:oraclethin@localhost:1521:orcl","SYSTEM","07oct1998");
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl","system","07oct1998");
		if(con!=null)
			System.out.println("Established");
		return con;
	}

}
