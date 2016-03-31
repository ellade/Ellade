package common;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.ResultSet;

public interface GroupManagement extends Remote {
 
	//metodo per creare un gruppo
		public int creaGruppo(String nome, String tipo)throws RemoteException;
		
		//metodo per ricercare gruppo
		public ResultSet ricercaGruppo(String nome, String tipo) throws RemoteException;
		
		//metodo per iscriversi a un gruppo
		public int iscrizioneGruppo(String utente,String nomegruppo,String tipogruppo) throws RemoteException;
		
		//metodo per accesso a gruppo
		public int accessoGruppo(String utente,String nomegruppo,String tipogruppo) throws RemoteException;
}
