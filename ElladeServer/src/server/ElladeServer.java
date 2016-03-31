package server;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;

import common.*;;


public class ElladeServer extends UnicastRemoteObject implements AccountingUser, GroupManagement {

	
	private Connection connection=null;
	public ElladeServer()throws Exception {
		super();
		 String driverName = "com.mysql.jdbc.Driver";
		    Class.forName(driverName);

		    String serverName = "localhost";
		    String mydatabase = "db_ellade";
		    String url = "jdbc:mysql://" + serverName + "/" + mydatabase; 

		    String username = "root";
		    String password = "";
		    connection= DriverManager.getConnection(url, username, password);
		    
		   
		    
	}
	
	@Override
	public int SignUp(String username, String email, String password) throws RemoteException {
		try {
			//creo statement
			Statement st=connection.createStatement();
			//creazione query
			st.executeUpdate("INSERT INTO `utente` VALUES ('"+username+"','"+email+"','"+password+"');");
			return 0;
		} catch (Exception e) {
			e.printStackTrace();
			return 1;
		}
		
		
		
		
	}

	@Override
	public int Login(String username, String password) throws RemoteException {
		try {
			PreparedStatement st=(PreparedStatement) connection.prepareStatement(
				 "SELECT COUNT(*) "
				 + "FROM utente "
				 + "WHERE username=? AND password=?");
			st.setString(1, username);
			st.setString(2, password);
			ResultSet rs=st.executeQuery();
			
			rs.next();
			
			//System.out.println(rs.getInt(1));
			
			if(rs.getInt(1)==1)
				return 0;
			else
				return 1;

		} catch (SQLException e) {
			
			e.printStackTrace();
			return 2;
		}
		
	}

	@Override
	public int creaGruppo(String nome, String tipo) throws RemoteException {
		try {
			PreparedStatement st= (PreparedStatement) connection.prepareStatement(
					"INSERT INTO `gruppo` (`idgruppo`, `nome`, `tipologia`, `amministratore_gruppo`)"
					+ " VALUES (NULL, ?, ?, ?)");
					
			st.setString(1, nome);
			st.setString(2, tipo);
			st.setString(3, "bella");
			
			st.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public ResultSet ricercaGruppo(String nome, String tipo) throws RemoteException {
	
		return null;
	}

	@Override
	public int iscrizioneGruppo(String utente, String nomegruppo, String tipogruppo) throws RemoteException {
		
		return 0;
	}

	@Override
	public int accessoGruppo(String utente, String nomegruppo, String tipogruppo) throws RemoteException {
		
		return 0;
	}

}
