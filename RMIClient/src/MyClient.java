import java.rmi.Naming;
import java.rmi.RMISecurityManager;

public class MyClient {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String message="";
		String Server="//localhost/Server";
		
		try{
			System.setSecurityManager(new RMISecurityManager());
			
			//Una variabile interfaccia può contenere un oggetto che implementa quell'interfaccia e si
			//possono invocare i metodi da essa dichiarati.
			//in pratica si ottiene una variabile che contiene i metodi dichiarati nell'interfaccia implementati dall'oggetto
			//che gli stiamo assegnando.
			ServerInterface srv = (ServerInterface) Naming.lookup(Server);
			
			message=srv.sayHello();
			
			System.out.println(message);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

}
