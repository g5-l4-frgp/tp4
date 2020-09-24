package Principal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;
	private DefaultListModel <Peliculas> ListModel;

	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.WHITE);
		setJMenuBar(menuBar);
		
		JMenu mnPeliculas = new JMenu("Peliculas");
		mnPeliculas.setFont(new Font("Segoe UI", Font.BOLD, 12));
		mnPeliculas.setBackground(Color.GRAY);
		menuBar.add(mnPeliculas);
		
		ListModel= new DefaultListModel<Peliculas>();
		
		JMenuItem mntmAgregar = new JMenuItem("Agregar");
		mntmAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();
				PanelAgregar agregar = new PanelAgregar();
				
				agregar.setListModel(ListModel);
				contentPane.add(agregar);
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		mnPeliculas.add(mntmAgregar);
		
		JMenuItem mntmListar = new JMenuItem("Listar");
		mntmListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();
				PanelListar listar =  new PanelListar(); 
				listar.setDefaultListModel(ListModel);
				
				contentPane.add(listar);
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		mnPeliculas.add(mntmListar);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
