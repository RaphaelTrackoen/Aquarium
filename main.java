package com.raphtr.sim;

import javax.swing.JFrame;

public class main {

	public static JFrame fenetre;//Create a window
	public static Scene scene;//create the scene
	public static void main() {


		fenetre = new JFrame("Simulateur Aquarium");//instance de la fenetre
		scene = new Scene();//instance de la scene
		
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setSize(1280, 720);// window's resolution
		fenetre.setLocationRelativeTo(null);// center the window on launch
		fenetre.setResizable(false);
		
		fenetre.setContentPane(scene);
		fenetre.setVisible(true);
		
	}

}
