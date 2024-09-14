package panel;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ClientPanel extends JPanel{
	public void paintComponent(Graphics g) {
		//Fond General
		try {
			Image img = ImageIO.read(new File("D:\\Projet JAVA S4\\WinForm\\ApplicationBanquaire\\img\\fondClient.png"));
			g.drawImage(img, 0, 0, 1200, 750, this);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Cadre du premier partier
		g.setColor(getBackground().GRAY);
		g.fillRoundRect(0, -2, 305, 720, 20, 20);
		
		//souligner de l'Agence
		int x = 35;
		int x2 = 265;
		int y = 330;
		g.setColor(getBackground().WHITE);
		g.drawLine(x, y, x2, y);
		
		//Logo de notre icone OURBANK
		try {
			Image img = ImageIO.read(new File("D:\\Projet JAVA S4\\WinForm\\ApplicationBanquaire\\img\\logoBank.png"));
			g.drawImage(img, -160, -230, 600, 790, this);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		//Cadre photo d'identiter du client
		g.drawRoundRect(340, 20, 280, 240, 30, 30);;
		
		g.setColor(getBackground().WHITE);
		g.fillRoundRect(340, 290, 290, 20, 20, 20);
		
		int xp = 360;
		int xp2 = 600;
		int yp = 260;
		g.setColor(getBackground().WHITE);
		g.drawLine(xp, yp, xp2, yp);
	
		int xpp = 360;
		int xpp2 = 600;
		int ypp = 660;
		g.setColor(getBackground().WHITE);
		g.drawLine(xpp, ypp, xpp2, ypp);
	
		try {
			Image img = ImageIO.read(new File("D:\\Projet JAVA S4\\WinForm\\ApplicationBanquaire\\img\\gmail.png"));
			g.drawImage(img, 680, 685, 20, 20, this);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Image img = ImageIO.read(new File("D:\\Projet JAVA S4\\WinForm\\ApplicationBanquaire\\img\\whatsapp.png"));
			g.drawImage(img, 860, 685, 20, 20, this);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Image img = ImageIO.read(new File("D:\\Projet JAVA S4\\WinForm\\ApplicationBanquaire\\img\\facebook.png"));
			g.drawImage(img, 990, 688, 15, 15, this);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
