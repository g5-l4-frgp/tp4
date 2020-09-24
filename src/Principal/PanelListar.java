package Principal;

import javax.swing.JPanel;
import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import java.awt.Font;

public class PanelListar extends JPanel {
	
	
	private JList<Peliculas> Jlist;
	private DefaultListModel<Peliculas> listmodel1;

	public PanelListar() {
		setLayout(null);
		listmodel1=new DefaultListModel<Peliculas>();
		Jlist = new JList();
		Jlist.setBounds(100, 33, 316, 225);
		add(Jlist);
		
		JLabel lblPeliculas = new JLabel("Peliculas");
		lblPeliculas.setFont(new Font("Arial", Font.BOLD, 14));
		lblPeliculas.setBounds(29, 127, 74, 14);
		add(lblPeliculas);
		
		

	}
	
	public void setDefaultListModel (DefaultListModel<Peliculas> listmodel2) {
		
		this.listmodel1=listmodel2;
		Jlist.setModel(listmodel1);
	
}
}
