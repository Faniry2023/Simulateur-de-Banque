package panel;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class GestionnairePannel extends JPanel{
	public void paintComponent(Graphics g) {
		try {
			Image img = ImageIO.read(new File("D:\\Projet JAVA S4\\WinForm\\ApplicationBanquaire\\img\\fondClient.png"));
			g.drawImage(img, 0, 0, 1000, 600, this);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Image img = ImageIO.read(new File("D:\\Projet JAVA S4\\WinForm\\ApplicationBanquaire\\img\\logoBank.png"));
			g.drawImage(img, -160, -230, 600, 790, this);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
