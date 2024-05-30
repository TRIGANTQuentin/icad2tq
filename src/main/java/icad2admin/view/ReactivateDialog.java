/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package icad2admin.view;

import icad2admin.controller.MainController;
import icad2admin.model.Utilisateur;
import icad2admin.model.UtilisateurDAO;
import java.util.List;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author q.trigand
 */
public class ReactivateDialog extends javax.swing.JDialog {

    MainFrame mainFrame = null;
    UtilisateurDAO dao = new UtilisateurDAO();
    MainController reactivateUser = new MainController(dao);
    
     public ReactivateDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.mainFrame = (MainFrame) parent;
        this.updateUI();
         tableListeUserSupprime.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                updateModifierButtonState();

            }
        });
        updateModifierButtonState();
    }
      private void updateModifierButtonState() {
        int selectRow = tableListeUserSupprime.getSelectedRowCount();
        reactivate.setEnabled(selectRow > 0);
    }
      
      public void updateUI() {
        DefaultTableModel tblModel = (DefaultTableModel) tableListeUserSupprime.getModel();
        UtilisateurDAO dao = new UtilisateurDAO();
        List<Utilisateur> utilisateurs = dao.getAllDelete();

        tblModel.setRowCount(0);

        for (Utilisateur utilisateur : utilisateurs) {
            Object[] data = {utilisateur.getId(), utilisateur.getNom(), utilisateur.getPrenom(), utilisateur.getMdp(), utilisateur.getEmail(), utilisateur.getFonction(), utilisateur.getAdresse(), utilisateur.getTel()};
            tblModel.addRow(data);
        }
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        listeUserSuppr = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableListeUserSupprime = new javax.swing.JTable();
        reactivate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        listeUserSuppr.setText("Liste des utilisateurs supprimer");

        tableListeUserSupprime.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID_USER", "NOM_USER", "PRENOM_USER", "MDP_USER", "EMAIL_USER", "FONCTION_USER", "ADRESSE_USER", "TELEPHONE_USER"
            }
        ));
        tableListeUserSupprime.setDoubleBuffered(true);
        tableListeUserSupprime.setDragEnabled(true);
        jScrollPane1.setViewportView(tableListeUserSupprime);

        reactivate.setText("Réactiver");
        reactivate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reactivateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(listeUserSuppr))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 825, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(reactivate)
                .addGap(54, 54, 54))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(listeUserSuppr)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(reactivate)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void reactivateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reactivateActionPerformed
        reactivateUser.reactivateUser(tableListeUserSupprime);
        this.mainFrame.updateUI();
    }//GEN-LAST:event_reactivateActionPerformed

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
            java.util.logging.Logger.getLogger(ReactivateDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReactivateDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReactivateDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReactivateDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ReactivateDialog dialog = new ReactivateDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel listeUserSuppr;
    private javax.swing.JButton reactivate;
    private javax.swing.JTable tableListeUserSupprime;
    // End of variables declaration//GEN-END:variables
}
