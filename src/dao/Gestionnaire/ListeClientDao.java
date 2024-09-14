package dao.Gestionnaire;

import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.ResultSetMetaData;

import common.AccesBdd;
import views.modeGestionnaire.GestionnaireViews;

public class ListeClientDao {
	public void liste() throws SQLException{
		GestionnaireViews affi = new GestionnaireViews();
		TotalSolde t = new TotalSolde();
		affi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		affi.setSize(1000,600);
		affi.setResizable(false);
		affi.setLocationRelativeTo(null);
		affi.lblNon.setText(t.nom());
		affi.textFieldNbClient.setText(t.nbClient() + "");
		affi.textFieldTotalSolde.setText(t.toutsSolde() + "");
		affi.textFieldCourant.setText(t.soldeCourant() + " Ariary");
		affi.textFieldEpargne.setText(t.soldeEpargne() + " Ariary");
		affi.setVisible(true);
		String sql = "SELECT * FROM client";
		AccesBdd acces = new AccesBdd();
		acces.loadDriver();
		ResultSet resultat = (ResultSet) acces.executeSelect(sql);
		ResultSetMetaData rsm = (ResultSetMetaData) resultat.getMetaData();
		int c = rsm.getColumnCount();
		DefaultTableModel df = (DefaultTableModel) affi.table.getModel();
		while(resultat.next()){
			Vector v2 = new Vector();
			for(int i = 0; i <= c; i++){
				v2.add(resultat.getString("compte"));
				v2.add(resultat.getString("nom"));
				v2.add(resultat.getString("prenom"));
				v2.add(resultat.getInt("cin"));
				v2.add(resultat.getString("adresse"));
				v2.add(resultat.getInt("tel"));
			}
			df.addRow(v2);
		}
		acces.closeConnection();	
		//return validation
	}
}
