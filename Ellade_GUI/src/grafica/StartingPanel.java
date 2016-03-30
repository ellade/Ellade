package grafica;

import java.awt.BorderLayout;
import java.awt.*;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class StartingPanel extends JPanel{
	
	private static final long serialVersionUID = 1L;
	private JPanel centerpanel;
	private JLabel welcome;
	private JLabel usr1;
	private JLabel passwd1;
	private JTextField usr;
	private JPasswordField passwd;
	private JButton go;
	private JButton register;
	
	
	public StartingPanel(final Container c){
		
		welcome = new JLabel("Benvenuto in Ellade",JLabel.CENTER);
		welcome.setFont(new Font ("Dialog", Font.BOLD, 16));
		
		usr1 = new JLabel ("Nome utente", JLabel.LEFT);
		usr1.setFont(new Font ("Times New Roman", Font.PLAIN, 16));
		passwd1 = new JLabel("Password", JLabel.LEFT);
		passwd1.setFont(new Font ("Times New Roman", Font.PLAIN, 16));;
		passwd = new JPasswordField("", 20);
		usr = new JTextField("", 20); 
		go = new JButton("LOGIN");
		register = new JButton("REGISTRATI");
		
		//COSTRUZIONE PANNELLO CENTRALE
		centerpanel = new JPanel();
		centerpanel.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.insets = new Insets(0,20,0,0);
		centerpanel.add(usr1, gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 1;
		gbc.gridy = 0;
		centerpanel.add(new JLabel(), gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.insets = new Insets(0,20,0,60);
		centerpanel.add(usr, gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.insets = new Insets(0,20,0,20);
		centerpanel.add(go, gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.insets = new Insets(10,20,0,0);
		centerpanel.add(passwd1, gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 1;
		gbc.gridy = 2;
		centerpanel.add(new JLabel(), gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.insets = new Insets(0,20,0,60);
		centerpanel.add(passwd, gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 1;
		gbc.gridy = 3;
		gbc.insets = new Insets(0,20,0,20);
		centerpanel.add(register, gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 0;
		gbc.gridy = 4;
		centerpanel.add(new JLabel(), gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 1;
		gbc.gridy = 4;
		centerpanel.add(new JLabel(), gbc);
		
		//COSTRUZIONE FINESTRA
		this.setLayout(new BorderLayout());
		this.add(welcome, BorderLayout.NORTH);
		this.add(centerpanel,BorderLayout.CENTER);
				
		//ASCOLTATORI BOTTONI
		register.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e) {
				c.getContentPane().removeAll();
				c.getContentPane().add(new RegistrationPanel(c));
			}
		});
		register.addKeyListener(new KeyAdapter(){
			public void keyPressed(KeyEvent e){
				if (e.getKeyCode()==KeyEvent.VK_ENTER){
					c.getContentPane().removeAll();
					c.getContentPane().add(new RegistrationPanel(c));
				}
			}
		});
		go.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e) {
				//CONTROLLARE CREDENZIALI, SE GIUSTE SI ESEGUONO LE 2 ISTRUZIONI SUCCESSIVE
				c.getContentPane().removeAll();
				c.getContentPane().add(new UserPanel(c));
			}
		});
		go.addKeyListener(new KeyAdapter(){
			public void keyPressed(KeyEvent e){
				if (e.getKeyCode()==KeyEvent.VK_ENTER){
					//CONTROLLARE CREDENZIALI, SE GIUSTE SI ESEGUONO LE 2 ISTRUZIONI SUCCESSIVE
					c.getContentPane().removeAll();
					c.getContentPane().add(new UserPanel(c));
				}
			}
		});

		
		c.setSize(500,200);
		c.setLocationRelativeTo(null);
		
	}

}