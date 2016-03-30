package grafica;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class TabUserPanel extends JTabbedPane{

	private static final long serialVersionUID = 1L;
	protected JLabel l1 = new JLabel ("Qua ci vuole il profilo",JLabel.CENTER);
	protected JLabel l2 = new JLabel ("Qua ci vuole la ricerca gruppi",JLabel.CENTER);

	public TabUserPanel (final Container c){
		
		//creazione tab
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		//nomina i tab e li piazza sul container
		addTab("Profilo", jp1);
		addTab("Ricerca Gruppi", jp2);
		
		//gui interna a tab1
		TabProfile tp = new TabProfile(c);
		jp1.setLayout(new BorderLayout());
		jp1.add(tp,BorderLayout.CENTER);
		
		//gui interna a tab2
		TabGroupSearch tgs = new TabGroupSearch(c);
		jp2.setLayout(new BorderLayout());
		jp2.add(tgs,BorderLayout.CENTER);

				

		c.setSize(800,450);
		c.setSize(800,450);
		c.setLocationRelativeTo(null);
		c.setVisible(true);
	}
}
