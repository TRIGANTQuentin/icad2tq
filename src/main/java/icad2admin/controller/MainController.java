/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icad2admin.controller;

import icad2admin.model.UtilisateurDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Q.trigand
 */
public class MainController {
   

    private final UtilisateurDAO utilisateurDAO;

    public MainController(UtilisateurDAO utilisateurDAO) {
        this.utilisateurDAO = utilisateurDAO;
    }

    public void deleteUser(JTable tableListeUser) {
        int[] selectedRows = tableListeUser.getSelectedRows();

        int confirmation = JOptionPane.showConfirmDialog(null, "Etes vous sûr de vouloir supprimer cet utilisateur ? Il sera possible de le réactiver après suppression ! ", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (confirmation != JOptionPane.YES_OPTION) {
            selectedRows = new int[0];
            return;
        }

        for (int i = selectedRows.length - 1; i >= 0; i--) {
            int userId = (int) tableListeUser.getValueAt(selectedRows[i], 0);
            try {
                utilisateurDAO.delete(userId);
                ((DefaultTableModel) tableListeUser.getModel()).removeRow(selectedRows[i]);
            
            } catch (SQLException ex) {
                Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Une erreur s'est produise lors de la supression de l'utilisateur.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    public void reactivateUser(JTable tableListeUserSupprime) {
        int[] selectedRows = tableListeUserSupprime.getSelectedRows();

        int confirmation = JOptionPane.showConfirmDialog(null, "Etes vous sûr de vouloir réactiver cet utilisateur ?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (confirmation != JOptionPane.YES_OPTION) {
            selectedRows = new int[0];
            return;
        }

        for (int i = selectedRows.length - 1; i >= 0; i--) {
            int userId = (int) tableListeUserSupprime.getValueAt(selectedRows[i], 0);
            try {
                utilisateurDAO.reactivate(userId);
                ((DefaultTableModel) tableListeUserSupprime.getModel()).removeRow(selectedRows[i]);
            
            } catch (SQLException ex) {
                Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Une erreur s'est produise lors de la réactivation de l'utilisateur.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}

    

