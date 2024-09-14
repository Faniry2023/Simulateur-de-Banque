package controller.gestionnaire;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import dao.Gestionnaire.AuthentificationDao;
import dao.Gestionnaire.ListeClientDao;
import modele.Gestionnaire.UserModele;
import pointEntrer.FenetreViews;
import views.modeGestionnaire.AuthentificationGestionnaireViews;

public class AuthentificationGestionnaireController implements ActionListener{
	AuthentificationGestionnaireViews authentificationGestionnaireViews;
	public AuthentificationGestionnaireController(AuthentificationGestionnaireViews authentificationGestionnaireViews) {
		this.authentificationGestionnaireViews = authentificationGestionnaireViews;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source  = e.getSource();
		FenetreViews fenetre = new FenetreViews();
		UserModele user = new UserModele();
		AuthentificationDao auth = new AuthentificationDao();
		if(source == authentificationGestionnaireViews.btnAnnuler) {
			authentificationGestionnaireViews.textFieldEmail.setText("");
			authentificationGestionnaireViews.passwordField.setText("");
		}
		if(source == authentificationGestionnaireViews.btnRetoure) {
			fenetre.bienvenue();
			this.authentificationGestionnaireViews.setVisible(false);
		}if(source == authentificationGestionnaireViews.btnConnecter) {
			String email = authentificationGestionnaireViews.textFieldEmail.getText();
			String mdp = authentificationGestionnaireViews.passwordField.getText();
			user.setEmail(email);
			user.setMdp(mdp);
			boolean validation = false;
			try {
				validation = auth.verifUser(user);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			if(validation) {
				ListeClientDao gestionnaire = new ListeClientDao();
				this.authentificationGestionnaireViews.setVisible(false);
				try {
					gestionnaire.liste();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				};
			}else {
				JOptionPane.showMessageDialog(null, "Mot de passe ou E-mail incorrecte", "erreur Se connecter",JOptionPane.ERROR_MESSAGE);
			}
		}
		if(source == authentificationGestionnaireViews.chckbxMdp) {
			if(authentificationGestionnaireViews.chckbxMdp.isSelected()) {
				authentificationGestionnaireViews.passwordField.setEchoChar((char) 0);
			}else {
				authentificationGestionnaireViews.passwordField.setEchoChar('•');
			}
		}
		
	}

}
