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

public class GroupChangePanel extends JPanel{

	private static final long serialVersionUID = 1L;
	protected JLabel titolo = new JLabel("Modifica gruppo",JLabel.CENTER);
	
	protected JLabel nome = new JLabel("Nome");
	protected JLabel tipo = new JLabel("Tipo");
	protected JLabel n_iscritti = new JLabel("N° iscritti");
	protected JLabel amministratore = new JLabel("Amministratore");
	protected JTextField c_nome = new JTextField();
	protected JTextField c_tipo = new JTextField();
	protected JTextField c_n_iscritti = new JTextField();
	protected JTextField c_amministratore = new JTextField();
	
	protected JButton modifica_gruppo = new JButton("Modifica gruppo");
	protected JButton lista_iscritti = new JButton("Lista iscritti");
	protected JButton crea_evento = new JButton("Crea evento");
	protected JButton storico = new JButton("Storico eventi");
	
	protected JButton cp = new JButton("Ricerca partecipanti");
	protected JTextField campo_cp = new JTextField();
	protected JButton ce = new JButton("Ricerca evento");
	protected JTextField campo_ce = new JTextField();
	protected JButton elimina_evento = new JButton("Elimina evento");
	protected JButton elimina_partecipante = new JButton("Elimina partecipante");
	
	protected JButton indietro = new JButton("Indietro"); 
	protected JButton conferma = new JButton("Conferma"); 
	
	public GroupChangePanel(final Container c){
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
		p1.add(c_nome, gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.insets = new Insets(0,0,0,0);
		p1.add(c_tipo, gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 3;
		gbc.gridy = 0;
		gbc.insets = new Insets(0,0,0,0);
		p1.add(n_iscritti, gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 3;
		gbc.gridy = 1;
		gbc.insets = new Insets(0,0,0,0);
		p1.add(amministratore, gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 4;
		gbc.gridy = 0;
		gbc.insets = new Insets(0,0,0,0);
		p1.add(c_n_iscritti, gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 4;
		gbc.gridy = 1;
		gbc.insets = new Insets(0,0,0,0);
		p1.add(c_amministratore, gbc);
		
		
		//ricerca nella linea centrale 
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.insets = new Insets(50,0,0,0);
		p1.add(ce, gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 1;
		gbc.gridy = 2;
		gbc.insets = new Insets(50,0,0,0);
		p1.add(campo_ce, gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 3;
		gbc.gridy = 2;
		gbc.insets = new Insets(50,0,0,0);
		p1.add(cp, gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 4;
		gbc.gridy = 2;
		gbc.insets = new Insets(50,0,0,0);
		p1.add(campo_cp, gbc);
		
		//liste centrali
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.insets = new Insets(20,0,0,0);
		p1.add(new JLabel("Lista eventi futuri e passati"), gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 2;
		gbc.gridy = 3;
		gbc.insets = new Insets(20,0,0,0);
		p1.add(elimina_evento, gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 3;
		gbc.gridy = 3;
		gbc.insets = new Insets(20,0,0,0);
		p1.add(new JLabel("Lista partecipanti"), gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 5;
		gbc.gridy = 3;
		gbc.insets = new Insets(20,0,0,0);
		p1.add(elimina_partecipante, gbc);
		
		//linea in basso
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 0;
		gbc.gridy = 5;
		gbc.insets = new Insets(50,0,0,0);
		p1.add(indietro, gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 5;
		gbc.gridy = 5;
		gbc.insets = new Insets(50,0,0,0);
		p1.add(conferma, gbc);
		
		c.add(titolo,BorderLayout.NORTH);
		c.add(p1,BorderLayout.CENTER);
		c.setSize(1000,500);
		c.setSize(1000,500);
		c.setLocationRelativeTo(null);
		c.setVisible(true);
		
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
