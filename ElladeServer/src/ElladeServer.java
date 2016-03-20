import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import common.AccountingUser;

public class ElladeServer extends UnicastRemoteObject implements AccountingUser {

	
	private Connection connection=null;
	public ElladeServer()throws Exception {
		super();
		 String driverName = "com.mysql.jdbc.Driver";
		    Class.forName(driverName);

		    String serverName = "localhost";
		    String mydatabase = "ssd";
		    String url = "jdbc:mysql://" + serverName + "/" + mydatabase; 

		    String username = "root";
		    String password = "";
		    connection= DriverManager.getConnection(url, username, password);
		    
		   
		    
	}
	
	@Override
	public int SignUp(String username, String email, String password) throws RemoteException {
		// TODO Auto-generated method stub
		
		try {
			//creo statement
			Statement st=connection.createStatement();
			//creazione query
			st.executeUpdate("INSERT INTO `utente` VALUES ('"+username+"','"+password+"','"+email+"');");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		return 0;
	}

	@Override
	public int Login(String username, String password) throws RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}

}
