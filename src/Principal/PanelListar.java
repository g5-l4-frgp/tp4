package Principal;

import javax.swing.JPanel;
import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import java.awt.Font;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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
		
	    this.listmodel1=OrdenarLista(listmodel2);
		Jlist.setModel(listmodel1);
	
}

	private DefaultListModel<Peliculas> OrdenarLista(DefaultListModel<Peliculas> listmodel2) {
		
		ArrayList<Peliculas>lista=new ArrayList<Peliculas>();
		int index= listmodel2.size();
		for(int i=0;i<index;i++) {
			lista.add(listmodel2.get(i));
		}
		
		Collator comparador = Collator.getInstance();
		comparador.setStrength(Collator.PRIMARY);
		// Collections.sort(lista,(x, y) -> comparador.compare(x.getNombre(), y.getNombre()));
		Collections.sort(lista, new Comparator<Peliculas>() {
			   public int compare(Peliculas obj1, Peliculas obj2) {
			      return obj1.getNombre().compareTo(obj2.getNombre());
			   }
			});

		listmodel2.clear();
		for(Peliculas p:lista)
		{
		   listmodel2.addElement(p);
		}
		
		return listmodel2;
	}
}
