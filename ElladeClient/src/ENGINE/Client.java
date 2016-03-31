/*package ENGINE;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import common.AccountingUser;
import common.GroupManagement;
*/
/*
 * Questa classe implementa la logica lato client.
 * Una istanza di questa classe è un oggetto che mappa gli eventi effettuati sull'interfaccia grafica 
 * ai servizi remoti offerti dal server e gestisce inoltre il modello peer to peer della parte di condivisione dei materiali
 * 
 * */
/*
public class Client {
	//Interfacce per l'acceso ai servizi remoti del server
	public AccountingUser AUsrv;
	public	GroupManagement GMsrv;
	
	public Client(){
		try {
			//ottenimento dei servizi remoti.
			AUsrv=(AccountingUser) Naming.lookup("//localhost/ElladeServer");
			GMsrv=(GroupManagement) Naming.lookup("//localhost/ElladeServer");
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}
	public int creaGruppo(){
		return 0;
	}
}
*/