package Principal;

import java.awt.EventQueue;

public class Main {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
					frame.setVisible(true);
					frame.setSize(500,500);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
