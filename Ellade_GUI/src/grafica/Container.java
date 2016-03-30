package grafica;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Container extends JFrame{
	private static final long serialVersionUID = 1L;

	public Container(){
		
		setSize(800,450);
		setTitle("ELLADE");
		setLocationRelativeTo(null);
		//getContentPane().add(new StartingPanel(this));
		getContentPane().add(new EventPanel(this));
		setVisible(true);
		
		
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {	

				int n = JOptionPane.showConfirmDialog(null, "Sicuro di voler uscire?", "Uscire?", JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);

				if(n == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
	}
}
