package cameraModifier;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import pointEntrer.FenetreViews;

public class CameraController implements ActionListener{
	Camera camera;
	public CameraController(Camera camera) {
		this.camera = camera;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object s = e.getSource();
		FenetreViews f = new FenetreViews();
		if(s == camera.btnAnnuler) {
			f.modifier(camera.lblCompte.getText(),null, null, null, null, null, null, null, null);
		}
	}

}
