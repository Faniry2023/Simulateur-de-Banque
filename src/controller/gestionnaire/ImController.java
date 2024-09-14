package controller.gestionnaire;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import views.modeGestionnaire.ImageViews;

public class ImController implements ActionListener{
	ImageViews imageViews;
	public ImController(ImageViews imageViews) {
		this.imageViews = imageViews;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object s = e.getSource();
		if(s == imageViews.btnFermer) {
			this.imageViews.setVisible(false);
		}
		
	}

}
