/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package icad2admin.view;

import icad2admin.controller.MainController;
import icad2admin.model.Utilisateur;
import icad2admin.model.UtilisateurDAO;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author a.andissac
 */
public class MainFrame extends javax.swing.JFrame {

    UtilisateurDAO dao = new UtilisateurDAO();
    MainController deleterUser = new MainController(dao);

    public MainFrame() {
        initComponents();
        this.updateUI();
        tableListeUser.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                updateModifierButtonState();

            }
        });
        updateModifierButtonState();

    }

    private void updateModifierButtonState() {
        int selectRow = tableListeUser.getSelectedRowCount();
        ButtonModifier.setEnabled(selectRow == 1);
        ButtonSupprimer.setEnabled(selectRow > 0);
    }

    public void updateUI() {
        DefaultTableModel tblModel = (DefaultTableModel) tableListeUser.getModel();
        UtilisateurDAO dao = new UtilisateurDAO();
        List<Utilisateur> utilisateurs = dao.getAll();

        tblModel.setRowCount(0);

        for (Utilisateur utilisateur : utilisateurs) {
            Object[] data = {utilisateur.getId(), utilisateur.getNom(), utilisateur.getPrenom(), utilisateur.getMdp(), utilisateur.getEmail(), utilisateur.getFonction(), utilisateur.getAdresse(), utilisateur.getTel()};
            tblModel.addRow(data);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelListe = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableListeUser = new javax.swing.JTable();
        ButtonAjouter = new javax.swing.JButton();
        ButtonSupprimer = new javax.swing.JButton();
        ButtonModifier = new javax.swing.JButton();
        ButtonReactiver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Icad2Admin");

        labelListe.setText("Liste des Utilisateurs");

        tableListeUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID_USER", "NOM_USER", "PRENOM_USER", "MDP_USER", "EMAIL_USER", "FONCTION_USER", "ADRESSE_USER", "TELEPHONE_USER"
            }
        ));
        tableListeUser.setDoubleBuffered(true);
        tableListeUser.setDragEnabled(true);
        jScrollPane1.setViewportView(tableListeUser);
        tableListeUser.getAccessibleContext().setAccessibleName("");

        ButtonAjouter.setText("Ajouter");
        ButtonAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAjouterActionPerformed(evt);
            }
        });

        ButtonSupprimer.setText("Supprimer");
        ButtonSupprimer.setEnabled(false);
        ButtonSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSupprimerActionPerformed(evt);
            }
        });

        ButtonModifier.setText("Modifier");
        ButtonModifier.setEnabled(false);
        ButtonModifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonModifierActionPerformed(evt);
            }
        });

        ButtonReactiver.setText("Réactiver");
        ButtonReactiver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonReactiverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(ButtonModifier)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ButtonSupprimer)
                .addGap(82, 82, 82))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(labelListe, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(235, 235, 235))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ButtonReactiver)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ButtonAjouter)))
                        .addGap(38, 38, 38))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(labelListe)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonAjouter)
                    .addComponent(ButtonReactiver))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonSupprimer)
                    .addComponent(ButtonModifier))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAjouterActionPerformed

        AddUserDialog addUserDialog = new AddUserDialog(this, true);
        addUserDialog.setVisible(true);
    }//GEN-LAST:event_ButtonAjouterActionPerformed

    private void ButtonModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonModifierActionPerformed
        int ligneSelectionnee = tableListeUser.getSelectedRow();
        if (ligneSelectionnee >= 0) { 
            int idUtilisateur = (int) tableListeUser.getValueAt(ligneSelectionnee, 0); 
            try {
                Utilisateur utilisateurSelectionne = dao.getUserById(idUtilisateur); 
            } catch (SQLException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            Utilisateur selectedUser = null;
            try {
                selectedUser = dao.getUserById(idUtilisateur);
            } catch (SQLException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            UpdateUserDialog updateUserDialog = new UpdateUserDialog(this, true, selectedUser);
            updateUserDialog.setVisible(true);
        }
    }//GEN-LAST:event_ButtonModifierActionPerformed

    private void ButtonSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSupprimerActionPerformed

        deleterUser.deleteUser(tableListeUser);

    }//GEN-LAST:event_ButtonSupprimerActionPerformed

    private void ButtonReactiverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonReactiverActionPerformed
        ReactivateDialog reactivateUser = new ReactivateDialog(this, true);
        reactivateUser.setVisible(true);
    }//GEN-LAST:event_ButtonReactiverActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAjouter;
    private javax.swing.JButton ButtonModifier;
    private javax.swing.JButton ButtonReactiver;
    private javax.swing.JButton ButtonSupprimer;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelListe;
    private javax.swing.JTable tableListeUser;
    // End of variables declaration//GEN-END:variables
}
