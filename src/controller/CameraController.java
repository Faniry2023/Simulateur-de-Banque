package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import camera.Camera;
import pointEntrer.FenetreViews;

public class CameraController implements ActionListener{
	Camera camera;
	public CameraController(Camera camera) {
		this.camera = camera;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		FenetreViews fenetre = new FenetreViews();
		if(source == camera.btnAnnuler) {
			this.camera.setVisible(false);
			String compte = this.camera.lblCompte.getText();
			fenetre.nvcompte(compte, null, null);
		}
		
	}

}
