package mainapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

public class Main {
public static void main(String []args) throws NumberFormatException,IOException, ClassNotFoundException, SQLException{
	System.out.println("1)Register");
	System.out.println("2)Login");
	System.out.println("Enter your choice?");
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int x=Integer.parseInt(br.readLine());
	Register register =new Register();
	RegisterDAO dao=new RegisterDAO();
	LoginPojo pojo=new LoginPojo();
	LoginDAO logindao=new LoginDAO();
	switch(x)
	{
	case 1:
		System.out.println("Enter the first name");
		String firstname=br.readLine();
		System.out.println("Enter the last name");
		String lastname=br.readLine();
		System.out.println("Enter the username");
		String username=br.readLine();
		System.out.println("Enter the password");
		String password=br.readLine();
		System.out.println("Enter the email");
		String email=br.readLine();
		register.setEmail(email);
		register.setFirstname(firstname);
		register.setLastname(lastname);
		register.setPassword(password);
		register.setUsername(username);
		dao.addUser(register);
		break;
	case 2:
		System.out.println("Enter the username");
		String name=br.readLine();
		System.out.println("Enter the password");
		String pass=br.readLine();
		pojo.setUsername(name);
		pojo.setPassword(pass);
		
		if(logindao.validate(pojo)==true) {
			Luck luck=new Luck();
			luck.display();
		}
		
		
		
		break;
	}
}
}
