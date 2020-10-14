package Principal;

import javax.swing.JPanel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JToggleButton;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IllegalFormatCodePointException;
import java.awt.event.ActionEvent;

public class PanelAgregar extends JPanel {
	private JTextField txtnombre;
	private JComboBox<Categorias> cmbgenero;
	private JButton btnAceptar ;
	private DefaultListModel<Peliculas>listModel;
	static int contador = 1;


	
	public PanelAgregar() {
		setLayout(null);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(75, 229, 128, 30);
		add(btnAceptar);
		
		txtnombre = new JTextField();
		txtnombre.setBounds(224, 127, 166, 20);
		add(txtnombre);
		txtnombre.setColumns(10);
		
		JLabel ID = new JLabel("ID");
		ID.setFont(new Font("Tahoma", Font.BOLD, 14));
		ID.setBounds(97, 89, 46, 14);
		add(ID);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNombre.setBounds(97, 126, 62, 17);
		add(lblNombre);
		
		JLabel lblGenero = new JLabel("Genero");
		lblGenero.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblGenero.setBounds(97, 167, 62, 17);
		add(lblGenero);
		
		JLabel lblNumerodeid = new JLabel(String.valueOf(contador));
		lblNumerodeid.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNumerodeid.setBounds(268, 89, 70, 14);
		add(lblNumerodeid);
		
	    cmbgenero = new JComboBox<Categorias>();
		cmbgenero.setBounds(224, 167, 166, 20);
		add(cmbgenero);
		cmbgenero.addItem(new Categorias(0,"Seleccione un genero"));
		cmbgenero.addItem(new Categorias(1,"Terror"));
		cmbgenero.addItem(new Categorias(2,"Accion"));
		cmbgenero.addItem(new Categorias(3,"Suspenso"));
		cmbgenero.addItem(new Categorias(4,"Romantica"));
		cmbgenero.addItem(new Categorias(5,"Thriller"));
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtnombre.setText(txtnombre.getText().replaceAll("^\\s*", ""));
				Peliculas peliculas = new Peliculas();
				if(!peliculas.ValidarPelicula(txtnombre.getText(), cmbgenero.getSelectedIndex())) {
					JOptionPane.showMessageDialog(null, "Debe Ingresar una pelicula y seleccionar un genero");
				}else {
					peliculas.setNombre(txtnombre.getText());
					peliculas.setCategorias(cmbgenero.getSelectedItem());
					listModel.addElement(peliculas);
					txtnombre.setText("");
					cmbgenero.setSelectedIndex(0);
					contador ++;
					lblNumerodeid.setText(String.valueOf(contador));
					
				}
				
			}

		}
		);
	}


	public void setListModel(DefaultListModel<Peliculas> listModel) {
		this.listModel = listModel;
	}

}
