import java.rmi.Naming;
import java.rmi.RMISecurityManager;

import common.AccountingUser;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.setSecurityManager(new RMISecurityManager());
			AccountingUser srv = (AccountingUser) Naming.lookup("//localhost/ElladeServer");
			srv.SignUp("bella", "prova", "");
			}
			catch(Exception e){
				e.printStackTrace();
			}
	}

}
