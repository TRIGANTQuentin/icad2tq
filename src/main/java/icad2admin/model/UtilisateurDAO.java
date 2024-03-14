/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icad2admin.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author a.andissac
 */
public class UtilisateurDAO {

    private Connection connexion;

    public UtilisateurDAO() {
        this.connexion = MySQLConnection.getConnexion();
    }
   public Utilisateur create(Utilisateur unUtilisateur) {
        return null;
 
   }
//    public Utilisateurs get(Integer id) {
//        
//    }

    public List<Utilisateur> getAll() {

        List<Utilisateur> utilisateurs = new ArrayList<Utilisateur>();
        String query = "SELECT * FROM utilisateur";

        try {
            Statement statement = this.connexion.createStatement();
            ResultSet result = statement.executeQuery(query);
            while (result.next()) {
                int id = result.getInt("ID_USER");
                String nom = result.getString("NOM_USER");
                String prenom = result.getString("PRENOM_USER");
                String mdp = result.getString("MDP_USER");
                String email = result.getString("EMAIL_USER");
                String fonction = result.getString("FONCTION_USER");
                String adresse = result.getString("ADRESSE_USER");
                int tel = Integer.parseInt(result.getString("TELEPHONE_USER"));
                Utilisateur utilisateur = new Utilisateur(id, nom, prenom, mdp, email, fonction, adresse, tel);
                utilisateurs.add(utilisateur);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return utilisateurs;
    }
//    public void update(Utilisateurs unUtilisateur) {
//        
//    }
//    public void delete(Integer id) {
//        
//    }
//    public void delete(Utilisateurs unUtilisateur) {
//        
//    }
    
}
