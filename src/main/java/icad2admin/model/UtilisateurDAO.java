/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icad2admin.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
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

    public void insert(Utilisateur unUtilisateur) throws SQLException {
        String query = "INSERT INTO utilisateur(NOM_USER,PRENOM_USER,MDP_USER,EMAIL_USER,FONCTION_USER,ADRESSE_USER,TELEPHONE_USER) values(?,?,?,?,?,?,?)";
        PreparedStatement ps = connexion.prepareStatement(query);

        ps.setString(1, unUtilisateur.getNom());
        ps.setString(2, unUtilisateur.getPrenom());
        ps.setString(3, unUtilisateur.getMdp());
        ps.setString(4, unUtilisateur.getEmail());
        ps.setString(5, unUtilisateur.getFonction());
        ps.setString(6, unUtilisateur.getAdresse());
        ps.setString(7, unUtilisateur.getTel());

        ps.executeUpdate();

    }

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
                String tel = result.getString("TELEPHONE_USER");
                Utilisateur utilisateur = new Utilisateur(id, nom, prenom, mdp, email, fonction, adresse, tel);
                utilisateurs.add(utilisateur);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return utilisateurs;
    }

    public void update(Utilisateur unUtilisateur) throws SQLException {
        String query = "UPDATE utilisateur set NOM_USER = ?, PRENOM_USER = ? , MDP_USER = ? , EMAIL_USER= ? , FONCTION_USER = ? , ADRESSE_USER = ? , TELEPHONE_USER = ? WHERE ID_USER= ?";
        PreparedStatement ps = connexion.prepareStatement(query);

        ps.setString(1, unUtilisateur.getNom());
        ps.setString(2, unUtilisateur.getPrenom());
        ps.setString(3, unUtilisateur.getMdp());
        ps.setString(4, unUtilisateur.getEmail());
        ps.setString(5, unUtilisateur.getFonction());
        ps.setString(6, unUtilisateur.getAdresse());
        ps.setString(7, unUtilisateur.getTel());
        ps.setInt(8, unUtilisateur.getId());

        ps.executeUpdate();

    }

    public void delete(int userId) throws SQLException {
        String query = "DELETE FROM utilisateur WHERE ID_USER = ?";
        PreparedStatement ps = connexion.prepareStatement(query);

        ps.setInt(1, userId);

        ps.executeUpdate();
    }

    public Utilisateur getUserById(int userId) throws SQLException {
        String query = "SELECT * FROM utilisateur WHERE ID_USER = ?";
        PreparedStatement ps = connexion.prepareStatement(query);
        ps.setInt(1, userId);

        ResultSet result = ps.executeQuery();
        if (result.next()) {
            int id = result.getInt("ID_USER");
            String nom = result.getString("NOM_USER");
            String prenom = result.getString("PRENOM_USER");
            String mdp = result.getString("MDP_USER");
            String email = result.getString("EMAIL_USER");
            String fonction = result.getString("FONCTION_USER");
            String adresse = result.getString("ADRESSE_USER");
            String tel = result.getString("TELEPHONE_USER");
            return new Utilisateur(id, nom, prenom, mdp, email, fonction, adresse, tel);
        } else {
            return null; // User not found with the given ID
        }
    }

}
