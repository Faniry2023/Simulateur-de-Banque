package panel;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class LoginPanelClient extends JPanel{
	public void paintComponent(Graphics g) {
		g.setColor(getBackground().DARK_GRAY);
		g.fill3DRect(0, 0, 300, 800, isBackgroundSet());
		g.setColor(getBackground().BLACK);
		g.fill3DRect(300, 0, 700, 800, isBackgroundSet());
		
		g.setColor(getBackground().LIGHT_GRAY);
		g.fillRoundRect(70, 220, 150, 150, 5, 15);
		
		try {
			Image img = ImageIO.read(new File("D:\\Projet JAVA S4\\WinForm\\ApplicationBanquaire\\img\\logoBank.png"));
			g.drawImage(img, -40, -150, 350, 550, this);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Image img = ImageIO.read(new File("D:\\Projet JAVA S4\\WinForm\\ApplicationBanquaire\\img\\client.png"));
			g.drawImage(img, 100, 250, 90, 90, this);
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Image img = ImageIO.read(new File("D:\\Projet JAVA S4\\WinForm\\ApplicationBanquaire\\img\\gmail.png"));
			g.drawImage(img, 10, 550, 20, 30, this);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Image img = ImageIO.read(new File("D:\\Projet JAVA S4\\WinForm\\ApplicationBanquaire\\img\\whatsapp.png"));
			g.drawImage(img, 10, 530, 20, 20, this);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Image img = ImageIO.read(new File("D:\\Projet JAVA S4\\WinForm\\ApplicationBanquaire\\img\\facebook.png"));
			g.drawImage(img, 10, 500, 20, 20, this);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Image img = ImageIO.read(new File("D:\\Projet JAVA S4\\WinForm\\ApplicationBanquaire\\img\\2.png"));
			g.drawImage(img, 300, 0, 800, 800, this);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		g.setColor(getBackground().WHITE);
		g.fillRoundRect(500, 62, 250, 20, 5, 15);
	}
}
