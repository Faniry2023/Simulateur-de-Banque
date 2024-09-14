package panel;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ModifPanel extends JPanel{
	public void paintComponent(Graphics g) {
		try {
			Image img = ImageIO.read(new File("D:\\Projet JAVA S4\\WinForm\\ApplicationBanquaire\\img\\5.png"));
			g.drawImage(img,0, 0, 400, 700,  this);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}	
