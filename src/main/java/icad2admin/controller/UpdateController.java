/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icad2admin.controller;

import icad2admin.HashTool;
import icad2admin.model.Utilisateur;
import icad2admin.model.UtilisateurDAO;
import icad2admin.view.UpdateUserDialog;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author q.trigand
 */
public class UpdateController {
     
    private final UtilisateurDAO utilisateurDAO;
    private final UpdateUserDialog view; 

    public UpdateController(UtilisateurDAO utilisateurDAO, UpdateUserDialog view) {
        this.utilisateurDAO = utilisateurDAO;
        this.view = view;

    }
    public void updateButtonAction() {
        int id = view.getId();
        String nom = view.getNom();
        String prenom = view.getPrenom();
        String mdp = new String(HashTool.hash(String.valueOf(view.getPassword())));
        String mail = view.getMail();
        String metier = view.getMetier();
        String adresse = view.getAdresse();
        String telephone = view.getTelephone();

        try {
            Utilisateur utilisateur = new Utilisateur(id, nom, prenom, mdp, mail, metier, adresse, telephone);
            utilisateurDAO.update(utilisateur);
            JOptionPane.showMessageDialog(null, "Utilisateur modifie avec succès!", "Succès", JOptionPane.INFORMATION_MESSAGE);
            view.dispose(); 
        } catch (SQLException ex) {
            Logger.getLogger(AddController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Une erreur est survenue lors de la modification de l'utilisateur.", "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }
    
       
    
    
}
