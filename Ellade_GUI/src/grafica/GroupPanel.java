package grafica;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GroupPanel extends JPanel{

	private static final long serialVersionUID = 1L;
	protected JLabel titolo = new JLabel("Gestione gruppo",JLabel.CENTER);
	
	protected JLabel nome = new JLabel("Nome");
	protected JLabel tipo = new JLabel("Tipo");
	protected JLabel n_iscritti = new JLabel("N° iscritti");
	protected JLabel amministratore = new JLabel("Amministratore");
	
	protected JButton modifica_gruppo = new JButton("Modifica gruppo");
	protected JButton lista_iscritti = new JButton("Lista iscritti");
	protected JButton crea_evento = new JButton("Crea evento");
	protected JButton storico = new JButton("Storico eventi");
	
	protected JButton ces = new JButton("Ricerca evento storico");
	protected JTextField campo_ces = new JTextField();
	protected JButton cef = new JButton("Ricerca evento futuro");
	protected JTextField campo_cef = new JTextField();
	
	protected JButton eliminati = new JButton("Eliminati dal gruppo"); 
	
	public GroupPanel(final Container c){
		titolo.setFont(new Font ("Dialog", Font.BOLD, 16));
		setLayout(new BorderLayout());
		
		JPanel p1 = new JPanel();
		p1.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		
		//riquadro in alto a destra 
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.insets = new Insets(0,0,0,0);
		p1.add(nome, gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.insets = new Insets(0,0,0,0);
		p1.add(tipo, gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.insets = new Insets(0,0,0,0);
		p1.add(new JLabel("Inserire nome"), gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.insets = new Insets(0,0,0,0);
		p1.add(new JLabel("Inserire tipo"), gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 2;
		gbc.gridy = 0;
		gbc.insets = new Insets(0,0,0,0);
		p1.add(n_iscritti, gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 2;
		gbc.gridy = 1;
		gbc.insets = new Insets(0,0,0,0);
		p1.add(amministratore, gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 3;
		gbc.gridy = 0;
		gbc.insets = new Insets(0,0,0,0);
		p1.add(new JLabel("Inserire n_iscritti"), gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 3;
		gbc.gridy = 1;
		gbc.insets = new Insets(0,0,0,0);
		p1.add(new JLabel("Inserire amministratore"), gbc);
		
		//riquadro pulsanti in alto a sinistra
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 4;
		gbc.gridy = 0;
		gbc.insets = new Insets(0,0,0,0);
		p1.add(modifica_gruppo, gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 4;
		gbc.gridy = 1;
		gbc.insets = new Insets(0,0,0,0);
		p1.add(crea_evento, gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 5;
		gbc.gridy = 0;
		gbc.insets = new Insets(0,0,0,0);
		p1.add(lista_iscritti, gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 5;
		gbc.gridy = 1;
		gbc.insets = new Insets(0,0,0,0);
		p1.add(storico, gbc);
		
		//ricerca nella linea centrale 
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.insets = new Insets(50,0,0,0);
		p1.add(cef, gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 1;
		gbc.gridy = 2;
		gbc.insets = new Insets(50,0,0,0);
		p1.add(campo_cef, gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 3;
		gbc.gridy = 2;
		gbc.insets = new Insets(50,0,0,0);
		p1.add(ces, gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 4;
		gbc.gridy = 2;
		gbc.insets = new Insets(50,0,0,0);
		p1.add(campo_ces, gbc);
		
		//liste centrali
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.insets = new Insets(20,0,0,0);
		p1.add(new JLabel("Lista eventi futuri"), gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 3;
		gbc.gridy = 3;
		gbc.insets = new Insets(50,0,0,0);
		p1.add(new JLabel("Lista eventi a cui si è iscritti"), gbc);
		
		//linea in basso
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 5;
		gbc.gridy = 5;
		gbc.insets = new Insets(50,0,0,0);
		p1.add(eliminati, gbc);
		
		c.add(titolo,BorderLayout.NORTH);
		c.add(p1,BorderLayout.CENTER);
		c.setSize(1000,500);
		c.setLocationRelativeTo(null);
		c.setVisible(true);
		
		//ascoltatori bottoni
		modifica_gruppo.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e) {
					c.getContentPane().removeAll();
					c.getContentPane().add(new GroupChangePanel(c));
			}
		});
		modifica_gruppo.addKeyListener(new KeyAdapter(){
			public void keyPressed(KeyEvent e){
				if (e.getKeyCode()==KeyEvent.VK_ENTER){
						c.getContentPane().removeAll();
						c.getContentPane().add(new GroupChangePanel(c));
				}
			}
		});
		crea_evento.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e) {
					c.getContentPane().removeAll();
					c.getContentPane().add(new EventCreationPanel(c));
			}
		});
		crea_evento.addKeyListener(new KeyAdapter(){
			public void keyPressed(KeyEvent e){
				if (e.getKeyCode()==KeyEvent.VK_ENTER){
						c.getContentPane().removeAll();
						c.getContentPane().add(new EventCreationPanel(c));
				}
			}
		});
		
	}
	
}
