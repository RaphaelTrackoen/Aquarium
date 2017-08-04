package com.raphtr.sim;

import java.awt.Graphics;
import java.awt.Image;

	import javax.swing.ImageIcon;
	import javax.swing.JPanel;

public class Scene extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//variables
	private ImageIcon icoBackgroundDay;
	private ImageIcon icoBackgroundNight;
	private Image imgBackgoundNight;
	private Image imgBackgroundDay;
	
	private final int widthBackground = 1024;
	

	
	//constructor 
	public Scene() {
		
	
		this.icoBackgroundDay = new ImageIcon(getClass().getResource("/images/backgroundDay.jpg"));
		this.imgBackgroundDay = this.icoBackgroundDay.getImage();
		this.icoBackgroundNight = new ImageIcon(getClass().getResource("/images/backgroundNight.jpg"));
		this.imgBackgoundNight = this.icoBackgroundNight.getImage();
		
		
	}
	
	//Methods
	public void paintComponent(Graphics g) {
		while (true) 
		{
			
			if (Chrono.getHour() > 7 && Chrono.getHour() < 20) {
				g.drawImage(this.imgBackgroundDay, 0, 0, null);
			}
			
			else if (Chrono.getHour() > 20 && Chrono.getHour() < 7) {
			 
				g.drawImage(this.imgBackgoundNight, 0, 0, null);
			 }
				
		}
			
				
	}

	public int getWidthBackground() {
		return widthBackground;
	}
	
}
