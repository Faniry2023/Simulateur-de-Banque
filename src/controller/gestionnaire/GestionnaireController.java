package controller.gestionnaire;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

import dao.Gestionnaire.ImageDao;
import dao.Gestionnaire.ListeClientDao;
import dao.Gestionnaire.SupprimerDao;
import pointEntrer.FenetreViews;
import views.modeGestionnaire.GestionnaireViews;

public class GestionnaireController implements ActionListener{
	GestionnaireViews gestionnaireViews;
	public GestionnaireController(GestionnaireViews gestionnaireViews) {
		this.gestionnaireViews = gestionnaireViews;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		FenetreViews fenetre = new FenetreViews(); 
		ListeClientDao afficherListe = new ListeClientDao();
		if(source == gestionnaireViews.btnSupprimer) {
			System.out.println("Boutton supprimer appuyer");
			SupprimerDao sup = new SupprimerDao();
			int a = gestionnaireViews.table.getSelectedRow();
			TableModel model = gestionnaireViews.table.getModel();
			boolean supval = false;
			int id = 0;
			try {
				id = Integer.parseInt(model.getValueAt(a, 0).toString());
				supval = true;
			}catch(ArrayIndexOutOfBoundsException h) {
				JOptionPane.showMessageDialog(null, "Veuillez selectionner un client", "Suppression client",JOptionPane.ERROR_MESSAGE);
			}
			if(supval) {
				boolean action = false, client = false, login = false;
				if(JOptionPane.showConfirmDialog(null, "Etes vous sur de supprimer ce client?", "Changement confidentialiter",JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION) {
					try {
						System.out.println("donné effacer");
						action = sup.supprimerAction(id);
						client = sup.supprimerClient(id);
						login = sup.supprimerLogin(id);
					}catch(Exception m) {}
					System.out.print("compte : " + id +"\naction : " + action + "\nclient : " + client + "\nlogin : " + login);
					if(action && client && login) {
					
							JOptionPane.showMessageDialog(null, "Suppresion d'un client effectuer", "Suppression client",JOptionPane.ERROR_MESSAGE);
						this.gestionnaireViews.setVisible(false);
						try {
							afficherListe.liste();
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				}
			}else {
				JOptionPane.showMessageDialog(null, "Suppresion d'un client \"ERREUR\"", "ERREUR",JOptionPane.ERROR_MESSAGE);
			}
		}
		if(source == gestionnaireViews.btnPhoto) {
			FenetreViews fen = new FenetreViews();
			ImageDao ima = new ImageDao();
			int a = gestionnaireViews.table.getSelectedRow();
			TableModel model = gestionnaireViews.table.getModel();
			int id = 0;
			boolean val = false;
			try {
				id = Integer.parseInt(model.getValueAt(a, 0).toString());
				val = true;
			}catch(ArrayIndexOutOfBoundsException m) {
				JOptionPane.showMessageDialog(null, "Veuillez selectionner un client pour voir son photo", "ERREUR",JOptionPane.ERROR_MESSAGE);
			}
			if(val) {
				System.out.println(id);
				try {
					fen.afficherImage(ima.image(id));
					System.out.println(ima.image(id));
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
		if(source == gestionnaireViews.btnRetour) {
			fenetre.authentificationGestionnaire();
			this.gestionnaireViews.setVisible(false);
		}
		
	}

}
