package grafica;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class TabGroupSearch extends JTabbedPane{

	private static final long serialVersionUID = 1L;
	protected JLabel Nome = new JLabel ("Nome");
	protected JLabel Tipologia = new JLabel ("Tipologia");
	protected JTextField campo_nome = new JTextField ();
	protected JTextField campo_tipo = new JTextField ();
	protected JButton cerca = new JButton ("Cerca");
	protected JButton iscriviti = new JButton ("Iscriviti");

	public TabGroupSearch (final Container c){
		setLayout(new BorderLayout());
		
		//pannello coi parametri della ricerca
		JPanel p1 = new JPanel();
		p1.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.insets = new Insets(10,50,0,0);
		p1.add(Nome, gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.insets = new Insets(10,50,0,100);
		p1.add(campo_nome, gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.insets = new Insets(50,50,0,0);
		p1.add(Tipologia, gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.insets = new Insets(10,50,0,100);
		p1.add(campo_tipo, gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.insets = new Insets(100,50,0,100);
		p1.add(cerca, gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.insets = new Insets(10,10,0,0);
		p1.add(new JLabel("Lista risultati"), gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.gridx = 1;
		gbc.gridy = 4;
		gbc.insets = new Insets(100,10,0,100);
		p1.add(iscriviti, gbc);
		
		//posizionamento pannelli
		add(p1,BorderLayout.NORTH);
		c.setSize(600,250);
		c.setSize(600,250);
		c.setLocationRelativeTo(null);
		c.setVisible(true);
	}
}
