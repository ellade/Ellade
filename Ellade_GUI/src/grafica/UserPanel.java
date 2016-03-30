package grafica;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class UserPanel extends JPanel{
	private static final long serialVersionUID = 1L;
	protected JLabel l1 = new JLabel ("Questo è userpanel_prova",JLabel.CENTER);
	protected JButton esci = new JButton("LOGOUT");
	protected JButton cancellazione = new JButton("Cancellati");

	public UserPanel (final Container c){
		
		setLayout(new BorderLayout());
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(1,10));
		p1.add(new JLabel());
		p1.add(new JLabel());
		p1.add(new JLabel());
		p1.add(new JLabel());
		p1.add(new JLabel());
		p1.add(new JLabel());
		p1.add(new JLabel());
		p1.add(new JLabel());
		p1.add(new JLabel());
		p1.add(esci);
		
		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(1,10));
		p2.add(new JLabel());
		p2.add(new JLabel());
		p2.add(new JLabel());
		p2.add(new JLabel());
		p2.add(new JLabel());
		p2.add(new JLabel());
		p2.add(new JLabel());
		p2.add(new JLabel());
		p2.add(new JLabel());
		p2.add(cancellazione);
		
		add(p1,BorderLayout.NORTH);
		add(new TabUserPanel(c),BorderLayout.CENTER);
		add(p2,BorderLayout.SOUTH);
		
		c.setSize(1000,450);
		c.setSize(1000,450);
		c.setLocationRelativeTo(null);
		c.setVisible(true);
	
		esci.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Sicuro di volerti disconnettere?", "Logout", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)== JOptionPane.YES_OPTION){
					c.getContentPane().removeAll();
					c.getContentPane().add(new StartingPanel(c));
				}
			}
		});
		esci.addKeyListener(new KeyAdapter(){
			public void keyPressed(KeyEvent e){
				if (e.getKeyCode()==KeyEvent.VK_ENTER){
					if(JOptionPane.showConfirmDialog(null, "Sicuro di volerti disconnettere?", "LogOut", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)== JOptionPane.YES_OPTION){
						c.getContentPane().removeAll();
						c.getContentPane().add(new StartingPanel(c));
					}
				}
			}
		});
	}
	
}
