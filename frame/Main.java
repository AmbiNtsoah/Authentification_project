package frame;

import java.awt.EventQueue;

public class Main {
	/** 
	 * Classe qui contient permet d'afficher l'interface utilisateur
	 * Classe qui gère comment les fonctionnalités s'éxécute
	 * */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frames frame = new Frames();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
