package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import pointEntrer.FenetreViews;
import views.BienvenueViews;

public class BienvenueController implements ActionListener{
	BienvenueViews bienvenueViews;
	public BienvenueController(BienvenueViews bienvenueViews) {
		this.bienvenueViews = bienvenueViews;
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		Object sourceEvenement = event.getSource();
		FenetreViews fenetre = new FenetreViews();	 
		if(sourceEvenement == bienvenueViews.btnClient) {
			this.bienvenueViews.setVisible(false);
			fenetre.authentificationClient();
		}
		if(sourceEvenement == bienvenueViews.btnGestionnaire) {
			this.bienvenueViews.setVisible(false);
			fenetre.authentificationGestionnaire();
		}
		if(sourceEvenement == bienvenueViews.btnQuitter) {
			System.exit(0);
		}
	}

}
