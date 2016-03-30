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
import javax.swing.JTextField;

public class EventCreationPanel extends JPanel{

	private static final long serialVersionUID = 1L;
	protected JLabel titolo = new JLabel ("Nuovo evento",JLabel.CENTER);
	protected JLabel nome = new JLabel ("NOME",JLabel.CENTER);
	protected JLabel tipologia = new JLabel ("TIPOLOGIA",JLabel.CENTER);
	protected JLabel data = new JLabel ("DATA",JLabel.CENTER);
	protected JLabel ora = new JLabel ("ORA",JLabel.CENTER);
	protected JLabel luogo = new JLabel ("LUOGO",JLabel.CENTER);
	protected JLabel descrizione = new JLabel("Descrizione",JLabel.CENTER);
	protected JTextField campo_nome = new JTextField ();
	protected JTextField campo_tipologia = new JTextField ();
	protected JTextField campo_data = new JTextField ();
	protected JTextField campo_ora = new JTextField ();
	protected JTextField campo_luogo = new JTextField ();
	protected JTextField campo_descrizione = new JTextField();
	protected JButton crea_evento = new JButton("CREA EVENTO");
	protected JButton indietro = new JButton("Indietro");
	
	public EventCreationPanel (final Container c){
		
		titolo.setFont(new Font ("Dialog", Font.BOLD, 16));
		//CREAZIONE PANNELLO PRINCIPALE
		JPanel p1 = new JPanel();
		p1.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 0;
		gbc.gridy = 0;
		//gbc.insets = new Insets(0,0,0,0);
		p1.add(nome, gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 1;
		gbc.gridy = 0;
		//gbc.insets = new Insets(0,0,0,0);
		p1.add(luogo, gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 2;
		gbc.gridy = 0;
		//gbc.insets = new Insets(0,0,0,0);
		p1.add(descrizione, gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.insets = new Insets(0,20,0,20);
		p1.add(campo_nome, gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.insets = new Insets(0,10,0,10);
		p1.add(campo_luogo, gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 2;
		gbc.gridy = 1;
		gbc.insets = new Insets(0,20,0,20);
		p1.add(campo_descrizione, gbc);//alto più colonne
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.insets = new Insets(10,0,0,0);
		p1.add(tipologia, gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.insets = new Insets(0,20,0,20);
		p1.add(campo_tipologia, gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.insets = new Insets(10,0,0,0);
		p1.add(data, gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 0;
		gbc.gridy = 5;
		gbc.insets = new Insets(0,20,0,20);
		p1.add(campo_data, gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 0;
		gbc.gridy = 6;
		gbc.insets = new Insets(10,0,0,0);
		p1.add(ora, gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 0;
		gbc.gridy = 7;
		gbc.insets = new Insets(0,20,0,20);
		p1.add(campo_ora, gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 1;
		gbc.gridy = 8;
		gbc.insets = new Insets(10,0,10,0);
		p1.add(crea_evento, gbc);//grande 3 caselle coi margini
		
		//CREAZIONE PANNELLO IN BASSO
		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(1,3));
		p2.add(indietro);
		p2.add(new JLabel());
		p2.add(new JLabel());
		
		//COSTRUZIONE FINESTRA
		setLayout(new BorderLayout());
		c.add(titolo,BorderLayout.NORTH);
		c.add(p1,BorderLayout.CENTER);
		c.add(p2,BorderLayout.SOUTH);

		c.setSize(1000,500);
		c.setSize(1000,500);
		c.setLocationRelativeTo(null);
		c.setVisible(true);
		
		crea_evento.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e) {
				//GESTIONE CREAZIONE EVENTO
				System.out.println("Query per creare evento");
			}
		});
		crea_evento.addKeyListener(new KeyAdapter(){
			public void keyPressed(KeyEvent e){
				if (e.getKeyCode()==KeyEvent.VK_ENTER){
					//GESTIONE CREAZIONE EVENTO
					System.out.println("Query per creare evento");
				}
			}
		});
		indietro.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e) {
				c.getContentPane().removeAll();
				c.getContentPane().add(new GroupPanel(c));
			}
		});
		indietro.addKeyListener(new KeyAdapter(){
			public void keyPressed(KeyEvent e){
				if (e.getKeyCode()==KeyEvent.VK_ENTER){
					c.getContentPane().removeAll();
					c.getContentPane().add(new GroupPanel(c));
				}
			}
		});
		
	}
}
