/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package icad2admin.view;

import icad2admin.HashTool;
import icad2admin.controller.AddController;
import icad2admin.model.Utilisateur;
import icad2admin.model.UtilisateurDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author a.andissac
 */
public class AddUserDialog extends javax.swing.JDialog {

    MainFrame mainFrame = null;
    UtilisateurDAO dao = new UtilisateurDAO();
    AddController addUser = new AddController(dao, this);

    /**
     * Creates new form AddUserDialog
     */
    public AddUserDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.mainFrame = (MainFrame) parent;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        addButon = new javax.swing.JButton();
        jTextNom = new javax.swing.JTextField();
        nomLabel = new javax.swing.JLabel();
        prenomLabel = new javax.swing.JLabel();
        jTextPrenom = new javax.swing.JTextField();
        metierLabel = new javax.swing.JLabel();
        jBoxMetier = new javax.swing.JComboBox<>();
        mailLabel = new javax.swing.JLabel();
        jTextMail = new javax.swing.JTextField();
        mdpLabel = new javax.swing.JLabel();
        adresseLabel = new javax.swing.JLabel();
        jTextAdresse = new javax.swing.JTextField();
        jTextTelephone = new javax.swing.JTextField();
        telephoneLabel = new javax.swing.JLabel();
        jPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        titleLabel.setText("Ajouter un utilisateur");

        addButon.setText("Ajouter");
        addButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButonActionPerformed(evt);
            }
        });

        jTextNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNomActionPerformed(evt);
            }
        });

        nomLabel.setText("Nom :");

        prenomLabel.setText("Prénom :");

        jTextPrenom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPrenomActionPerformed(evt);
            }
        });

        metierLabel.setText("Métier :");

        jBoxMetier.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Veterinaire", "Policier", "Eleveur" }));
        jBoxMetier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBoxMetierActionPerformed(evt);
            }
        });

        mailLabel.setText("Mail :");

        jTextMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextMailActionPerformed(evt);
            }
        });

        mdpLabel.setText("Mot de passe :");

        adresseLabel.setText("Adresse :");

        jTextAdresse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextAdresseActionPerformed(evt);
            }
        });

        jTextTelephone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextTelephoneActionPerformed(evt);
            }
        });

        telephoneLabel.setText("Téléphone :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(342, 342, 342)
                        .addComponent(titleLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(addButon, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(adresseLabel)
                                        .addComponent(mdpLabel)
                                        .addComponent(telephoneLabel))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextAdresse, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(21, 21, 21)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(prenomLabel)
                                        .addComponent(nomLabel)
                                        .addComponent(metierLabel)
                                        .addComponent(mailLabel))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextNom, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jBoxMetier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextMail, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(347, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(titleLabel)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomLabel)
                    .addComponent(jTextNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prenomLabel)
                    .addComponent(jTextPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(metierLabel)
                    .addComponent(jBoxMetier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mailLabel)
                    .addComponent(jTextMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mdpLabel)
                    .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adresseLabel)
                    .addComponent(jTextAdresse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telephoneLabel)
                    .addComponent(jTextTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(addButon, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButonActionPerformed
        addUser.addButtonAction();
        this.mainFrame.updateUI();

//     main.updateUI();

    }//GEN-LAST:event_addButonActionPerformed

    private void jTextNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNomActionPerformed

    private void jTextPrenomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPrenomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPrenomActionPerformed

    private void jTextMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextMailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextMailActionPerformed

    private void jTextAdresseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextAdresseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextAdresseActionPerformed

    private void jTextTelephoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextTelephoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextTelephoneActionPerformed

    private void jBoxMetierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBoxMetierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBoxMetierActionPerformed

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
            java.util.logging.Logger.getLogger(AddUserDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddUserDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddUserDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddUserDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddUserDialog dialog = new AddUserDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton addButon;
    private javax.swing.JLabel adresseLabel;
    private javax.swing.JComboBox<String> jBoxMetier;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JTextField jTextAdresse;
    private javax.swing.JTextField jTextMail;
    private javax.swing.JTextField jTextNom;
    private javax.swing.JTextField jTextPrenom;
    private javax.swing.JTextField jTextTelephone;
    private javax.swing.JLabel mailLabel;
    private javax.swing.JLabel mdpLabel;
    private javax.swing.JLabel metierLabel;
    private javax.swing.JLabel nomLabel;
    private javax.swing.JLabel prenomLabel;
    private javax.swing.JLabel telephoneLabel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables

    public String getNom() {
        return jTextNom.getText(); 
    }

    public String getPrenom() {
        return jTextPrenom.getText();
    }

    public String getMail() {
        return jTextMail.getText();
    }

    public String getMetier() {
        return jBoxMetier.getSelectedItem().toString();
    }

    public String getAdresse() {
        return jTextAdresse.getText();
    }

    public String getTelephone() {
        return jTextTelephone.getText();
    }

    public Object getPassword() {
        return new String(HashTool.hash(String.valueOf(jPassword.getPassword())));
    }
}
