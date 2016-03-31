package ENGINE;
import java.rmi.Naming;
import java.rmi.RMISecurityManager;

import common.AccountingUser;
import common.GroupManagement;

public class Main {

public static void main(String[] args) {
		
		 try {
			System.setSecurityManager(new RMISecurityManager());
			AccountingUser srv = (AccountingUser) Naming.lookup("//localhost/ElladeServer");
			//gestire il valore di ritorno
			//srv.SignUp("Esempio", "esempio@esempio.com", "prova");
			srv.Login("Esempio","prova" );
			GroupManagement grp= (GroupManagement) Naming.lookup("//localhost/ElladeServer");
			
			grp.creaGruppo("nuovo", "tipo nuovo");
			}
			catch(Exception e){
				e.printStackTrace();
			}
	}
	

}
