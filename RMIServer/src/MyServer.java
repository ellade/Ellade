import java.rmi.RemoteException;
import java.rmi.server.RMIClientSocketFactory;
import java.rmi.server.RMIServerSocketFactory;
import java.rmi.server.UnicastRemoteObject;

public class MyServer extends UnicastRemoteObject implements ServerInterface {
	
	private String name;
	
	public MyServer() throws RemoteException {
		// TODO Auto-generated constructor stub
		
	}

	public MyServer(int port) throws RemoteException {
		super(port);
		// TODO Auto-generated constructor stub
	}

	public MyServer(int port, RMIClientSocketFactory csf, RMIServerSocketFactory ssf) throws RemoteException {
		super(port, csf, ssf);
		// TODO Auto-generated constructor stub
	}
	
	public MyServer(String name)throws RemoteException{
		super();
		this.name=name;
	}
	@Override
	public String sayHello() throws RemoteException {
		// TODO Auto-generated method stub
		return "Hello World";
	}

}
