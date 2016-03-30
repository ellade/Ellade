package grafica;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;import java.awt.Insets;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class TabProfile extends JTabbedPane{

	private static final long serialVersionUID = 1L;
	protected JLabel username = new JLabel ("qua username utente");
	protected JLabel email = new JLabel ("qua email utente");
	protected JLabel n_gruppi = new JLabel ("qua n_gruppi");
	protected JLabel data = new JLabel ("qua data");
	
	protected JButton nuovo_gruppo = new JButton ("Nuovo gruppo");

	public TabProfile (final Container c){
		setLayout(new BorderLayout());
		
		//pannello in alto
		JPanel p1 = new JPanel();
		p1.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.insets = new Insets(10,50,0,0);
		p1.add(username, gbc);

		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.insets = new Insets(10,50,0,0);
		p1.add(email, gbc);

		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.insets = new Insets(10,50,0,0);
		p1.add(n_gruppi, gbc);

		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.insets = new Insets(10,50,0,0);
		p1.add(data, gbc);

		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 5;
		gbc.gridy = 1;
		gbc.insets = new Insets(10,50,0,0);
		p1.add(nuovo_gruppo, gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.insets = new Insets(100,50,0,0);
		p1.add(new JLabel("Lista gruppi utente e caratteristiche"), gbc);
		
		//posizionamento pannelli
		this.add(p1,BorderLayout.NORTH);
		c.setSize(600,250);
		c.setSize(600,250);
		c.setLocationRelativeTo(null);
		c.setVisible(true);
		
		//ASCOLTATORI BOTTONI
				nuovo_gruppo.addMouseListener(new MouseAdapter(){
					public void mouseClicked(MouseEvent e) {
						//da cambiare l'invocazione di grouppanel, messa per prova
						c.getContentPane().removeAll();
						c.getContentPane().add(new GroupPanel(c));
					}
				});
				nuovo_gruppo.addKeyListener(new KeyAdapter(){
					public void keyPressed(KeyEvent e){
						if (e.getKeyCode()==KeyEvent.VK_ENTER){
							//da cambiare l'invocazione di grouppanel, messa per prova
							c.getContentPane().removeAll();
							c.getContentPane().add(new GroupPanel(c));
						}
					}
				});
		
	}
}
