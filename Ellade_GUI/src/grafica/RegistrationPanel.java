package grafica;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class RegistrationPanel extends JPanel{

	private static final long serialVersionUID = 1L;
	protected JLabel titolo = new JLabel ("Registrazione",JLabel.CENTER);
	protected JLabel l1 = new JLabel ("Username",JLabel.CENTER);
	protected JLabel l2 = new JLabel ("Password",JLabel.CENTER);
	protected JLabel l3 = new JLabel ("E-mail",JLabel.CENTER);
	protected JTextField username = new JTextField("", 20);
	protected JTextField password = new JPasswordField("", 20);
	protected JTextField email = new JTextField("", 20);
	protected JLabel avviso = new JLabel("Tutti i campi sono obbligatori",JLabel.CENTER);
	protected JLabel errore = new JLabel("Campi non validi",JLabel.CENTER);
	protected JButton indietro = new JButton("Indietro");
	protected JButton conferma = new JButton("Conferma");

	public RegistrationPanel (final Container c){
		
		titolo.setFont(new Font ("Dialog", Font.BOLD, 16));
		//COSTRUZIONE PANNELLO CENTRALE
		JPanel p1 = new JPanel();
		p1.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.insets = new Insets(10,0,0,0);
		p1.add(l1, gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.insets = new Insets(0,120,0,120);
		p1.add(username,gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.insets = new Insets(10,0,0,0);
		p1.add(l2,gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.insets = new Insets(0,120,0,120);
		p1.add(password,gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 0;
		gbc.gridy = 5;
		gbc.insets = new Insets(10,0,0,0);
		p1.add(l3,gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 0;
		gbc.gridy = 6;
		gbc.insets = new Insets(0,120,0,120);
		p1.add(email,gbc);
		
		//COSTRUZIONE PANNELLO IN BASSO
		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(1,3));
		p2.add(indietro);
		p2.add(new JLabel());
		p2.add(conferma);
		
		//COSTRUZIONE FINESTRA
		setLayout(new BorderLayout());
		add(titolo,BorderLayout.NORTH);
		add(p1,BorderLayout.CENTER);
		add(p2,BorderLayout.SOUTH);
		
		c.setSize(600,250);
		c.setSize(600,250);
		c.setLocationRelativeTo(null);
		c.setVisible(true);
		
		
		//ASCOLTATORI BOTTONI
		indietro.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e) {
				c.getContentPane().removeAll();
				c.getContentPane().add(new StartingPanel(c));
			}
		});
		indietro.addKeyListener(new KeyAdapter(){
			public void keyPressed(KeyEvent e){
				if (e.getKeyCode()==KeyEvent.VK_ENTER){
					c.getContentPane().removeAll();
					c.getContentPane().add(new StartingPanel(c));
				}
			}
		});
		conferma.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e) {
				//INVIARE RICHIESTA E GESTIRLA!!!!!!!!!!!!!!!!!!!!!!!!!!!
				
			}
		});
		conferma.addKeyListener(new KeyAdapter(){
			public void keyPressed(KeyEvent e){
				if (e.getKeyCode()==KeyEvent.VK_ENTER){
					//INVIARE RICHIESTA E GESTIRLA!!!!!!!!!!!!!!!!!!!!!!!!
					
				}
			}
		});
	}
}
