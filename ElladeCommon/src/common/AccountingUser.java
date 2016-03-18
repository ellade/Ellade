package common;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface AccountingUser extends Remote {
	//metodo per la registrazione di un utente
	public int SignUp(String username, String email,String password) throws RemoteException;
	
	//metodo login utente
	public int Login(String username,String password) throws RemoteException;
}
