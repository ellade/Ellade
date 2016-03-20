import java.rmi.Naming;
import java.rmi.RMISecurityManager;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.setSecurityManager(new RMISecurityManager());

			ElladeServer srv=new ElladeServer();
			
			//MODIFICA
		System.out.println("prova");
			Naming.rebind("ElladeServer", srv);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
