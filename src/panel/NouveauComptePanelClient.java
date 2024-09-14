package panel;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class NouveauComptePanelClient extends JPanel{

	public void paintComponent(Graphics graph) {
		graph.setColor(getForeground().WHITE);
		graph.draw3DRect(20, 20, 60, 60, isForegroundSet());
		try {
			Image img = ImageIO.read(new File("D:\\Projet JAVA S4\\WinForm\\ApplicationBanquaire\\img\\charge.png"));
			graph.drawImage(img,0, 0, 600, 900, this);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		graph.setColor(getForeground().WHITE);
		graph.draw3DRect(200, 50, 200, 160, isForegroundSet());
	}
}
