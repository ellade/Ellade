package grafica;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class EventPanel extends JPanel{

	private static final long serialVersionUID = 1L;
	protected JLabel titolo = new JLabel("Gestione evento",JLabel.CENTER);
	
	protected JButton modifica_evento = new JButton("Modifica evento");
	protected JButton cancella_evento = new JButton("Cancella evento");
	protected JButton iscr_canc = new JButton("Iscriviti/cancellati");
	protected JLabel vota = new JLabel("Vota");
	protected JButton carica_materiali = new JButton("Carica materiali");
	protected JButton visualizza_materiali = new JButton("Visualizza materiali");
	
	public EventPanel(final Container c){
		titolo.setFont(new Font ("Dialog", Font.BOLD, 16));
		setLayout(new BorderLayout());
		
		JPanel p1 = new JPanel();
		p1.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		
		//riquadro
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.insets = new Insets(0,0,0,0);
		p1.add(new JLabel("Dati evento"), gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 3;
		gbc.gridy = 0;
		gbc.insets = new Insets(0,0,0,0);
		p1.add(modifica_evento, gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 4;
		gbc.gridy = 0;
		gbc.insets = new Insets(0,0,0,0);
		p1.add(cancella_evento, gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 3;
		gbc.gridy = 1;
		gbc.insets = new Insets(0,0,0,0);
		p1.add(iscr_canc, gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 4;
		gbc.gridy = 1;
		gbc.insets = new Insets(0,0,0,0);
		p1.add(vota, gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 3;
		gbc.gridy = 2;
		gbc.insets = new Insets(0,0,0,0);
		p1.add(carica_materiali, gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 4;
		gbc.gridy = 2;
		gbc.insets = new Insets(0,0,0,0);
		p1.add(visualizza_materiali, gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.insets = new Insets(0,0,0,0);
		p1.add(new JLabel("Lista partecipanti"), gbc);
		
		c.add(titolo,BorderLayout.NORTH);
		c.add(p1,BorderLayout.CENTER);
		c.setSize(900,300);
		c.setLocationRelativeTo(null);
		c.setVisible(true);
	}
}
