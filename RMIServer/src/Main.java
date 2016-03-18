import java.rmi.Naming;
import java.rmi.RMISecurityManager;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setSecurityManager(new RMISecurityManager());
		try{
			
		MyServer srv= new MyServer("Server");
		
		Naming.rebind("Server",srv);
		
		System.out.println("Oggetto server  registrato.");
		}
		catch (Exception e){
			System.out.println(e.getMessage());
		}
	}

}
